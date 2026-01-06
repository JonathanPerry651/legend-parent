
load("@bazel_tools//tools/jdk:toolchain_utils.bzl", "find_java_toolchain")

def _partitioned_java_library_impl(ctx):
    # Toolchain
    java_toolchain = find_java_toolchain(ctx, ctx.attr._java_toolchain)
    
    # 1. Partition Analysis (Generate Manifest)
    src_jar = ctx.file.src
    manifest = ctx.actions.declare_file(ctx.label.name + "_manifest.json")
    
    # Tool args: --input <src> --output <json> --layers <L> --shards <N>
    args = ctx.actions.args()
    args.add("--input", src_jar)
    args.add("--output", manifest)
    args.add("--layers", str(ctx.attr.layers))
    args.add("--shards", str(ctx.attr.shards))
    
    ctx.actions.run(
        outputs = [manifest],
        inputs = [src_jar],
        executable = ctx.executable._partitioner_tool,
        arguments = [args],
        mnemonic = "JavaPartitionAnalysis",
        progress_message = "Analyzing %s for partitioning" % ctx.label.name,
    )

    # 2. Layered Compilation Graph
    # Matrix of JavaInfo providers: layer_infos[layer_index] = [info_shard0, info_shard1...]
    layer_provider_lists = [] 
    
    # Initial deps (Layer -1)
    # We treat original deps as the inputs for Layer 0
    current_deps = [d[JavaInfo] for d in ctx.attr.deps]
    all_infos = []

    for l in range(ctx.attr.layers):
        current_layer_infos = []
        
        # Merge deps from previous layer into a single list for safety/convenience?
        # Actually java_common.compile takes list of targets/infos.
        # If Layer L depends on all Layer L-1, we just pass all providers from L-1.
        
        # Constraint: If this is the first layer, we use 'deps'. 
        # If not, we use the providers from the previous layer + original deps?
        # Typically internal shards should depend on original deps too (external libs).
        # So 'deps' are ALWAYS included.
        # Plus 'previous layer's infos'.

        # Note: If Layer 0, previous_layer_infos is empty.
        layer_deps = current_deps + (layer_provider_lists[-1] if len(layer_provider_lists) > 0 else [])

        for s in range(ctx.attr.shards):
            # A. Extract Shard
            shard_jar = ctx.actions.declare_file("%s_L%d_S%d.srcjar" % (ctx.label.name, l, s))
            
            extract_args = ctx.actions.args()
            extract_args.add("--mode", "extract")
            extract_args.add("--input", src_jar)
            extract_args.add("--output", shard_jar)
            extract_args.add("--manifest", manifest)
            extract_args.add("--layer", str(l))
            extract_args.add("--shard", str(s))
            
            ctx.actions.run(
                outputs = [shard_jar],
                inputs = [src_jar, manifest],
                executable = ctx.executable._partitioner_tool,
                arguments = [extract_args],
                mnemonic = "JavaShardExtract",
                progress_message = "Extracting Shard L%d/S%d for %s" % (l, s, ctx.label.name),
            )
            
            # B. Compile Shard
            # Output jar
            output_jar = ctx.actions.declare_file("lib%s_L%d_S%d.jar" % (ctx.label.name, l, s))
            
            # We use java_common.compile
            # It returns a JavaInfo provider.
            # We need to explicitly providing output file name? 
            # java_common.compile output comes from 'output' arg or defaults?
            # It usually generates output based on name/rule.
            # But here we in a loop.
            # We use 'output_jar' as the explicit output.
            
            compilation_provider = java_common.compile(
                ctx,
                source_jars = [shard_jar],
                deps = layer_deps,
                java_toolchain = java_toolchain,
                javac_opts = ctx.attr.javacopts,
                strict_deps = "OFF",
                output = output_jar,
            )
            
            current_layer_infos.append(compilation_provider)
            all_infos.append(compilation_provider)
        
        # End of Shard Loop
        layer_provider_lists.append(current_layer_infos)
    
    # 3. Merge Results
    # We return a merged provider of ALL shards.
    # This ensures that any consumer of this rule sees all classes generated.
    merged_info = java_common.merge(all_infos)
    
    return [
        DefaultInfo(files = depset([info.outputs.jars[0].class_jar for info in all_infos if info.outputs.jars])),
        merged_info
    ]

partitioned_java_library = rule(
    implementation = _partitioned_java_library_impl,
    attrs = {
        "src": attr.label(allow_single_file = True, mandatory = True),
        "deps": attr.label_list(providers = [JavaInfo]),
        "layers": attr.int(default = 10),
        "shards": attr.int(default = 8),
        "javacopts": attr.string_list(default = []),
        "_partitioner_tool": attr.label(
            default = Label("//tools/partitioner:JavaSourcePartitioner"),
            executable = True,
            cfg = "exec",
        ),
        "_java_toolchain": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_toolchain"),
        ),
    },
    fragments = ["java"],
    provides = [JavaInfo],
    toolchains = ["@bazel_tools//tools/jdk:toolchain_type"],
)

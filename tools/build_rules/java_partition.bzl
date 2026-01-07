
load("@bazel_tools//tools/jdk:toolchain_utils.bzl", "find_java_toolchain")

def _partitioned_java_library_impl(ctx):
    # Toolchain
    java_toolchain = find_java_toolchain(ctx, ctx.attr._java_toolchain)
    
    src_jar = ctx.file.src
    layers = ctx.attr.layers
    shards = ctx.attr.shards
    
    # 1. Declare all output shards upfront
    # We need a flat list for arguments, but structured access for compilation
    shard_outputs = [] 
    shard_outputs_grid = {} # Map (layer, shard) -> file

    for l in range(layers):
        for s in range(shards):
            f = ctx.actions.declare_file("%s_L%d_S%d.srcjar" % (ctx.label.name, l, s))
            shard_outputs.append(f)
            shard_outputs_grid[(l, s)] = f

    # 2. Run Partitioner (Explode)
    # Args: <numLayers> <numShards> <outputFile_0_0> ... <outputFile_L_S> <inputSrcJar>
    args = ctx.actions.args()
    args.add(str(layers))
    args.add(str(shards))
    args.add_all(shard_outputs)
    args.add(src_jar)
    
    ctx.actions.run(
        outputs = shard_outputs,
        inputs = [src_jar],
        executable = ctx.executable._partitioner_tool,
        arguments = [args],
        mnemonic = "JavaPartitionExplode",
        progress_message = "Partitioning %s into %d layers x %d shards" % (ctx.label.name, layers, shards),
    )

    # 3. Layered Compilation Graph
    layer_provider_lists = [] 
    
    # Initial deps (Layer -1)
    current_deps = [d[JavaInfo] for d in ctx.attr.deps]
    all_infos = []

    for l in range(layers):
        current_layer_infos = []
        
        # Include deps from previous layer
        layer_deps = current_deps + (layer_provider_lists[-1] if len(layer_provider_lists) > 0 else [])

        for s in range(shards):
            shard_jar = shard_outputs_grid[(l, s)]
            
            # Compile Shard
            output_jar = ctx.actions.declare_file("lib%s_L%d_S%d.jar" % (ctx.label.name, l, s))
            
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
        
        layer_provider_lists.append(current_layer_infos)
    
    # 4. Merge Results
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

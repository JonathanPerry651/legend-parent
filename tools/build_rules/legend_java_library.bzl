load("//tools:zip_tree_artifacts.bzl", "zip_tree_artifacts")
load("//tools/build_rules:pure_generation.bzl", "PureModuleInfo")
load("@rules_java//java:defs.bzl", "java_common")
load("//tools/build_rules:java_partition.bzl", "partitioned_java_library")
load("//tools/build_rules:java_validation.bzl", "java_import_validation")

# --- Internal Rules ---

# Rule for pure_sources generation (ports from pure_compiled.bzl and pure.bzl)
def _pure_sources_gen_impl(ctx):
    srcjar = ctx.outputs.srcjar
    metadata_jar = ctx.outputs.metadata_jar
    
    classes_dir = ctx.actions.declare_directory(ctx.label.name + "_classes")
    target_dir = ctx.actions.declare_directory(ctx.label.name + "_target")
    tool_output = ctx.actions.declare_file(ctx.label.name + "_tool_output.txt")
    
    # Internal directories for processing
    meta_root = ctx.actions.declare_directory(ctx.label.name + "_meta_tmp")
    merged_dir = ctx.actions.declare_directory(ctx.label.name + "_merged_tmp")
    
    # Exclusions script
    rm_cmds = []
    for excl in ctx.attr.exclusions:
         rm_cmds.append("rm -rf \"$dest_dir\"/{excl}".format(excl = excl))
    exclusions_script = "\n".join(rm_cmds)

    # Collect dependencies for classpath
    # 1. Transitive runtime jars from module deps
    # 2. Interface jars from PureModuleInfo in module deps
    
    classpath_jars = []
    
    for dep in ctx.attr.module_deps:
        if JavaInfo in dep:
            classpath_jars.append(dep[JavaInfo].transitive_runtime_jars)
        if PureModuleInfo in dep and dep[PureModuleInfo].interface_jars:
            classpath_jars.append(dep[PureModuleInfo].interface_jars)
            
    all_jars = depset(transitive = classpath_jars)
    classpath_fs = all_jars.to_list()
    
    classpath_args = ""
    if classpath_fs:
        # Construct classpath string. Bazel paths are weird, use path
        classpath_str = ":".join([j.path for j in classpath_fs])
        classpath_args = "--main_advice_classpath=" + classpath_str

    command = """
        set -e
        # 1. Setup and Run Generator
        mkdir -p {classes_path} {target_path}
        
        # We need to ensure the wrapper script handles the flag correctly.
        # But we are running the tool executable directly.
        # Wait, if 'generator' is a java_binary, ctx.executable.generator is the wrapper script.
        # The wrapper script accepts --main_advice_classpath.
        
        {tool_path} {classpath_args} {repo} {classes_path} {target_path} > {out_path} 2>&1 || (cat {out_path} && exit 1)

        
        # 2. Extract Metadata
        mkdir -p {meta_root}
        if [ -d "{classes_path}/metadata" ]; then
            cp -r "{classes_path}/metadata" {meta_root}/
            
            # Platform Fixup: Monolithic generation produces un-namespaced metadata.
            # We need to move it into '{repo}' directory to satisfy modular deserializers.
            pushd "{meta_root}" > /dev/null
            
            # Fixup loop
            for dir in metadata/*; do
                dirname=$(basename "$dir")
                # Do not namespace 'specs', they must remain at the root of metadata/specs/
                if [ "$dirname" = "specs" ]; then
                    continue
                fi
                
                if [ -d "$dir" ] && [ ! -d "$dir/{repo}" ]; then
                     mkdir -p "$dir/{repo}"
                     find "$dir" -mindepth 1 -maxdepth 1 ! -name {repo} -exec mv {{}} "$dir/{repo}/" \\;
                fi
            done
            
            popd > /dev/null
        fi
        # Also include PAR files
        if [ -d "{classes_path}" ]; then
            find {classes_path} -maxdepth 1 -name "*.par" -exec cp {{}} {meta_root}/ \\;
        fi

        
        # 3. Merge Sources
        mkdir -p {merged_path}
        cp {out_path} {merged_path}/
        if [ -d "{target_path}/generated-sources" ]; then
            cp -r "{target_path}/generated-sources"/. {merged_path}/
        fi
        if [ -d "{target_path}/generated-test-sources" ]; then
            cp -r "{target_path}/generated-test-sources"/. {merged_path}/
        fi
        if [ "{include_metadata}" = "True" ] && [ -f "{target_path}/dependencies.json" ]; then
            cp "{target_path}/dependencies.json" {merged_path}/
        fi
        
        # Apply exclusions
        dest_dir="{merged_path}"
        {exclusions}
    """.format(
        tool_path = ctx.executable.generator.path,
        classpath_args = classpath_args,
        repo = ctx.attr.repository,
        classes_path = classes_dir.path,
        target_path = target_dir.path,
        out_path = tool_output.path,
        meta_root = meta_root.path,
        merged_path = merged_dir.path,
        exclusions = exclusions_script,
        include_metadata = ctx.attr.include_metadata,
    )
    
    ctx.actions.run_shell(
        outputs = [classes_dir, target_dir, tool_output, meta_root, merged_dir],
        inputs = ctx.files.srcs + classpath_fs,
        tools = [ctx.executable.generator],
        command = command,
        mnemonic = "LegendPureJavaCodeGen",
        progress_message = "Generating Pure sources for repository '%s'" % ctx.attr.repository,
    )

    # Zipping remains as separate steps since they use zip_tree_artifacts
    zip_tree_artifacts(
        ctx,
        output = metadata_jar,
        inputs = [meta_root],
        java_runtime_target = ctx.attr._jdk,
    )
    
    zip_tree_artifacts(
        ctx,
        output = srcjar,
        inputs = [merged_dir],
        java_runtime_target = ctx.attr._jdk,
    )
    
    return [DefaultInfo(files = depset([srcjar, metadata_jar]))]

_pure_sources_gen = rule(
    implementation = _pure_sources_gen_impl,
    attrs = {
        "srcs": attr.label_list(allow_files = True),
        "module_deps": attr.label_list(providers = [JavaInfo]),
        "repository": attr.string(mandatory = True),
        "generator": attr.label(mandatory = True, executable = True, cfg = "exec"),
        "exclusions": attr.string_list(default = []),
        "include_metadata": attr.bool(default = False),
        "_jdk": attr.label(default = Label("@bazel_tools//tools/jdk:current_java_runtime"), providers = [java_common.JavaRuntimeInfo]),
    },
    outputs = {
        "srcjar": "%{name}.srcjar",
        "metadata_jar": "%{name}_metadata.jar",
    },
)

# Rule for java_model_generation (ported from java_model_generation.bzl)
def _java_model_gen_impl(ctx):
    output_jar = ctx.outputs.srcjar
    
    # 1. Setup and Run Generator
    gen_dir = ctx.actions.declare_directory(ctx.label.name + "_gen_raw")
    
    inclusions = ctx.attr.inclusions
    exclusions = ctx.attr.exclusions
    
    gen_command = """
        set -e
        mkdir -p {gen_dir}
        if ! {tool} {model_name} {factory_class} {gen_dir}/ > {gen_dir}/gen.log 2>&1; then
            echo "Generator Failed. Output:"
            cat {gen_dir}/gen.log
            exit 1
        fi
        
        if [ ! -z "{inclusions}" ]; then
            # If we have inclusions, move the raw output to a temp place and only copy back what we want
            mkdir -p {gen_dir}_tmp
            mv {gen_dir}/* {gen_dir}_tmp/
            mkdir -p {gen_dir}
            for inc in {inclusions_list}; do
                if [ -f "{gen_dir}_tmp/$inc" ]; then
                   mkdir -p $(dirname "{gen_dir}/$inc")
                   cp "{gen_dir}_tmp/$inc" "{gen_dir}/$inc"
                fi
            done
        fi

        if [ ! -z "{exclusions}" ]; then
            for excl in {exclusions_list}; do
                rm -rf "{gen_dir}/$excl"
            done
        fi
        
        cd {gen_dir}
        zip -q -r "$OUTPUT_JAR" .
    """.format(
        gen_dir = gen_dir.path,
        tool = ctx.executable.tool.path,
        model_name = ctx.attr.model_name,
        factory_class = ctx.attr.factory_class,
        inclusions = " ".join(inclusions) if inclusions else "",
        inclusions_list = " ".join(["\"" + i + "\"" for i in inclusions]) if inclusions else "",
        exclusions = " ".join(exclusions) if exclusions else "",
        exclusions_list = " ".join(["\"" + e + "\"" for e in exclusions]) if exclusions else "",
    )
    
    ctx.actions.run_shell(
        outputs = [output_jar, gen_dir],
        inputs = ctx.files.srcs,
        tools = [ctx.executable.tool],
        command = "OUTPUT_JAR=$(pwd)/{output_jar_path} \n".format(output_jar_path = output_jar.path) + gen_command,
        mnemonic = "LegendModelGen",
        progress_message = "Generating Java Model %s" % ctx.label.name,
    )
    
    return [DefaultInfo(files = depset([output_jar]))]

_java_model_gen = rule(
    implementation = _java_model_gen_impl,
    attrs = {
        "srcs": attr.label_list(allow_files = True),
        "model_name": attr.string(mandatory = True),
        "factory_class": attr.string(mandatory = True),
        "inclusions": attr.string_list(default = []),
        "exclusions": attr.string_list(default = []),
        "tool": attr.label(
            default = Label("//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:JavaModelFactoryGenerator"),
            executable = True,
            cfg = "exec",
        ),
    },
    outputs = {"srcjar": "%{name}.srcjar"},
)

# Helper rule to merge multiple sources into a single srcjar
def _srcjar_merger_impl(ctx):
    output = ctx.outputs.srcjar
    tmp_dir = ctx.actions.declare_directory(ctx.label.name + "_merge_tmp")
    
    commands = ["set -e", "mkdir -p " + tmp_dir.path]
    inputs = []
    
    # Process jars/srcjars
    for src in ctx.files.srcjars:
        commands.append("unzip -q -o %s -d %s" % (src.path, tmp_dir.path))
        inputs.append(src)
        
    # Process manual srcs
    src_root = ctx.attr.src_root
    for src in ctx.files.srcs:
        # Only include .java files in the source jar
        if src.extension != "java":
            continue
            
        path = src.path
        if src_root and path.startswith(src_root):
            rel_path = path[len(src_root):].lstrip("/")
        else:
            # Fallback to basename for flat structure if no root matches? 
            # Or just use the original path which might be wrong for package structure.
            # Best is to fail or require src_root.
            rel_path = src.short_path
            
        dest = tmp_dir.path + "/" + rel_path
        commands.append("mkdir -p $(dirname %s) && cp %s %s" % (dest, src.path, dest))
        inputs.append(src)
            
    # Final zip using zip_tree_artifacts for consistency
    zip_tree_artifacts(
        ctx,
        output = output,
        inputs = [tmp_dir],
        java_runtime_target = ctx.attr._jdk,
    )
    
    ctx.actions.run_shell(
        inputs = inputs,
        outputs = [tmp_dir],
        command = "\n".join(commands),
        mnemonic = "SrcJarMergePrep",
        progress_message = "Preparing merged sources for %s" % output.short_path,
    )
    
    return [DefaultInfo(files = depset([output]))]

_srcjar_merger = rule(
    implementation = _srcjar_merger_impl,
    attrs = {
        "srcs": attr.label_list(allow_files = True),
        "srcjars": attr.label_list(allow_files = True),
        "src_root": attr.string(),
        "_jdk": attr.label(default = Label("@bazel_tools//tools/jdk:current_java_runtime"), providers = [java_common.JavaRuntimeInfo]),
    },
    outputs = {"srcjar": "%{name}.srcjar"},
)

# Bridge rule to export PureModuleInfo
# Bridge rule to export PureModuleInfo
def _pure_lib_bridge_impl(ctx):
    interface_jars = depset([])
    
    if ctx.attr.interface_library:
        interface_lib = ctx.attr.interface_library[JavaInfo]
        # We can either use the compile jars or runtime jars of the interface lib.
        # Interfaces are needed for compilation of dependent modules AND for runtime execution of the generator.
        # Let's use transitive_runtime_jars to be safe and include everything needed.
        interface_jars = interface_lib.transitive_runtime_jars
    
    return [
        PureModuleInfo(
            pure_repository = ctx.attr.pure_repository,
            interface_jars = interface_jars,
        ),
        ctx.attr.lib[JavaInfo],
        ctx.attr.lib[DefaultInfo],
    ]

_pure_lib_bridge = rule(
    implementation = _pure_lib_bridge_impl,
    attrs = {
        "lib": attr.label(mandatory = True, providers = [JavaInfo]),
        "pure_repository": attr.string(mandatory = True),
        "interface_library": attr.label(providers = [JavaInfo], allow_single_file = False),
    },
)

# --- PUBLIC MACRO ---

def legend_java_library(
    name,
    srcs = [],
    deps = [],
    pure_repository = None,
    pure_generator = Label("//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:JavaCodeGeneration"),
    # pure_generator_lib is no longer strictly needed for wrapper generation but might be implicitly used?
    # We remove it since we don't generate wrapper anymore.
    pure_interface_library = None,
    pure_module_deps = [],
    pure_srcs = [],
    pure_exclusions = [],
    include_metadata = False,
    model_name = None,
    model_factory_class = None,
    model_srcs = [],
    model_inclusions = [],
    model_exclusions = [],
    model_generator = Label("//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:JavaModelFactoryGenerator"),
    src_root = "",
    layers = 0,
    shards = 0,
    validate = False,
    javacopts = [],
    visibility = None,
    **kwargs
):
    # legend_java_library logic follows
    
    all_srcjars = []
    
    # 1. Handle Pure source generation
    if pure_repository:
        gen_p_name = name + "_pure_gen"

        # Combine explicit module deps with the interface library if present
        gen_deps = list(pure_module_deps)
        if pure_interface_library:
            gen_deps.append(pure_interface_library)
        
        # Deduplicate
        gen_deps = depset(gen_deps).to_list()

        # Pass module deps directly to _pure_sources_gen for classpath construction
        _pure_sources_gen(
            name = gen_p_name,
            repository = pure_repository,
            generator = pure_generator,
            module_deps = gen_deps,
            exclusions = pure_exclusions,
            srcs = pure_srcs,
            include_metadata = include_metadata,
            visibility = ["//visibility:private"],
        )
        all_srcjars.append(":" + gen_p_name + ".srcjar")
        
        if include_metadata:
            native.java_import(
                name = name + "_metadata",
                jars = [":" + gen_p_name + "_metadata.jar"],
                visibility = visibility,
            )

    # 2. Handle Model generation
    if model_name:
        gen_m_name = name + "_model_gen"
        _java_model_gen(
            name = gen_m_name,
            model_name = model_name,
            factory_class = model_factory_class,
            tool = model_generator,
            srcs = model_srcs,
            inclusions = model_inclusions,
            exclusions = model_exclusions,
            visibility = ["//visibility:private"],
        )
        all_srcjars.append(":" + gen_m_name + ".srcjar")
    
    # Determine final sources
    final_srcs = srcs
    final_srcjars = all_srcjars
    
    # Use merger only if needed
    needs_merge = (len(all_srcjars) > 0 and len(srcs) > 0) or len(all_srcjars) > 1 or src_root != ""
    
    if needs_merge:
        merge_name = name + "_src_merged"
        _srcjar_merger(
            name = merge_name,
            srcs = srcs,
            srcjars = all_srcjars,
            src_root = src_root,
            visibility = ["//visibility:private"],
        )
        merge_output = ":" + merge_name + ".srcjar"
    else:
        # Identify the single source jar if it exists
        if len(all_srcjars) == 1:
            merge_output = all_srcjars[0]
        else:
            # Only manual sources or nothing, java_library handles srcs directly
            merge_output = None

    # Prepare dependencies
    actual_deps = deps
    if pure_repository:
         if include_metadata:
            actual_deps = actual_deps + [":" + name + "_metadata"]
         if pure_module_deps:
            actual_deps = actual_deps + pure_module_deps

    # Deduplicate deps
    actual_deps = depset(actual_deps).to_list()

    # Handle wrapping if pure_repository is set
    lib_name = name
    if pure_repository:
        lib_name = name + "_internal"

    if layers > 0 or shards > 0:
        # Partitioned library
        partitioned_java_library(
            name = lib_name,
            src = merge_output if merge_output else ":" + name + "_manual_srcs.srcjar", 
            deps = actual_deps,
            layers = layers,
            shards = shards,
            javacopts = javacopts,
            visibility = visibility if not pure_repository else ["//visibility:private"],
            **kwargs
        )
        if not merge_output:
             # Need to create a srcjar for the manual srcs to satisfy partitioner
             _srcjar_merger(
                name = name + "_manual_srcs",
                srcs = srcs,
                visibility = ["//visibility:private"],
             )
    else:
        # Standard java_library
        # Handle validation
        if validate:
            validation_name = name + "_validation"
            java_import_validation(
                name = validation_name,
                srcs = srcs + all_srcjars,
                deps = deps,
            )
            actual_deps = actual_deps + [":" + validation_name]

        native.java_library(
            name = lib_name,
            srcs = (srcs + all_srcjars) if not merge_output else [merge_output],
            deps = actual_deps,
            javacopts = javacopts,
            visibility = visibility if not pure_repository else ["//visibility:private"],
            **kwargs
        )

    if pure_repository:
        _pure_lib_bridge(
            name = name,
            lib = ":" + lib_name,
            pure_repository = pure_repository,
            interface_library = pure_interface_library,
            visibility = visibility,
            tags = kwargs.get("tags"),
        )

load("//tools:zip_tree_artifacts.bzl", "zip_tree_artifacts")
load("@rules_java//java:defs.bzl", "java_common")

PureGeneratedJavaSourceInfo = provider(fields = ["srcjar"])
PureParInfo = provider(fields = ["par"])

def _pure_model_generation_impl(ctx):
    output_jar = ctx.actions.declare_file(ctx.label.name + ".srcjar")
    gen_dir = ctx.actions.declare_directory(ctx.label.name + "_gen")
    
    tool = ctx.executable.tool
    
    gen_args = ctx.actions.args()
    gen_args.add(gen_dir.path + "/")
    gen_args.add(ctx.attr.model_name)
    gen_args.add(ctx.attr.source_path)
    
    start_with = ctx.attr.file_name_startswith if ctx.attr.file_name_startswith else ""
    if start_with:
        gen_args.add(start_with)
    
    cmd = """
    set -e
    mkdir -p {gen_dir}
    
    {tool_path} {gen_dir}/ {model_name} {source_path}
    """.format(
        gen_dir = gen_dir.path,
        tool_path = ctx.executable.tool.path,
        model_name = ctx.attr.model_name,
        source_path = ctx.attr.source_path,
    )

    tool_runfiles = ctx.attr.tool[DefaultInfo].default_runfiles.files
    ctx.actions.run_shell(
        inputs = ctx.files.srcs + tool_runfiles.to_list(),
        outputs = [gen_dir],
        tools = [ctx.executable.tool],
        command = cmd,
        mnemonic = "PureModelGen",
    )

    zip_tree_artifacts(
        ctx,
        output = output_jar,
        inputs = [gen_dir],
        java_runtime_target = ctx.attr._jdk,
    )

    return [
        DefaultInfo(files = depset([output_jar])),
        PureGeneratedJavaSourceInfo(srcjar = output_jar),
    ]

PURE_PLATFORM_VERSION = "0.0.0-SNAPSHOT"

PureModuleInfo = provider(fields = ["pure_repository", "interface_jars"])

def _pure_par_impl(ctx):
    tool = ctx.executable.tool
    output = ctx.outputs.out
    version = ctx.attr.version
    
    # The target repository to generate PAR for check
    target_repo = ctx.attr.repo_name
    
    if not target_repo:
        # Fallback to inference if absolutely necessary, but explicit repo_name is better.
        # Check deps for PureModuleInfo? 
        # For now, let's enforce repo_name or try to find exactly one from deps if repo_name is missing.
        repos = []
        for dep in ctx.attr.deps:
             if PureModuleInfo in dep:
                 repos.append(dep[PureModuleInfo].pure_repository)
        if len(repos) == 1:
            target_repo = repos[0]
        else:
             fail("repo_name must be specified for pure_par")

    # Collect classpath from deps + tool runfiles
    # Actually, the tool itself runs with its own classpath.
    # We need to ADD the deps to the classpath.
    # But java_binary tool classpath is fixed in the wrapper script.
    # We can use the java executable from the toolchain and construct the classpath manually.
    
    # Collect transitive jars
    transitive_jars = []
    
    # Also collect interface jars from PureModuleInfo
    for dep in ctx.attr.deps:
        if JavaInfo in dep:
            transitive_jars.append(dep[JavaInfo].transitive_runtime_jars)
        if PureModuleInfo in dep and dep[PureModuleInfo].interface_jars:
            transitive_jars.append(dep[PureModuleInfo].interface_jars)
            
    # Also include the tool's runtime jars if they are needed?
    # The tool is PureJarGenerator. It needs its own deps.
    # If we use ctx.executable.tool, it's a script.
    # We probably want to treat the tool as a dependency for the classpath?
    # Or rely on the tool to load classes from the classpath we provide?
    # PureJarGenerator uses the thread context classloader.
    
    # Solution: Run standard java with composed classpath.
    # Classpath = Tool jars + Deps jars.
    
    tool_java_info = ctx.attr.tool[JavaInfo]
    transitive_jars.append(tool_java_info.transitive_runtime_jars)
    
    all_jars = depset(transitive = transitive_jars)
    
    # We need the java runtime
    java_runtime = ctx.attr._jdk[java_common.JavaRuntimeInfo]
    java_bin = java_runtime.java_executable_exec_path
    
    classpath = ":".join([j.path for j in all_jars.to_list()])
    
    # Arguments for PureJarGenerator: version repositories outputDir
    # repositories is comma separated string
    repo_arg = target_repo
    
    # We need to generate into a temp dir and then move/rename to output because the tool does pure-<repo>.par
    # But we might be generating multiple PARs? 
    # Current pure_par rule generates ONE output file.
    
    expected_par_name = "pure-{}.par".format(target_repo)
    
    cmd = """
    set -e
    mkdir -p par_gen_tmp
    
    {java} -cp {classpath} org.finos.legend.pure.m3.generator.par.PureJarGenerator {version} {repo_arg} par_gen_tmp
    
    if [ -f par_gen_tmp/{expected_par_name} ]; then
        mv par_gen_tmp/{expected_par_name} {output}
    else
        echo "Error: Expected PAR file {expected_par_name} not generated."
        ls -R par_gen_tmp
        exit 1
    fi
    
    rm -rf par_gen_tmp
    """.format(
        java = java_bin,
        classpath = classpath,
        version = version,
        repo_arg = repo_arg,
        expected_par_name = expected_par_name,
        output = output.path,
    )
    
    ctx.actions.run_shell(
         inputs = all_jars,
         outputs = [output],
         tools = java_runtime.files,
         command = cmd,
         mnemonic = "PureParGen",
    )

    return [
        DefaultInfo(files = depset([output])),
        PureParInfo(par = output),
    ]

pure_par = rule(
    implementation = _pure_par_impl,
    attrs = {
        "deps": attr.label_list(providers = [[JavaInfo], [PureModuleInfo]]),
        "repo_name": attr.string(),
        "version": attr.string(default = PURE_PLATFORM_VERSION),
        "tool": attr.label(
            default = Label("//legend-pure/legend-pure-core/legend-pure-m3-core:PureJarGenerator"),
            executable = True,
            cfg = "exec",
            providers = [JavaInfo], # We need JavaInfo to get the tool's classpath
        ),
        "out": attr.output(mandatory = True),
        "_jdk": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_runtime"),
            providers = [java_common.JavaRuntimeInfo],
        ),
    },
)

pure_model_generation = rule(
    implementation = _pure_model_generation_impl,
    attrs = {
        "srcs": attr.label_list(allow_files = True),
        "model_name": attr.string(mandatory = True),
        "source_path": attr.string(mandatory = True),
        "file_name_startswith": attr.string(),
        "tool": attr.label(
            default = Label("//legend-pure/legend-pure-dsl/legend-pure-dsl-path/legend-pure-m2-dsl-path-pure:M3CoreInstanceGenerator"),
            executable = True,
            cfg = "exec",
        ),
        "_jdk": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_runtime"),
            providers = [java_common.JavaRuntimeInfo],
        ),
    },
)

def _pure_protocol_generation_impl(ctx):
    out_srcjar = ctx.outputs.srcjar
    src = ctx.file.src
    tool = ctx.executable.tool
    
    gen_dir = ctx.actions.declare_directory(ctx.label.name + "_gen")
    
    # Args: input_file output_dir
    args = ctx.actions.args()
    args.add(src.path)
    args.add(gen_dir.path)
    
    ctx.actions.run(
        outputs = [gen_dir],
        inputs = [src],
        executable = tool,
        arguments = [args],
        mnemonic = "PureProtocolGen",
    )
    
    zip_tree_artifacts(
        ctx,
        output = out_srcjar,
        inputs = [gen_dir],
        java_runtime_target = ctx.attr._jdk,
    )
    
    return [DefaultInfo(files = depset([out_srcjar]))]

pure_protocol_generation = rule(
    implementation = _pure_protocol_generation_impl,
    attrs = {
        "src": attr.label(mandatory = True, allow_single_file = True),
        "tool": attr.label(mandatory = True, executable = True, cfg = "exec"),
        "_jdk": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_runtime"),
            providers = [java_common.JavaRuntimeInfo],
        ),
    },
    outputs = {"srcjar": "%{name}.srcjar"},
)

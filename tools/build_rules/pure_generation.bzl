load("//tools:zip_tree_artifacts.bzl", "zip_tree_artifacts")
load("@rules_java//java:defs.bzl", "java_common")

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
    
    ctx.actions.run(
        outputs = [gen_dir],
        inputs = ctx.files.srcs,
        executable = tool,
        arguments = [gen_args],
        mnemonic = "PureModelGenRun",
    )

    zip_tree_artifacts(
        ctx,
        output = output_jar,
        inputs = [gen_dir],
        java_runtime_target = ctx.attr._jdk,
    )
    
    return [DefaultInfo(files = depset([output_jar]))]

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

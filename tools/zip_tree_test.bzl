load(":zip_tree_artifacts.bzl", "zip_tree_artifacts")
load("@rules_java//java:defs.bzl", "java_common")

def _zip_tree_test_rule_impl(ctx):
    # 1. Create a dummy tree artifact
    out_dir = ctx.actions.declare_directory(ctx.label.name + "_test_dir")
    ctx.actions.run_shell(
        outputs = [out_dir],
        command = "mkdir -p $1/subdir && echo 'Hello World' > $1/file1.txt && echo 'Sub content' > $1/subdir/file2.txt",
        arguments = [out_dir.path],
        mnemonic = "CreateTestDir",
    )
    
    # 2. Use the zip_tree_artifacts function
    out_zip = ctx.actions.declare_file(ctx.label.name + ".zip")
    zip_tree_artifacts(ctx, out_zip, [out_dir], ctx.attr._jdk)
    
    return [DefaultInfo(files = depset([out_zip]))]

zip_tree_test_rule = rule(
    implementation = _zip_tree_test_rule_impl,
    attrs = {
        "_jdk": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_runtime"),
            providers = [java_common.JavaRuntimeInfo],
        ),
    },
)

def _zip_empty_test_rule_impl(ctx):
    # 1. Create a dummy empty tree artifact
    out_dir = ctx.actions.declare_directory(ctx.label.name + "_empty_dir")
    ctx.actions.run_shell(
        outputs = [out_dir],
        command = "mkdir -p $1",
        arguments = [out_dir.path],
        mnemonic = "CreateEmptyTestDir",
    )
    
    # 2. Use the zip_tree_artifacts function
    out_zip = ctx.actions.declare_file(ctx.label.name + ".zip")
    zip_tree_artifacts(ctx, out_zip, [out_dir], ctx.attr._jdk)
    
    return [DefaultInfo(files = depset([out_zip]))]

zip_empty_test_rule = rule(
    implementation = _zip_empty_test_rule_impl,
    attrs = {
        "_jdk": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_runtime"),
            providers = [java_common.JavaRuntimeInfo],
        ),
    },
)

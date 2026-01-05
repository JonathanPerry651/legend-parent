"""Pure source generation rule for generating Java code from Pure sources.

This rule generates a srcjar from Pure sources. Use with java_library to compile:

    pure_sources(
        name = "my_sources",
        srcs = ["foo.pure", "bar.pure"],
    )
    
    java_library(
        name = "my_lib",
        srcs = [":my_sources"],
        deps = [...],
    )
"""

load("//tools:zip_tree_artifacts.bzl", "zip_tree_artifacts")
load("@rules_java//java:defs.bzl", "java_common")

def _pure_sources_impl(ctx):
    # Declare output files
    srcjar = ctx.actions.declare_file(ctx.label.name + ".srcjar")
    gen_dir = ctx.actions.declare_directory(ctx.label.name + "_gen")
    
    # Build arguments using ctx.actions.args() for proper path handling
    args = ctx.actions.args()
    
    # Repository mode: <repository> <classesDir> <targetDir>
    # Note: We use gen_dir for both because we only care about source generation here
    args.add(ctx.attr.repository)
    args.add_all([gen_dir], format_each = "%s/classes", expand_directories = False)
    args.add_all([gen_dir], expand_directories = False)
    
    # Action 1: Run generator
    ctx.actions.run(
        outputs = [gen_dir],
        # We don't have explicit inputs in repository mode, but the generator finds them on classpath
        # This is not fully hermetic for inputs, but standard for this generator
        inputs = [], 
        executable = ctx.executable.generator,
        arguments = [args],
        execution_requirements = {"supports-path-mapping": "1"},
        progress_message = "Generating Pure sources for repository '%s'" % ctx.attr.repository,
    )
    
    # Action 2: Merge for zipping (and handle exclusions)
    merged_dir = ctx.actions.declare_directory(ctx.label.name + "_merged")
    
    # Exclusions handling
    rm_cmds = []
    for excl in ctx.attr.exclusions:
         # Exclusions are relative to root, e.g. "org/finos/..."
         # We use $dest_dir which is passed as an argument to support path mapping
         rm_cmds.append("rm -rf \"$dest_dir\"/{excl}".format(
             excl = excl
         ))
    exclusions_script = "\n".join(rm_cmds)

    merge_args = ctx.actions.args()
    merge_args.add_all([gen_dir], expand_directories = False)
    merge_args.add_all([merged_dir], expand_directories = False)

    ctx.actions.run_shell(
        inputs = [gen_dir],
        outputs = [merged_dir],
        arguments = [merge_args],
        command = """
            set -e
            src_dir="$1"
            dest_dir="$2"
            
            # Merge generated sources
            if [ -d "$src_dir/generated-sources" ]; then
                cp -r "$src_dir/generated-sources"/. "$dest_dir/"
            fi
            if [ -d "$src_dir/generated-test-sources" ]; then
                cp -r "$src_dir/generated-test-sources"/. "$dest_dir/"
            fi
            
            # Exclusions
            {exclusions}
        """.format(exclusions = exclusions_script),
        mnemonic = "PureSourcesMerge",
        execution_requirements = {"supports-path-mapping": "1"},
    )
    
    # Action 3: Package sources into srcjar using zip_tree_artifacts
    zip_tree_artifacts(
        ctx,
        output = srcjar,
        inputs = [merged_dir],
        java_runtime_target = ctx.attr._jdk,
    )
    
    return [DefaultInfo(files = depset([srcjar]))]

pure_sources = rule(
    implementation = _pure_sources_impl,
    attrs = {
        "repository": attr.string(
            mandatory = True,
            doc = "Repository name for generation (e.g. 'core')",
        ),
        "generator": attr.label(
            mandatory = True,
            executable = True,
            cfg = "exec",
        ),
        "exclusions": attr.string_list(default = [], doc = "Files to exclude from the generated srcjar, relative to generated-sources root"),
        "_jdk": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_runtime"),
            providers = [java_common.JavaRuntimeInfo],
        ),
    },
)

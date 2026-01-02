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
        progress_message = "Generating Pure sources for repository '%s'" % ctx.attr.repository,
    )
    
    # Action 2: Package sources into srcjar using jar from Java toolchain via run_shell
    # We use run_shell to handle potentially missing directories gracefully by creating them
    java_toolchain = ctx.attr._java_toolchain[java_common.JavaToolchainInfo]
    jar_tool = java_toolchain.java_runtime.java_executable_exec_path.replace("/bin/java", "/bin/jar")
    
    # Paths
    gen_sources = "{}/generated-sources".format(gen_dir.path)
    gen_test_sources = "{}/generated-test-sources".format(gen_dir.path)
    
    # Exclusions handling
    exclusions_str = ""
    for excl in ctx.attr.exclusions:
         exclusions_str += "rm -f {gen_sources}/{excl} {gen_test_sources}/{excl}\n".format(
             gen_sources = gen_sources,
             gen_test_sources = gen_test_sources,
             excl = excl
         )

    # We construct a shell command that ensures directories exist, applies exclusions, and then jars them
    # Note: We use relative paths for -C to work correctly
    command = """
        mkdir -p {gen_sources} {gen_test_sources}
        {exclusions}
        {jar} cf {srcjar} -C {gen_sources} . -C {gen_test_sources} .
    """.format(
        gen_sources = gen_sources,
        gen_test_sources = gen_test_sources,
        exclusions = exclusions_str,
        jar = jar_tool,
        srcjar = srcjar.path
    )

    ctx.actions.run_shell(
        outputs = [srcjar],
        inputs = [gen_dir] + java_toolchain.java_runtime.files.to_list(),
        command = command,
        mnemonic = "PackagePureSrcjar",
        progress_message = "Packaging Pure sources for %s" % ctx.label.name,
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
        "_java_toolchain": attr.label(
            default = Label("@bazel_tools//tools/jdk:current_java_toolchain"),
        ),
    },
    toolchains = ["@bazel_tools//tools/jdk:toolchain_type"],
)

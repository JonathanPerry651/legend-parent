load("@rules_java//java:defs.bzl", "JavaInfo")

def _java_import_validation_impl(ctx):
    out_jar = ctx.actions.declare_file("validation-%s.jar" % ctx.label.name)
    
    # Collect transitive jars
    # We want to check against all dependencies of the library
    transitive_jars = depset(transitive = [dep[JavaInfo].transitive_compile_time_jars for dep in ctx.attr.deps])
    
    args = ctx.actions.args()
    args.use_param_file("@%s", use_always = True)
    args.add(out_jar)
    args.add_all(ctx.files.srcs)
    args.add_all(transitive_jars)
    
    ctx.actions.run(
        outputs = [out_jar],
        inputs = depset(ctx.files.srcs, transitive = [transitive_jars]),
        executable = ctx.executable._tool,
        arguments = [args],
        mnemonic = "PureImportValidation",
        progress_message = "Validating Pure imports for %s" % ctx.label.name,
    )
    
    return [
        JavaInfo(
            output_jar = out_jar,
            compile_jar = out_jar,
        )
    ]

java_import_validation = rule(
    implementation = _java_import_validation_impl,
    attrs = {
        "srcs": attr.label_list(allow_files = [".java", ".srcjar", ".jar"]),
        "deps": attr.label_list(providers = [JavaInfo]),
        "_tool": attr.label(
            default = Label("//tools/validation:ImportValidator"),
            executable = True,
            cfg = "exec",
        ),
    },
)

def validated_java_library(name, srcs = [], deps = [], **kwargs):
    """
    A java_library replacement that runs validation on Pure generated imports.
    """
    validation_name = name + "_validation"
    
    java_import_validation(
        name = validation_name,
        srcs = srcs,
        deps = deps,
    )
    
    native.java_library(
        name = name,
        srcs = srcs,
        deps = deps + [":" + validation_name],
        **kwargs
    )

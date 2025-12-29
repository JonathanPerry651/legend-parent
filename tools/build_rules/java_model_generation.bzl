def _java_model_generation_impl(ctx):
    output_jar = ctx.actions.declare_file(ctx.label.name + ".srcjar")
    
    # Create a directory for outputs
    # Must end with slash for generator concatenation logic!
    output_dir = output_jar.dirname + "/java_out_" + ctx.label.name + "/"
    
    tool_path = ctx.executable.tool.path
    
    command = """
        set -e
        mkdir -p {output_dir}
        
        # Capture absolute path of output jar
        OUTPUT_JAR=$(pwd)/{output_jar_path}
        
        if ! {tool} {model_name} {factory_class} {output_dir} > {output_dir}/gen.log 2>&1; then
            echo "Generator Failed. Output:"
            cat {output_dir}/gen.log
            exit 1
        fi
        
        echo "Generator Output:"
        cat {output_dir}/gen.log
        
        echo "Listing generated files:"
        find {output_dir} -name "*.java"
        
        cd {output_dir}
        zip -q -r "$OUTPUT_JAR" .
    """.format(
        output_dir = output_dir,
        tool = tool_path,
        model_name = ctx.attr.model_name,
        factory_class = ctx.attr.factory_class,
        output_jar_path = output_jar.path
    )
    
    ctx.actions.run_shell(
        outputs = [output_jar],
        inputs = ctx.files.srcs,
        tools = [ctx.executable.tool],
        command = command,
        progress_message = "Generating Java Model %s" % ctx.label.name,
    )
    
    return [DefaultInfo(files = depset([output_jar]))]

java_model_generation = rule(
    implementation = _java_model_generation_impl,
    attrs = {
        "srcs": attr.label_list(allow_files = True),
        "model_name": attr.string(mandatory = True),
        "factory_class": attr.string(mandatory = True),
        "tool": attr.label(
            default = Label("//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:JavaModelFactoryGenerator"),
            executable = True,
            cfg = "exec",
        ),
    },
)

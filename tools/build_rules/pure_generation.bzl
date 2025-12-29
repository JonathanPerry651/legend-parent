def _pure_model_generation_impl(ctx):
    output_jar = ctx.actions.declare_file(ctx.label.name + ".srcjar")
    
    # Create a directory for outputs
    # Must end with slash for M3CoreInstanceGenerator concatenation logic!
    output_dir = output_jar.dirname + "/pure_out_" + ctx.label.name + "/"
    
    tool_path = ctx.executable.tool.path
    
    # We need to construct the command line.
    # Run the tool, then zip.
    
    command = """
        set -e
        mkdir -p {output_dir}
        
        # Capture absolute path of output jar
        OUTPUT_JAR=$(pwd)/{output_jar_path}
        
        if ! {tool} {output_dir} {model_name} {source_path} {start_with} > {output_dir}/gen.log 2>&1; then
            echo "Generator Failed. Output:"
            cat {output_dir}/gen.log
            exit 1
        fi
        
        echo "Generator Output:"
        cat {output_dir}/gen.log
        
        echo "Listing generated files:"
        find {output_dir} -name "*.java"
        
        # exit 1 
        
        cd {output_dir}
        zip -q -r "$OUTPUT_JAR" .
    """.format(
        output_dir = output_dir,
        tool = tool_path,
        model_name = ctx.attr.model_name,
        source_path = ctx.attr.source_path,
        start_with = ctx.attr.file_name_startswith if ctx.attr.file_name_startswith else "",
        output_jar_path = output_jar.path
    )
    
    ctx.actions.run_shell(
        outputs = [output_jar],
        inputs = ctx.files.srcs,
        tools = [ctx.executable.tool],
        command = command,
        progress_message = "Generating Pure model %s" % ctx.label.name,
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
    },
)

def _pure_model_generation_impl(ctx):
    output_jar = ctx.actions.declare_file(ctx.label.name + ".srcjar")
    
    # Create a directory for outputs
    # Must end with slash for M3CoreInstanceGenerator concatenation logic!
    output_dir = output_jar.dirname + "/pure_out_" + ctx.label.name + "/"
    
    tool = ctx.executable.tool
    
    # Use args for robust argument handling
    args = ctx.actions.args()
    args.add(output_dir)                    # $1
    args.add(ctx.attr.model_name)           # $2
    args.add(ctx.attr.source_path)          # $3
    
    start_with = ctx.attr.file_name_startswith if ctx.attr.file_name_startswith else ""
    args.add(start_with)                    # $4
    
    args.add(output_jar)                    # $5 (Using file object automatically handles path)

    command = """
        set -e
        OUTPUT_DIR=$1
        MODEL_NAME=$2
        SOURCE_PATH=$3
        START_WITH=$4
        OUTPUT_JAR=$5
        
        mkdir -p "$OUTPUT_DIR"
        
        # Capture absolute path of output jar
        # OUTPUT_JAR path from args is relative to execroot. 
        # $(pwd) gives execroot.
        OUTPUT_JAR_ABS="$(pwd)/$OUTPUT_JAR"
        
        # Construct tool args
        # The tool expects space-separated arguments.
        # We append START_WITH only if it is not empty.
        
        if [ -n "$START_WITH" ]; then
             {tool_path} "$OUTPUT_DIR" "$MODEL_NAME" "$SOURCE_PATH" "$START_WITH" > "$OUTPUT_DIR/gen.log" 2>&1
        else
             {tool_path} "$OUTPUT_DIR" "$MODEL_NAME" "$SOURCE_PATH" > "$OUTPUT_DIR/gen.log" 2>&1
        fi
        
        GENERATOR_EXIT_CODE=$?
        
        if [ $GENERATOR_EXIT_CODE -ne 0 ]; then
            echo "Generator Failed. Output:"
            cat "$OUTPUT_DIR/gen.log"
            exit 1
        fi
        
        echo "Generator Output:"
        cat "$OUTPUT_DIR/gen.log"
        
        echo "Listing generated files:"
        find "$OUTPUT_DIR" -name "*.java"
        
        cd "$OUTPUT_DIR"
        zip -q -r "$OUTPUT_JAR_ABS" .
    """.format(
        tool_path = tool.path
    )
    
    ctx.actions.run_shell(
        outputs = [output_jar],
        inputs = ctx.files.srcs,
        tools = [tool],
        arguments = [args],
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

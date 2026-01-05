def zip_tree_artifacts(ctx, output, inputs, java_runtime_target):
    """
    Zips the contents of the given input files/directories into a single output archive.
    
    Args:
        ctx: The rule context.
        output: The declared output file (File artifact).
        inputs: A list of input files or directories (compatible with TreeArtifacts).
        zipper_tool: The zipper executable (File artifact).
    """
    """
    Zips the contents of the given input files/directories into a single output archive using the jar tool.
    
    Args:
        ctx: The rule context.
        output: The declared output file (File artifact).
        inputs: A list of input files or directories (compatible with TreeArtifacts).
        java_runtime_target: The java_runtime target (provider java_common.JavaRuntimeInfo).
    """

    # Locate jar tool
    java_runtime = java_runtime_target[java_common.JavaRuntimeInfo]
    jar_tool = None
    for f in java_runtime.files.to_list():
        if f.basename == "jar" or f.basename == "jar.exe":
            jar_tool = f
            break
    if not jar_tool:
        fail("Could not find 'jar' tool in java_runtime")

    # Build arguments for jar
    # jar cf output_path -C dir . -C dir file ...
    
    args = ctx.actions.args()
    args.add("cMf") # Create, no Manifest, file
    args.add(output)
    
    for inp in inputs:
        args.add("-C")
        if inp.is_directory:
             args.add_all([inp], expand_directories = False)
             args.add(".")
        else:
             # For files, assuming they should be at root of zip
             # We need valid directory. 
             # inp.dirname works for File objects.
             args.add(inp.dirname)
             args.add(inp.basename)

    ctx.actions.run(
        outputs = [output],
        inputs = inputs,
        tools = java_runtime.files,  # Depends on the whole runtime to be safe/correct (toolchain)
        executable = jar_tool,
        arguments = [args],
        mnemonic = "ZipTreeArtifacts",
        progress_message = "Zipping tree artifacts into %s" % output.short_path,
        execution_requirements = {"supports-path-mapping": "1"},
    )

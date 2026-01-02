import sys
import os

def generate(src_path, output_path, include_verifiers):
    with open(src_path, "r") as f:
        content = f.read()
    
    # Extract package
    package = None
    
    lines = content.splitlines()
    for line in lines:
        if line.strip().startswith("package "):
            package = line.strip().split(" ")[1].rstrip(";")
            break
            
    # Extract class name from filename
    filename = os.path.basename(src_path)
    base_class_name = filename.replace(".java", "")
    compiled_class_name = base_class_name + "Compiled"
    
    out = []
    
    if package:
        out.append(f"package {package};")
        out.append("")
    
    out.append("import org.finos.legend.pure.m3.execution.FunctionExecution;")
    out.append("import org.finos.legend.pure.runtime.java.compiled.execution.FunctionExecutionCompiledBuilder;")
    out.append("import org.finos.legend.pure.runtime.java.compiled.factory.JavaModelFactoryRegistryLoader;")
    out.append("import org.junit.BeforeClass;")
    if include_verifiers:
        out.append("import org.eclipse.collections.api.factory.Lists;")
        out.append("import org.eclipse.collections.api.list.ListIterable;")
        out.append("import org.finos.legend.pure.m3.tests.RuntimeVerifier;")
        out.append("import org.finos.legend.pure.runtime.java.compiled.runtime.CompiledClassloaderStateVerifier;")
        out.append("import org.finos.legend.pure.runtime.java.compiled.runtime.CompiledMetadataStateVerifier;")

    out.append("")
    out.append(f"public class {compiled_class_name} extends {base_class_name}")
    out.append("{")
    out.append("    @BeforeClass")
    out.append("    public static void setUp()")
    out.append("    {")
    out.append("        setUpRuntime(getFunctionExecution(), JavaModelFactoryRegistryLoader.loader());")
    out.append("    }")
    out.append("")
    out.append("    protected static FunctionExecution getFunctionExecution()")
    out.append("    {")
    out.append("        return new FunctionExecutionCompiledBuilder().build();")
    out.append("    }")
    
    if include_verifiers:
        out.append("")
        out.append("    @Override")
        out.append("    protected ListIterable<RuntimeVerifier.FunctionExecutionStateVerifier> getAdditionalVerifiers()")
        out.append("    {")
        out.append("        return Lists.fixedSize.of(new CompiledMetadataStateVerifier(), new CompiledClassloaderStateVerifier());")
        out.append("    }")

    out.append("}")
    
    with open(output_path, "w") as f:
        f.write("\n".join(out))

if __name__ == "__main__":
    src = sys.argv[1]
    out = sys.argv[2]
    verifiers = len(sys.argv) > 3 and sys.argv[3] == "true"
    generate(src, out, verifiers)

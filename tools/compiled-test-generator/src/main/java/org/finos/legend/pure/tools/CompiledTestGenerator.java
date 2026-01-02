package org.finos.legend.pure.tools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CompiledTestGenerator
{
    public static void main(String[] args) throws IOException
    {
        if (args.length < 2)
        {
            System.err.println("Usage: CompiledTestGenerator <source_file> <output_file> [include_verifiers]");
            System.exit(1);
        }

        String sourceFilePath = args[0];
        String outputFilePath = args[1];
        boolean includeVerifiers = args.length > 2 && Boolean.parseBoolean(args[2]);

        File sourceFile = new File(sourceFilePath);
        String packageName = extractPackageName(sourceFilePath);
        String baseClassName = sourceFile.getName().replace(".java", "");
        String compiledClassName = baseClassName + "Compiled";

        StringBuilder sb = new StringBuilder();
        if (packageName != null)
        {
            sb.append("package ").append(packageName).append(";\n\n");
        }
        
        sb.append("import org.finos.legend.pure.m3.execution.FunctionExecution;\n");
        sb.append("import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.classpath.ClassLoaderCodeStorage;\n");
        sb.append("import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.composite.CompositeCodeStorage;\n");
        sb.append("import org.finos.legend.pure.runtime.java.compiled.execution.FunctionExecutionCompiledBuilder;\n");
        sb.append("import org.finos.legend.pure.runtime.java.compiled.factory.JavaModelFactoryRegistryLoader;\n");
        sb.append("import org.junit.BeforeClass;\n");
        if (includeVerifiers)
        {
            sb.append("import org.eclipse.collections.api.factory.Lists;\n");
            sb.append("import org.eclipse.collections.api.list.ListIterable;\n");
            sb.append("import org.finos.legend.pure.m3.tests.RuntimeVerifier;\n");
            sb.append("import org.finos.legend.pure.runtime.java.compiled.runtime.CompiledClassloaderStateVerifier;\n");
            sb.append("import org.finos.legend.pure.runtime.java.compiled.runtime.CompiledMetadataStateVerifier;\n");
        }
        sb.append("\n");
        
        sb.append("public class ").append(compiledClassName).append(" extends ").append(baseClassName).append("\n");
        sb.append("{\n");
        
        sb.append("    @BeforeClass\n");
        sb.append("    public static void setUp()\n");
        sb.append("    {\n");
        sb.append("        setUpRuntime(getFunctionExecution(), new CompositeCodeStorage(new ClassLoaderCodeStorage(getCodeRepositories())), JavaModelFactoryRegistryLoader.loader());\n");
        sb.append("    }\n");
        sb.append("\n");
        
        sb.append("    protected static FunctionExecution getFunctionExecution()\n");
        sb.append("    {\n");
        sb.append("        return new FunctionExecutionCompiledBuilder().build();\n");
        sb.append("    }\n");

        if (includeVerifiers)
        {
            sb.append("\n");
            sb.append("    @Override\n");
            sb.append("    protected ListIterable<RuntimeVerifier.FunctionExecutionStateVerifier> getAdditionalVerifiers()\n");
            sb.append("    {\n");
            sb.append("        return Lists.fixedSize.of(new CompiledMetadataStateVerifier(), new CompiledClassloaderStateVerifier());\n");
            sb.append("    }\n");
        }

        sb.append("}\n");

        Path outPath = Paths.get(outputFilePath);
        Files.createDirectories(outPath.getParent());
        Files.write(outPath, sb.toString().getBytes());
    }

    private static String extractPackageName(String filePath) throws IOException
    {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines)
        {
            line = line.trim();
            if (line.startsWith("package "))
            {
                return line.substring(8, line.indexOf(';')).trim();
            }
        }
        return null;
    }
}

package org.finos.legend.tools.validation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ImportValidator {

    private static final Pattern IMPORT_PATTERN = Pattern.compile("^\\s*import\\s+(org\\.finos\\.legend\\.[a-zA-Z0-9_$.]+);");

    public static void main(String[] args) throws IOException {
        List<String> allArgs = new ArrayList<>();
        if (args.length == 1 && args[0].startsWith("@")) {
            allArgs.addAll(Files.readAllLines(Paths.get(args[0].substring(1))));
        } else {
            allArgs.addAll(Arrays.asList(args));
        }

        if (allArgs.size() < 2) {
            System.err.println("Usage: ImportValidator <output_jar> <source_files...> <classpath_jars...>");
            System.exit(1);
        }

        String outputJarPath = allArgs.get(0);
        List<String> inputs = allArgs.subList(1, allArgs.size());

        List<String> sourceFiles = inputs.stream().filter(s -> s.endsWith(".java")).collect(Collectors.toList());
        List<String> jarFiles = inputs.stream().filter(s -> s.endsWith(".jar") || s.endsWith(".srcjar")).collect(Collectors.toList());

        Set<String> requiredClasses = new HashSet<>();
        for (String sourceFile : sourceFiles) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile)))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    Matcher matcher = IMPORT_PATTERN.matcher(line);
                    if (matcher.find()) {
                        requiredClasses.add(matcher.group(1));
                    }
                }
            }
        }

        if (requiredClasses.isEmpty()) {
            createEmptyJar(outputJarPath);
            return;
        }

        Set<String> availableClasses = new HashSet<>();
        for (String jarFile : jarFiles) {
            try (JarInputStream jarStream = new JarInputStream(new FileInputStream(jarFile))) {
                JarEntry entry;
                while ((entry = jarStream.getNextJarEntry()) != null) {
                    String name = entry.getName();
                    if (name.endsWith(".class")) {
                        availableClasses.add(name.replace('/', '.').substring(0, name.length() - 6));
                    } else if (name.endsWith(".java")) {
                         // Some source jars might be on classpath if we are checking against generated sources
                        availableClasses.add(name.replace('/', '.').substring(0, name.length() - 5));
                    }
                }
            } catch (IOException e) {
                 System.err.println("Warning: Could not read jar " + jarFile + ": " + e.getMessage());
            }
        }

        List<String> missingClasses = new ArrayList<>();
        for (String required : requiredClasses) {
            if (!availableClasses.contains(required)) {
                missingClasses.add(required);
            }
        }

        if (!missingClasses.isEmpty()) {
            System.err.println("ERROR: The following Pure generated classes are imported but missing from dependencies:");
            for (String missing : missingClasses) {
                System.err.println("  - " + missing);
            }
            System.err.println("This usually means the generated code validation failed. Validate that your dependencies generate these classes.");
            System.exit(1);
        }

        createEmptyJar(outputJarPath);
    }

    private static void createEmptyJar(String path) throws IOException {
        try (JarOutputStream jos = new JarOutputStream(new FileOutputStream(path))) {
            // Write nothing, just create the file
            jos.putNextEntry(new JarEntry("META-INF/"));
            jos.closeEntry();
        }
    }
}

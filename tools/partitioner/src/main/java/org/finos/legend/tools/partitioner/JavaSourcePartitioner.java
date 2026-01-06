package org.finos.legend.tools.partitioner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JavaSourcePartitioner {
    // Mode
    private static boolean extractMode = false;
    
    // Common args
    private static File inputFile;
    private static File outputFile;
    
    // Partition args
    private static int layers = 10;
    private static int shards = 8;
    
    // Extract args
    private static File manifestFile;
    private static int targetLayer = -1;
    private static int targetShard = -1;

    public static void main(String[] args) throws IOException {
        try {
            if (args.length > 0 && args[0].startsWith("@")) {
                List<String> lines = Files.readAllLines(Path.of(args[0].substring(1)));
                parseArgs(lines.toArray(new String[0]));
            } else {
                parseArgs(args);
            }
        } catch (Exception e) {
            System.err.println("Error parsing args: " + e.getMessage());
            System.exit(1);
        }

        if (extractMode) {
            if (inputFile == null || outputFile == null || manifestFile == null || targetLayer == -1 || targetShard == -1) {
                System.err.println("Usage (extract): --mode extract --input <srcjar> --output <srcjar> --manifest <json> --layer <int> --shard <int>");
                System.exit(1);
            }
            System.out.println("Extracting Layer " + targetLayer + " Shard " + targetShard);
            new Extractor(inputFile, outputFile, manifestFile, targetLayer, targetShard).process();
        } else {
            if (inputFile == null || outputFile == null) {
                System.err.println("Usage (partition): --input <srcjar> --output <json> [--layers <int>] [--shards <int>]");
                System.exit(1);
            }
            System.out.println("Partitioning " + inputFile + " into " + layers + " layers, " + shards + " shards.");
            new Processor(inputFile, outputFile, layers, shards).process();
        }
    }

    private static void parseArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--mode": if ("extract".equals(args[++i])) extractMode = true; break;
                case "--input": inputFile = new File(args[++i]); break;
                case "--output": outputFile = new File(args[++i]); break;
                case "--manifest": manifestFile = new File(args[++i]); break;
                case "--layers": layers = Integer.parseInt(args[++i]); break;
                case "--shards": shards = Integer.parseInt(args[++i]); break;
                case "--layer": targetLayer = Integer.parseInt(args[++i]); break;
                case "--shard": targetShard = Integer.parseInt(args[++i]); break;
            }
        }
    }
    
    private static class Extractor {
        private final File input;
        private final File output;
        private final File manifest;
        private final int layer;
        private final int shard;
        
        Extractor(File input, File output, File manifest, int layer, int shard) {
            this.input = input;
            this.output = output;
            this.manifest = manifest;
            this.layer = layer;
            this.shard = shard;
        }
        
        void process() throws IOException {
            java.util.Set<String> targetFiles = new java.util.HashSet<>();
            
            // Simple robust regex parsing of manifest JSON
            // Line format: "path": {"layer": 0, "shard": 1}
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\"(.+?)\":\\s*\\{\\s*\"layer\":\\s*(\\d+),\\s*\"shard\":\\s*(\\d+)\\s*\\}");
            
            List<String> lines = Files.readAllLines(manifest.toPath());
            for (String line : lines) {
                java.util.regex.Matcher m = pattern.matcher(line);
                if (m.find()) {
                    String path = m.group(1).replace("\\\\", "\\").replace("\\\"", "\"");
                    int l = Integer.parseInt(m.group(2));
                    int s = Integer.parseInt(m.group(3));
                    if (l == layer && s == shard) {
                        targetFiles.add(path);
                    }
                }
            }
            
            System.out.println("Found " + targetFiles.size() + " files for this shard.");
            
            try (java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(output));
                 java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(input))) {
                
                java.util.zip.ZipEntry entry;
                byte[] buffer = new byte[8192];
                while ((entry = zis.getNextEntry()) != null) {
                    if (targetFiles.contains(entry.getName())) {
                        java.util.zip.ZipEntry newEntry = new java.util.zip.ZipEntry(entry.getName());
                        zos.putNextEntry(newEntry);
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            zos.write(buffer, 0, len);
                        }
                        zos.closeEntry();
                    }
                }
                // Always produce a valid zip, even if empty
            }
        }
    }

    private static class Processor {
        private final File input;
        private final File output;
        private final int totalLayers;
        private final int totalShards;
        
        // internal data structures
        private final java.util.Map<String, String> classToPath = new java.util.HashMap<>();
        private final java.util.Map<String, java.util.Set<String>> dependencies = new java.util.HashMap<>();
        private final java.util.Set<String> allDefinedClasses = new java.util.HashSet<>();
        private final java.util.Map<String, java.util.List<String>> simpleToFqn = new java.util.HashMap<>();

        Processor(File input, File output, int layers, int shards) {
            this.input = input;
            this.output = output;
            this.totalLayers = layers;
            this.totalShards = shards;
        }

        void process() throws IOException {
            // 1. Pass 1: Scan for defined classes
            System.out.println("Pass 1: Scanning for classes...");
            scanClasses();
            System.out.println("Found " + allDefinedClasses.size() + " classes.");

            // 2. Pass 2: Scan for dependencies
            System.out.println("Pass 2: Scanning for dependencies...");
            scanDependencies();

            // 2.5 Apply Heuristics (Fixes for specific split-compilation issues)
            applyHeuristics();

            // 3. Build SCC
            java.util.List<java.util.Set<String>> sccs = computeSCCs();
            System.out.println("Found " + sccs.size() + " SCCs.");
            
            // Debug: Print top 10 largest SCCs
            sccs.stream()
                .sorted((s1, s2) -> Integer.compare(s2.size(), s1.size()))
                .limit(10)
                .forEach(scc -> {
                    System.out.println("SCC Size: " + scc.size() + " Rep: " + scc.iterator().next());
                });

            // 4. Build DAG of SCCs
            java.util.Map<Integer, java.util.Set<Integer>> sccGraph = buildSCCGraph(sccs);
            
            // 5. Calculate Depths
            int[] sccDepths = calculateDepths(sccs.size(), sccGraph);
            
            // 6. Assign to Buckets
            writeManifest(sccs, sccDepths);
        }
        
        private void scanClasses() throws IOException {
            try (java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(input))) {
                java.util.zip.ZipEntry entry;
                byte[] buffer = new byte[8192];
                while ((entry = zis.getNextEntry()) != null) {
                    if (!entry.getName().endsWith(".java")) continue;
                    String content = readEntry(zis, buffer);
                    
                    // Parse Package
                    java.util.regex.Matcher pkgMatcher = java.util.regex.Pattern.compile("package\\s+([\\w.]+);").matcher(content);
                    String pkg = "";
                    if (pkgMatcher.find()) pkg = pkgMatcher.group(1);

                    java.util.regex.Matcher classMatcher = java.util.regex.Pattern.compile("(?:class|interface|enum)\\s+([\\w$]+)").matcher(content);
                    if (classMatcher.find()) {
                        String simpleName = classMatcher.group(1);
                        String fqn = (pkg.isEmpty() ? "" : pkg + ".") + simpleName;
                        classToPath.put(fqn, entry.getName());
                        allDefinedClasses.add(fqn);
                        simpleToFqn.computeIfAbsent(simpleName, k -> new java.util.ArrayList<>()).add(fqn);
                    }
                }
            }
        }

        private void scanDependencies() throws IOException {
             try (java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(input))) {
                java.util.zip.ZipEntry entry;
                byte[] buffer = new byte[8192];
                while ((entry = zis.getNextEntry()) != null) {
                    if (!entry.getName().endsWith(".java")) continue;
                    String content = readEntry(zis, buffer);
                    
                    // Identify the class defined in this file (to key the dependencies)
                    // We assume one top level class per file matching the previous scan or we re-parse
                    java.util.regex.Matcher pkgMatcher = java.util.regex.Pattern.compile("package\\s+([\\w.]+);").matcher(content);
                    String pkg = "";
                    if (pkgMatcher.find()) pkg = pkgMatcher.group(1);
                    
                    java.util.regex.Matcher classMatcher = java.util.regex.Pattern.compile("(?:class|interface|enum)\\s+([\\w$]+)").matcher(content);
                    if (classMatcher.find()) {
                        String simpleName = classMatcher.group(1);
                        String fqn = (pkg.isEmpty() ? "" : pkg + ".") + simpleName;
                        
                        java.util.Set<String> deps = new java.util.HashSet<>();
                        
                        // Tokenize content to find references
                        // Split by non-identifier characters (EXCLUDING $)
                        String[] tokens = content.split("[^\\w$]+");
                        for (String token : tokens) {
                            if (simpleToFqn.containsKey(token)) {
                                deps.addAll(simpleToFqn.get(token));
                            }
                            // Also check parts (e.g. Mass$Pound -> Mass, Pound)
                            if (token.contains("$")) {
                                for (String part : token.split("\\$")) {
                                    if (simpleToFqn.containsKey(part)) {
                                        deps.addAll(simpleToFqn.get(part));
                                    }
                                }
                            }
                        }
                        
                        // Logic for FQNs referenced directly?
                        // The tokens logic captures the parts (e.g. "org", "finos", "legend"...)
                        // But "org.finos.legend.Foo" -> tokens "org", "finos", "legend", "Foo".
                        // "Foo" will match `simpleToFqn`. So it is captured!
                        // So separate FQN regex is NOT needed if "Foo" is unique/captured.
                        
                        // Self-dependency removal
                        deps.remove(fqn);
                        
                        dependencies.put(fqn, deps);
                    }
                }
            }
        }
        
        private void applyHeuristics() {
            // Heuristic 1: Refined Store Partitioning
            // Group Store classes by their package to avoid creating a single massive shard for all "Store" classes across all versions.
            // We identify "anchor" packages (e.g. per protocol version) and group classes within them.
            java.util.Set<String> storePackages = new java.util.HashSet<>();
            for (String cls : allDefinedClasses) {
                if (cls.contains("Store") && cls.contains("Root_")) {
                    int lastDot = cls.lastIndexOf('.');
                    if (lastDot > 0) {
                        storePackages.add(cls.substring(0, lastDot));
                    }
                }
            }

            for (String pkg : storePackages) {
                String anchor = pkg + ".Anchor"; 
                // Create a synthetic anchor for the package
                for (String cls : allDefinedClasses) {
                    if (cls.startsWith(pkg + ".") && (cls.contains("Store") || cls.contains("Root_meta_pure_store"))) {
                        dependencies.computeIfAbsent(anchor, k -> new java.util.HashSet<>()).add(cls);
                        dependencies.computeIfAbsent(cls, k -> new java.util.HashSet<>()).add(anchor);
                    }
                }
                // Register anchor as a node so it participates in SCC
                allDefinedClasses.add(anchor);
            }

            // Heuristic 2: Universal Interface-Implementation Coupling
            // For every X_Impl, link with X. This ensures generated code (which often has cycles between Impl and Interface via factory methods or covariant returns)
            // is kept together.
            for (String cls : allDefinedClasses) {
                if (cls.endsWith("_Impl")) {
                    String interfaceName = cls.substring(0, cls.length() - 5);
                    if (allDefinedClasses.contains(interfaceName)) {
                         dependencies.computeIfAbsent(interfaceName, k -> new java.util.HashSet<>()).add(cls);
                         dependencies.computeIfAbsent(cls, k -> new java.util.HashSet<>()).add(interfaceName);
                    }
                }
            }
        }

        private String readEntry(java.util.zip.ZipInputStream zis, byte[] buffer) throws IOException {
            java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
            int len;
            while ((len = zis.read(buffer)) > 0) bos.write(buffer, 0, len);
            return new String(bos.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);
        }

        private java.util.List<java.util.Set<String>> computeSCCs() {
            // Tarjan's
            Tarjan<String> tarjan = new Tarjan<>(allDefinedClasses, dependencies);
            return tarjan.computeSCCs();
        }

        private java.util.Map<Integer, java.util.Set<Integer>> buildSCCGraph(java.util.List<java.util.Set<String>> sccs) {
            java.util.Map<String, Integer> classToSccIndex = new java.util.HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                for (String cls : sccs.get(i)) classToSccIndex.put(cls, i);
            }

            java.util.Map<Integer, java.util.Set<Integer>> graph = new java.util.HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                graph.putIfAbsent(i, new java.util.HashSet<>());
                for (String cls : sccs.get(i)) {
                    for (String dep : dependencies.getOrDefault(cls, java.util.Collections.emptySet())) {
                        if (classToSccIndex.containsKey(dep)) {
                            int targetScc = classToSccIndex.get(dep);
                            if (targetScc != i) {
                                graph.get(i).add(targetScc);
                            }
                        }
                    }
                }
            }
            return graph;
        }

        private int[] calculateDepths(int numSCCs, java.util.Map<Integer, java.util.Set<Integer>> graph) {
            int[] depths = new int[numSCCs];
            java.util.Arrays.fill(depths, -1);
            
            for (int i = 0; i < numSCCs; i++) {
                getDepth(i, graph, depths);
            }
            return depths;
        }

        private int getDepth(int node, java.util.Map<Integer, java.util.Set<Integer>> graph, int[] depths) {
            if (depths[node] != -1) return depths[node];
            
            int maxParentDepth = -1;
            // node depends on valid dependencies in graph
            for (int dep : graph.getOrDefault(node, java.util.Collections.emptySet())) {
                maxParentDepth = Math.max(maxParentDepth, getDepth(dep, graph, depths));
            }
            
            depths[node] = 1 + maxParentDepth;
            return depths[node];
        }

        private void writeManifest(java.util.List<java.util.Set<String>> sccs, int[] depths) throws IOException {
            try (java.io.Writer writer = new java.io.FileWriter(output)) {
                writer.write("{\n");
                boolean first = true;
                
                for (int i = 0; i < sccs.size(); i++) {
                    int depth = depths[i];
                    int layer;
                    int shard;
                    
                    if (depth < totalLayers) {
                        layer = depth;
                        String rep = sccs.get(i).iterator().next();
                        shard = Math.abs(rep.hashCode()) % totalShards;
                    } else {
                        layer = totalLayers - 1;
                        shard = 0; 
                    }
                    
                    for (String cls : sccs.get(i)) {
                        String path = classToPath.get(cls);
                        if (path == null) continue;
                        
                        if (!first) writer.write(",\n");
                        writer.write("  \"" + escape(path) + "\": {\"layer\": " + layer + ", \"shard\": " + shard + "}");
                        first = false;
                    }
                }
                writer.write("\n}");
            }
        }
        
        private String escape(String s) {
            return s.replace("\\", "\\\\").replace("\"", "\\\"");
        }
    }
    
    // Tarjan class remains same, assume it is after Processor in the file


    private static class Tarjan<T> {
        private final java.util.Set<T> nodes;
        private final java.util.Map<T, java.util.Set<T>> adj;
        private int index = 0;
        private final java.util.Stack<T> stack = new java.util.Stack<>();
        private final java.util.Map<T, Integer> indices = new java.util.HashMap<>();
        private final java.util.Map<T, Integer> lowLink = new java.util.HashMap<>();
        private final java.util.Set<T> onStack = new java.util.HashSet<>();
        private final java.util.List<java.util.Set<T>> sccs = new java.util.ArrayList<>();

        Tarjan(java.util.Set<T> nodes, java.util.Map<T, java.util.Set<T>> adj) {
            this.nodes = nodes;
            this.adj = adj;
        }

        java.util.List<java.util.Set<T>> computeSCCs() {
            for (T node : nodes) {
                if (!indices.containsKey(node)) {
                    strongConnect(node);
                }
            }
            return sccs;
        }

        private void strongConnect(T v) {
            indices.put(v, index);
            lowLink.put(v, index);
            index++;
            stack.push(v);
            onStack.add(v);

            for (T w : adj.getOrDefault(v, java.util.Collections.emptySet())) {
                if (!nodes.contains(w)) continue;
                
                if (!indices.containsKey(w)) {
                    strongConnect(w);
                    lowLink.put(v, Math.min(lowLink.get(v), lowLink.get(w)));
                } else if (onStack.contains(w)) {
                    lowLink.put(v, Math.min(lowLink.get(v), indices.get(w)));
                }
            }

            if (lowLink.get(v).equals(indices.get(v))) {
                java.util.Set<T> scc = new java.util.HashSet<>();
                T w;
                do {
                    w = stack.pop();
                    onStack.remove(w);
                    scc.add(w);
                } while (!w.equals(v));
                sccs.add(scc);
            }
        }
    }
}

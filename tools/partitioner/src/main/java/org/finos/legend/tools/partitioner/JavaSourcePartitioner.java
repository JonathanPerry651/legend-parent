package org.finos.legend.tools.partitioner;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JavaSourcePartitioner {
    public static void main(String[] args) throws IOException {
        if (args.length < 4) {
            System.err.println("Usage: <numLayers> <numShards> <outputFile_0_0> ... <outputFile_L_S> <inputSrcJar> [dependenciesJsonPath]");
            System.exit(1);
        }

        try {
            int numLayers = Integer.parseInt(args[0]);
            int numShards = Integer.parseInt(args[1]);
            int expectedOutputFiles = numLayers * numShards;

            if (args.length < 2 + expectedOutputFiles + 1) {
                System.err.println("Expected " + expectedOutputFiles + " output files, but arguments are insufficient.");
                System.exit(1);
            }

            List<File> outputFiles = new ArrayList<>();
            for (int i = 0; i < expectedOutputFiles; i++) {
                outputFiles.add(new File(args[2 + i]));
            }

            File inputSrcJar = new File(args[2 + expectedOutputFiles]);
            File dependenciesJsonFile = null;
            if (args.length > 2 + expectedOutputFiles + 1) {
                dependenciesJsonFile = new File(args[2 + expectedOutputFiles + 1]);
            }

            System.out.println("Partitioning " + inputSrcJar + " into " + numLayers + " layers, " + numShards + " shards.");
            new ExplodeProcessor(inputSrcJar, outputFiles, dependenciesJsonFile, numLayers, numShards).process();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static class ExplodeProcessor {
        private final File inputSrcJar;
        private final List<File> outputFiles; // flatted list: layer 0 shard 0, layer 0 shard 1, ...
        private final File dependenciesJsonFile;
        private final int numLayers;
        private final int numShards;

        private final Map<String, Set<String>> dependencies = new HashMap<>();
        private final Map<String, String> classToPath = new HashMap<>();
        private final Set<String> allDefinedClasses = new HashSet<>();

        ExplodeProcessor(File inputSrcJar, List<File> outputFiles, File dependenciesJsonFile, int numLayers, int numShards) {
            this.inputSrcJar = inputSrcJar;
            this.outputFiles = outputFiles;
            this.dependenciesJsonFile = dependenciesJsonFile;
            this.numLayers = numLayers;
            this.numShards = numShards;
        }

        void process() throws IOException {
            // 1. Load Dependencies (External)
            loadDependencies();

            // 2. Class scanning & Internal Dependencies
            // This populates classToPath AND reads dependencies.json if found in zip (and not already loaded)
            scanJarStructure();

            // 3. Validation
            if (dependencies.isEmpty()) {
                throw new IOException("No dependencies found. 'dependencies.json' is missing from jar and no external file provided.");
            }

            // 3.5 Connect orphan classes to CoreGen
            // Classes scanned from srcjar but not in dependencies.json need to be connected
            // to avoid being assigned to random shards
            String coreGenClass = "org.finos.legend.pure.generated.CoreGen";
            if (dependencies.containsKey(coreGenClass)) {
                for (String cls : allDefinedClasses) {
                    if (!dependencies.containsKey(cls)) {
                        // Orphan class - add it with bidirectional CoreGen dependency
                        Set<String> clsDeps = new HashSet<>();
                        clsDeps.add(coreGenClass);
                        dependencies.put(cls, clsDeps);
                        dependencies.get(coreGenClass).add(cls);
                    }
                }
            }

            // 3.6 Apply Heuristics
            applyHeuristics();

            // 3. Compute Layers/Shards
            Map<String, PartitionInfo> classPartitioning = computePartitioning();

            // 4. Invert map: Path -> PartitionInfo
            Map<String, PartitionInfo> pathToPartition = new HashMap<>();
            for (Map.Entry<String, PartitionInfo> entry : classPartitioning.entrySet()) {
                String path = classToPath.get(entry.getKey());
                if (path != null) {
                   pathToPartition.put(path, entry.getValue());
                }
            }
            
            // 5. Explode!
            explode(pathToPartition);
        }

        private void loadDependencies() throws IOException {
            if (dependenciesJsonFile != null && dependenciesJsonFile.exists()) {
                System.out.println("Loading external dependencies.json from " + dependenciesJsonFile);
                parseDependenciesJson(Files.readString(dependenciesJsonFile.toPath()));
            }
        }

        private void scanJarStructure() throws IOException {
            System.out.println("Scanning input jar structure...");
            boolean internalDependenciesFound = false;

            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(inputSrcJar))) {
                ZipEntry entry;
                byte[] buffer = new byte[8192];
                while ((entry = zis.getNextEntry()) != null) {
                    String name = entry.getName();
                    if (name.endsWith("dependencies.json") && dependencies.isEmpty()) {
                         System.out.println("Found embedded dependencies.json");
                         String jsonContent = readEntry(zis, buffer);
                         parseDependenciesJson(jsonContent);
                         internalDependenciesFound = true;
                    } else if (name.endsWith(".java")) {
                        // Quick scan for package/class declaration
                        // We assume one main class per file usually, or at least we need to find the matching one.
                        String content = readEntry(zis, buffer);
                        String fqn = extractFqn(content);
                        if (fqn != null) {
                            classToPath.put(fqn, name);
                            allDefinedClasses.add(fqn);
                        }
                    }
                }
            }
            
            if (dependencies.isEmpty()) {
                throw new IOException("dependencies.json not found (neither external nor embedded).");
            }
        }
        
        private String extractFqn(String content) {
            // Simple regex extract
            java.util.regex.Matcher pkgMatcher = java.util.regex.Pattern.compile("package\\s+([\\w.]+);").matcher(content);
            String pkg = "";
            if (pkgMatcher.find()) pkg = pkgMatcher.group(1);

            java.util.regex.Matcher classMatcher = java.util.regex.Pattern.compile("(?:class|interface|enum)\\s+([\\w$]+)").matcher(content);
            if (classMatcher.find()) {
                String simpleName = classMatcher.group(1);
                return (pkg.isEmpty() ? "" : pkg + ".") + simpleName;
            }
            return null;
        }

        private void parseDependenciesJson(String jsonContent) {
            JSONObject json = (JSONObject) JSONValue.parse(jsonContent);
             if (json != null) {
                 for (Object key : json.keySet()) {
                     String className = (String) key;
                     JSONArray deps = (JSONArray) json.get(key);
                     Set<String> depSet = new HashSet<>();
                     if (deps != null) {
                         for (Object dep : deps) depSet.add((String) dep);
                     }
                     dependencies.put(className, depSet);
                 }
             }
        }

        // --- Partitioning Logic (Similar to previous Processor) ---

        private void applyHeuristics() {
            // All dependencies should be formally correct from dependencies.json.
            // No heuristics needed if the generator is correct.
        }

        private Map<String, PartitionInfo> computePartitioning() {
            System.out.println("Computing SCCs and partitioning...");
            Tarjan<String> tarjan = new Tarjan<>(allDefinedClasses, dependencies);
            List<Set<String>> sccs = tarjan.computeSCCs();
            
            System.out.println("Found " + sccs.size() + " SCCs.");

            // Build SCC index for quick lookup
            Map<String, Integer> classToSccIndex = new HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                for (String cls : sccs.get(i)) {
                    classToSccIndex.put(cls, i);
                }
            }

            Map<Integer, Set<Integer>> sccGraph = buildSCCGraph(sccs);
            int[] sccDepths = calculateDepths(sccs.size(), sccGraph);
            
            // Group SCCs by layer (depth)
            Map<Integer, List<Integer>> sccsByLayer = new HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                int layer = Math.min(sccDepths[i], numLayers - 1);
                sccsByLayer.computeIfAbsent(layer, k -> new ArrayList<>()).add(i);
            }
            
            // For each layer, check if any SCC has dependencies on another SCC in the SAME layer
            // If so, they must be in the same shard. Use Union-Find to merge them.
            Map<Integer, int[]> layerShardAssignment = new HashMap<>();
            
            for (Map.Entry<Integer, List<Integer>> entry : sccsByLayer.entrySet()) {
                int layer = entry.getKey();
                List<Integer> sccIndices = entry.getValue();
                
                // Union-Find for SCCs in this layer
                int[] parent = new int[sccs.size()];
                for (int i = 0; i < parent.length; i++) parent[i] = i;
                
                // Check each SCC's dependencies - if target SCC is in same layer, union them
                for (int sccIdx : sccIndices) {
                    for (String cls : sccs.get(sccIdx)) {
                        for (String dep : dependencies.getOrDefault(cls, Collections.emptySet())) {
                            Integer depSccIdx = classToSccIndex.get(dep);
                            if (depSccIdx != null && depSccIdx != sccIdx) {
                                int depLayer = Math.min(sccDepths[depSccIdx], numLayers - 1);
                                if (depLayer == layer) {
                                    // Same layer - must be in same shard
                                    union(parent, sccIdx, depSccIdx);
                                }
                            }
                        }
                    }
                }
                
                // Assign shard numbers based on union-find roots
                Map<Integer, Integer> rootToShard = new HashMap<>();
                int nextShard = 0;
                for (int sccIdx : sccIndices) {
                    int root = find(parent, sccIdx);
                    if (!rootToShard.containsKey(root)) {
                        rootToShard.put(root, nextShard % numShards);
                        nextShard++;
                    }
                }
                
                // Store assignments
                for (int sccIdx : sccIndices) {
                    int root = find(parent, sccIdx);
                    if (layerShardAssignment.get(sccIdx) == null) {
                        layerShardAssignment.put(sccIdx, new int[]{layer, rootToShard.get(root)});
                    }
                }
            }

            // Build final assignment
            Map<String, PartitionInfo> assignment = new HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                int[] layerShard = layerShardAssignment.get(i);
                if (layerShard == null) {
                    layerShard = new int[]{0, 0}; // fallback
                }
                PartitionInfo info = new PartitionInfo(layerShard[0], layerShard[1]);
                for (String cls : sccs.get(i)) {
                    assignment.put(cls, info);
                }
            }
            return assignment;
        }
        
        private int find(int[] parent, int i) {
            if (parent[i] != i) {
                parent[i] = find(parent, parent[i]); // path compression
            }
            return parent[i];
        }
        
        private void union(int[] parent, int a, int b) {
            int rootA = find(parent, a);
            int rootB = find(parent, b);
            if (rootA != rootB) {
                parent[rootA] = rootB;
            }
        }

        private Map<Integer, Set<Integer>> buildSCCGraph(List<Set<String>> sccs) {
            Map<String, Integer> classToSccIndex = new HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                for (String cls : sccs.get(i)) classToSccIndex.put(cls, i);
            }

            Map<Integer, Set<Integer>> graph = new HashMap<>();
            for (int i = 0; i < sccs.size(); i++) {
                graph.putIfAbsent(i, new HashSet<>());
                for (String cls : sccs.get(i)) {
                    for (String dep : dependencies.getOrDefault(cls, Collections.emptySet())) {
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

        private int[] calculateDepths(int numSCCs, Map<Integer, Set<Integer>> graph) {
            int[] depths = new int[numSCCs];
            Arrays.fill(depths, -1);
            for (int i = 0; i < numSCCs; i++) {
                getDepth(i, graph, depths);
            }
            return depths;
        }

        private int getDepth(int node, Map<Integer, Set<Integer>> graph, int[] depths) {
            if (depths[node] != -1) return depths[node];
            int maxParentDepth = -1;
            for (int dep : graph.getOrDefault(node, Collections.emptySet())) {
                maxParentDepth = Math.max(maxParentDepth, getDepth(dep, graph, depths));
            }
            depths[node] = 1 + maxParentDepth;
            return depths[node];
        }

        // --- Explosion Logic ---

        private void explode(Map<String, PartitionInfo> pathToPartition) throws IOException {
             System.out.println("Exploding jar into " + outputFiles.size() + " outputs...");
             
             // Open all output streams
             List<ZipOutputStream> outputs = new ArrayList<>(outputFiles.size());
             try {
                 for (File f : outputFiles) {
                     outputs.add(new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(f))));
                 }

                 try (ZipInputStream zis = new ZipInputStream(new FileInputStream(inputSrcJar))) {
                     ZipEntry entry;
                     byte[] buffer = new byte[8192];
                     while ((entry = zis.getNextEntry()) != null) {
                         String path = entry.getName();
                         
                         // Determine target
                         int targetIndex = -1;
                         if (pathToPartition.containsKey(path)) {
                             PartitionInfo info = pathToPartition.get(path);
                             targetIndex = (info.layer * numShards) + info.shard;
                         }
                         
                         // If not found in partition map (e.g. non-java files, or excluded classes), 
                         // where do they go?
                         // Strategy: If it's a java file we analyzed but didn't assign, that's partial logic mismatch.
                         // If it's a resource (not .java), we usually replicate or put in specific place?
                         // In partition schema, resources are often handled separately or put in Layer 0 / Common.
                         // Let's put everything unassigned into L0 S0.
                         if (targetIndex == -1 || targetIndex >= outputs.size()) {
                             targetIndex = 0; 
                         }

                         ZipOutputStream target = outputs.get(targetIndex);
                         synchronized(target) { // Not parallel, but good habit
                             target.putNextEntry(new ZipEntry(entry.getName()));
                             int len;
                             while ((len = zis.read(buffer)) > 0) {
                                target.write(buffer, 0, len);
                             }
                             target.closeEntry();
                         }
                     }
                 }

             } finally {
                 // Close all outputs
                 for (ZipOutputStream zos : outputs) {
                     if (zos != null) {
                         try { zos.close(); } catch (IOException ignored) {}
                     }
                 }
             }
        }

        private String readEntry(ZipInputStream zis, byte[] buffer) throws IOException {
            // Be careful not to close the stream!
            // We can't really read "all bytes" easily without potentially messing up position if we don't fully consume? 
            // readEntry is mostly utilized when we want to parse it. 
            // We use ByteArrayOutputStream
            java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
            int len;
            // ZipInputStream.read reads from current entry
            while ((len = zis.read(buffer)) > 0) bos.write(buffer, 0, len);
            return new String(bos.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    private static class PartitionInfo {
        int layer;
        int shard;
        PartitionInfo(int layer, int shard) { this.layer = layer; this.shard = shard; }
    }

    private static class Tarjan<T> {
        private final Set<T> nodes;
        private final Map<T, Set<T>> adj;
        private int index = 0;
        private final Stack<T> stack = new Stack<>();
        private final Map<T, Integer> indices = new HashMap<>();
        private final Map<T, Integer> lowLink = new HashMap<>();
        private final Set<T> onStack = new HashSet<>();
        private final List<Set<T>> sccs = new ArrayList<>();

        Tarjan(Set<T> nodes, Map<T, Set<T>> adj) {
            this.nodes = nodes;
            this.adj = adj;
        }

        List<Set<T>> computeSCCs() {
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

            for (T w : adj.getOrDefault(v, Collections.emptySet())) {
                if (!nodes.contains(w)) continue;
                if (!indices.containsKey(w)) {
                    strongConnect(w);
                    lowLink.put(v, Math.min(lowLink.get(v), lowLink.get(w)));
                } else if (onStack.contains(w)) {
                    lowLink.put(v, Math.min(lowLink.get(v), indices.get(w)));
                }
            }

            if (lowLink.get(v).equals(indices.get(v))) {
                Set<T> scc = new HashSet<>();
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

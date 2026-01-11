# Legend Bazel Migration Specification

## 1. Objective
Refactor the build system of the Legend platform (`legend-parent` and submodules) from Maven to Bazel to improve build performance, hermeticity, and reproducibility. The goal is a functionality-equivalent build that leverages Bazel's caching and remote execution capabilities.

## 2. Core Principles
*   **Pure Build Port**: Logic changes to Java or Pure code are **STRICTLY FORBIDDEN**. The goal is a functionality-equivalent build.
    *   **Exception**: Changes are permitted *only* if absolutely necessary to fix build-system induced behavior variances (e.g., serialization differences) and must be exhaustively justified.
    *   **Constraint**: The end goal is a full port to Bazel with an **absolute minimum** of Java and Pure changes.
*   **Maven Parity**: The Bazel build must produce artifacts and test results equivalent to the Maven build. Maven is the source of truth for debugging.
*   **Granularity**: Favor granular `BUILD` files at leaf directories over monolithic root build files. This maximizes parallelism and caching.
*   **Explicit Sources**: Avoid `glob()` in Java rules. List sources explicitly to ensure strict dependency tracking and cache invalidation.
*   **Remote Execution**: All builds and tests must be compatible with remote execution (`rbazel`), enforcing strict hermeticity (no reliance on local environment).

## 3. Architecture & Patterns

### 3.1. Target Conventions
*   **Java Targets**: `java_library` and `java_test` targets should be named after the primary class they contain (e.g., `TestCoreFunctions`).
*   **Test Macros**: Use the `pure_test` macro to reduce boilerplate for standard Java tests. This macro handles common dependencies and configuration.
*   **Partitioning**: Large compilation targets (like generated Pure code) use metadata-driven partitioning to split the workload into smaller shards, preventing timeouts and OOM errors.

### 3.2. Dependency Management
*   **Explicit Dependencies**: All intra-repo dependencies must be explicitly declared.
*   **Strict Visibility**: `java_import` and other rules should have restricted visibility where possible to prevent accidental usage of internal APIs.

## 4. Key Learnings & Resolutions

### 4.1. Serialization Mismatch (`UnknownInstanceException`)
**Issue**: Tests failed with `UnknownInstanceException` for `FunctionType` instances.
**Diagnosis**: A mismatch between how `FunctionType` instances were filtered during serialization. Instances created in the `platform` repo context but logically belonging to `core` were rejected by the `platform` serializer as "different source" and missed by the `core` serializer as "orphaned".
**Resolution**: Patched `DistributedBinaryRepositorySerializer.java` to explicitly allow `FunctionType` instances to be serialized even if they originate from a different source. This ensures all necessary metadata is captured.

### 4.2. Runfiles Propagation
**Issue**: `run_shell` actions failed to find required Java classes (e.g., `Connection`).
**Diagnosis**: Bazel does not automatically propagate runfiles (runtime dependencies) to `genrule` or `run_shell` actions unless explicitly added to `inputs`.
**Resolution**: Updated `pure.bzl` macros to explicitly include `tool_runfiles` in the input set of shell actions, ensuring the classpath is complete during code generation.

### 4.3. Classloader Isolation in Tests
**Issue**: `ServiceConfigurationError` and missing compiled classes during tests.
**Diagnosis**: Bazel's test runner isolates classloaders more strictly than Maven/Surefire.
**Resolution**: Ensured that all necessary `CodeRepositoryProvider` implementations and generated metadata JARs are included in the runtime classpath of the test targets.

### 4.4. Remote Execution Compatibility
**Issue**: Tests passing locally but failing remotely (or vice-versa).
**Diagnosis**: Implicit reliance on local file system paths or environment variables.
**Resolution**: Removed absolute paths in favor of Bazel's `$(location ...)` expansion. Ensured all inputs are declared so they are uploaded to the remote executor.

## 5. Migration Workflow

### 5.1. Porting a Module
1.  **Analyze Maven Config**: Check the `pom.xml` for dependencies, source directories, and plugins.
2.  **Create BUILD File**: Create a `BUILD.bazel` file in the module directory.
    *   Use `java_library` for main sources.
    *   Use `java_test` (or `pure_test` macro) for test sources.
3.  **Define Dependencies**: Explicitly list all internal (`//...`) and external (`@maven//...`) dependencies.
    *   *Tip*: Use `bazel query` or `jdeps` to verify dependencies if unsure.
4.  **Remote Verification**: Always run builds and tests with `tools/rbazel` to verify remote execution compatibility.
    *   `tools/rbazel test //path/to:target`

### 5.2. Adding a New Dependency
1.  **Check Existing**: Verify if the dependency is already available in `maven_install.json` or `WORKSPACE`.
2.  **Add to Maven Registry**: If new, add it to the appropriate `maven_install` rule in `WORKSPACE`.
3.  **Pin Version**: Run the pinning script (e.g., `REPIN=1 bazel run @unpinned_maven//:pin`) to update the lockfile.
4.  **Use in BUILD**: Reference it as `@maven//:group_artifact`.

## 6. Ongoing Work
*   **Stabilize Full Suite**: Running `bazel test //...` to identify and fix flaky tests and remaining hermeticity leaks.
*   **Performance Tuning**: Optimizing shard sizes and worker counts for remote execution.

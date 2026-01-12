# Legend Bazel Style Guide

This document defines the coding standards and best practices for Bazel `BUILD` and `.bzl` files within the Legend platform. Adherence to these rules is critical for ensuring hermeticity, reproducibility, and remote execution compatibility.

## 1. Core Philosophy
*   **Rule Preference Hierarchy**:
    1.  **Native Build Rules**: `java_library`, `java_binary`, `filegroup`, etc.
    2.  **Custom Starlark Rules**: Implementing dedicated rules using native actions (`ctx.actions.declare_file`, `ctx.actions.declare_directory`, `ctx.actions.symlink`).
    3.  **Symbolic Macros**: Modern Starlark macros.
    4.  **Legacy Macros**: Traditional Starlark macros.
    *   **Last Resort**: Shell scripts or `genrule` usage. These should be avoided whenever possible in favor of first-class rule implementations.
*   **Hermeticity**: Every action must define **all** its inputs and outputs. No reliance on system libraries, absolute paths, or undeclared environment variables.
*   **Granularity**: Define targets and `BUILD.bazel` files at the most granular level possible (e.g., per-package or per-functional-unit) to maximize caching and parallelism.

## 2. Rule Authoring
### 2.1. File Arguments over Hardcoded Paths
*   **Rule**: Never hardcode file paths in scripts or rule implementations. Pass files as arguments to macros and rules.
*   **Pattern**:
    ```starlark
    # BAD
    run_shell(command = "python script.py") # Implicit reliance on system python

    # GOOD
    run_shell(
        tools = ["//tools:my_java_tool"],
        inputs = [data],
        # Toolchains should be used for standard tools like 'jar' or 'java'
        command = "$(location //tools:my_java_tool) $(location data)"
    )
    ```

### 2.2. Toolchains & Hermeticity
*   **No System Tools**: Do not rely on tools installed on the host OS (e.g., `python`, `bash`, `sed` outside of standard shell usage). This is a Java codebase; unnecessary Python, Perl, or other script dependencies should be avoided.
*   **Toolchains**: Standard tools (like `jar`, `java`, `javac`) must be resolved via Bazel toolchains.
    *   *Example*: Use `@bazel_tools//tools/jdk:current_java_runtime` to get the hermetic JDK.
*   **Declared Dependencies**: Every tool used in an action must be declared in `tools` or `inputs`.

### 2.3. Path Mapping & Location Expansion
*   **Requirement**: All actions must use Bazel's Path Mapping via `$(location ...)` or `$(locations ...)` expansion.
*   **Why**: Remote executors may place files in arbitrary locations. `$(location)` ensures the script receives the correct, absolute runtime path to the artifact.
*   **Implementation**:
    *   In `genrule` `cmd`: use `$(location //my:target)`.
    *   In Starlark `ctx.actions.run`: ensure arguments use `file.path`.

### 2.4. Runfiles
*   **Requirement**: Explicitly include runtime dependencies (`runfiles`) in the inputs of any action that executes a tool.
*   **Pattern**: If a custom rule invokes a `java_binary` tool, it must add `tool_target[DefaultInfo].default_runfiles.files` to the action's inputs.

## 3. Java Rules
*   **Sources**: Explicitly list source files. **DO NOT USE GLOB**.
    *   *Why*: Dependencies change, and globs hide these changes, leading to over-building or under-building.
*   **Targets**: Name the target the same as the main class (e.g., `MyClass` for `MyClass.java`).

## 4. Path Handling in Scripts
*   **Relative Paths**: Scripts should ideally work with relative paths from the repository root.
*   **Output Directories**: Scripts must write only to the outputs declared by Bazel. Beware of tools that try to create parent directories or write to read-only locations.

## 5. Migration & Temporary Artifacts
*   **Ad-Hoc Scripts**: Any shell scripts, Python scripts, or temporary tools generated or used to assist in the migration process (e.g., source list generators, one-off file modifiers) **MUST** be placed in the `debug_artifacts/` directory.
*   **Repo Pollution**: Do not clutter the `tools/` directory or the source tree with migration scripts. `tools/` is reserved for permanent, committed build tools.
*   **Artifacts Directory**: Use `<appDataDir>/brain/<conversation-id>` or `debug_artifacts/` for intermediate files.

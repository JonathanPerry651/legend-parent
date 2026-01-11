# Legend Bazel Style Guide

This document defines the coding standards and best practices for Bazel `BUILD` and `.bzl` files within the Legend platform. Adherence to these rules is critical for ensuring hermeticity, reproducibility, and remote execution compatibility.

## 1. Core Philosophy
*   **Native Rules First**: Always prefer native Bazel rules (`java_library`, `genrule`, `filegroup`) over custom Starlark macros or shell scripts unless absolutely necessary.
*   **Hermeticity**: Every action must define **all** its inputs and outputs. No reliance on system libraries, absolute paths, or undeclared environment variables.
*   **Granularity**: Define targets at the most granular level possible (e.g., per-package or per-functional-unit) to maximize caching and parallelism.

## 2. Rule Authoring
### 2.1. File Arguments over Hardcoded Paths
*   **Rule**: Never hardcode file paths in scripts or rule implementations. Pass files as arguments to macros and rules.
*   **Pattern**:
    ```starlark
    # BAD
    run_shell(command = "python script.py") # Implicitly expects script.py in CWD

    # GOOD
    run_shell(
        inputs = [script, data],
        command = "python $(location script) $(location data)"
    )
    ```

### 2.2. Path Mapping & Location Expansion
*   **Requirement**: All actions must use Bazel's Path Mapping via `$(location ...)` or `$(locations ...)` expansion.
*   **Why**: Remote executors may place files in arbitrary locations. `$(location)` ensures the script receives the correct, absolute runtime path to the artifact.
*   **Implementation**:
    *   In `genrule` `cmd`: use `$(location //my:target)`.
    *   In Starlark `ctx.actions.run`: ensure arguments use `file.path`.

### 2.3. Runfiles
*   **Requirement**: Explicitly include runtime dependencies (`runfiles`) in the inputs of any action that executes a tool.
*   **Pattern**: If a custom rule invokes a `java_binary` tool, it must add `tool_target[DefaultInfo].default_runfiles.files` to the action's inputs.

## 3. Java Rules
*   **Sources**: Explicitly list source files. **DO NOT USE GLOB**.
    *   *Why*: Dependencies change, and globs hide these changes, leading to over-building or under-building.
*   **Targets**: Name the target the same as the main class (e.g., `MyClass` for `MyClass.java`).

## 4. Path Handling in Scripts
*   **Relative Paths**: Scripts should ideally work with relative paths from the repository root.
*   **Output Directories**: Scripts must write only to the outputs declared by Bazel. Beware of tools that try to create parent directories or write to read-only locations.

# Legend Parent Repository Index

Welcome to the `legend-parent` repository. This is the root of the Legend platform monorepo (during the migration phase).

## Repository Structure

### [Port to Bazel](port_to_bazel/)
Contains documentation and specifications for the Maven-to-Bazel migration.
*   [Migration Specification](port_to_bazel/bazel_migration_spec.md)
*   [Style Guide](port_to_bazel/bazel_style_guide.md)
*   [Todo List & Tech Debt](port_to_bazel/todo_list.md)

### Submodules

#### [legend-pure](legend-pure/INDEX.md)
The core language definition and execution engine for Pure.
*   **Core**: M3 metamodel.
*   **Runtime**: Execution engines (Compiled, Interpreted).
*   **DSL**: Domain Specific Extensions.

#### [legend-engine](legend-engine/INDEX.md)
The Legend Engine, providing protocol handling, compilation, and execution services.
*   **Core**: Base language and protocol support.
*   **Extensions**: External store and format integrations.

#### [legend-sdlc](legend-sdlc/INDEX.md)
Software Development Life Cycle management for Legend models.

#### [legend-shared](legend-shared/INDEX.md)
Shared utility libraries and common infrastructure.

## Key Build Files
*   `WORKSPACE`: Bazel workspace definition and external dependencies.
*   `MODULE.bazel`: Bzlmod configuration (if/when enabled).
*   `tools/`: Build scripts and custom rules (`rbazel`, `pure.bzl`, etc.).

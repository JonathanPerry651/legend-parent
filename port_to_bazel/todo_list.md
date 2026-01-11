# Bazel Migration Todo List & Technical Debt

This document tracks pieces of code, patterns, or architecture that conflict with the goals of the Bazel migration (hermeticity, granularity, reproducibility) or require future refactoring.

## Overview
*   **Status**: Living document.
*   **Action**: Add items here as they are identified during the porting process.

## Backlog

### Build Rules
*   [ ] **Widespread Glob Usage**: Many `BUILD` files use `glob()` for Java sources, violating the explicit source listing rule.
    *   *Examples*: `legend-pure-runtime-java-engine-interpreted` (fixed). `legend-pure-dsl-path` (fixed). `legend-pure-dsl-diagram` (fixed). `legend-pure-dsl-graph` (fixed). `legend-pure-dsl-mapping` (fixed). `legend-pure-dsl-store` (fixed). `legend-pure-dsl-tds` (fixed). `legend-pure-store-relational` (fixed). `legend-pure-m4` (fixed). `legend-pure-m3-bootstrap-generator` (fixed). `legend-pure-m3-precisePrimitives` (fixed). Other `legend-pure-dsl-*` modules (pending).
    *   *Note*: `legend-pure-m3-core` and `legend-pure-m4` plus core boot modules were verified as using explicit sources.
    *   *Impact*: Reduces cache invalidation precision and hides dependency changes.
*   [ ] **Excessive Genrules**: Several modules use `genrule` for code generation instead of custom Starlark rules.
    *   *Examples*: `legend-pure-m3-core` (platform generation), `legend-engine-pure-code-compiled-core`.
    *   *Impact*: Harder to maintain, less structured than proper rule implementations.

### [Example Category]
*   [ ] **Item Description**: Brief explanation of why this is an issue (e.g., "Class X uses hardcoded paths").
    *   *Location*: `path/to/file.java`
    *   *Impact*: Breaks remote execution.

# Bazel Migration Todo List & Technical Debt

This document tracks pieces of code, patterns, or architecture that conflict with the goals of the Bazel migration (hermeticity, granularity, reproducibility) or require future refactoring.

## Overview
*   **Status**: Living document.
*   **Action**: Add items here as they are identified during the porting process.

## Backlog

### [Example Category]
*   [ ] **Item Description**: Brief explanation of why this is an issue (e.g., "Class X uses hardcoded paths").
    *   *Location*: `path/to/file.java`
    *   *Impact*: Breaks remote execution.

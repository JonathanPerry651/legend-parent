# M3 Code Generation Strategy & Refactoring

## Context: The "Split Brain" Problem

In the Pure/Legend ecosystem, types can be treated in two ways during Java code generation:
1.  **User Types**: Generated as `org.finos.legend.pure.generated.Root_...` classes. This is the default for most models.
2.  **Platform Types (M3)**: Generated as `org.finos.legend.pure.m3.coreinstance...` interfaces. These are "baked in" to the platform.

### Maven Analysis (The "Split Brain")

In the Maven build, we observe a "Split Brain" situation where `Store` and `Connection` exist in dual states across different jars.

**1. `dsl-store` (Generates M3 Types)**
In `legend-pure-runtime-java-extension-compiled-dsl-store/pom.xml`, the bootstrapping of M3 types is handled carefully.
The `GenerateFactoryClasses` execution generates the `StoreCoreInstanceFactoryRegistry.java` (which creates M3 Store instances).
Then, a **`pre-compile` execution** (lines 36-46) compiles `src/main/java` (including `StoreExtensionCompiled.java`) **before** the main `JavaCodeGeneration` step.

This allows `StoreExtensionCompiled` (which registers the M3 types) to be available on the classpath when the Pure-to-Java generator runs. Because the generator sees the extension, it treats `Store` as a Platform Type (M3).

**2. `compiled-core` (Generates User Types)**
In `legend-engine-pure-code-compiled-core/pom.xml`, the `legend-pure-maven-generation-java` plugin runs **without** the `dsl-store` extension in its dependencies:

```xml
<!-- legend-engine-pure-code-compiled-core/pom.xml -->
<plugin>
    <groupId>org.finos.legend.pure</groupId>
    <artifactId>legend-pure-maven-generation-java</artifactId>
    <dependencies>
        <!-- MISSING: legend-pure-runtime-java-extension-compiled-dsl-store -->
        <dependency>org.finos.legend.pure:legend-pure-runtime-java-extension-compiled-dsl-mapping</dependency>
        <!-- ... -->
    </dependencies>
</plugin>
```

Because the generator (Plugin Classpath) does not see `StoreExtensionCompiled`, it falls back to treating `Store` and `Connection` as **User Types**, creating `Root_meta_pure_store_Store` and `Root_meta_core_runtime_Connection` classes.

**Result in Maven:**
*   `dsl-store` uses M3 types internally.
*   `compiled-core` re-generates `Root_` types for the same concepts.
*   Handwritten Java code (e.g., `HelperRuntimeBuilder`) relies on `Root_` types.
*   The JVM allows this "Split Brain" (both types exist at runtime), but it is fragile and inconsistent.

### The Cycle & The Fix

The underlying cycle that Maven solves via "pre-compile" magic is:
**Generator <-> Extension <-> Generated Types**

1.  **Generator** (Java execution) needs **Extension** (Java class) to know types are M3.
2.  **Extension** registers the types, but is itself part of the library being built.
3.  **Generated Types** (the output) are part of the same library.

Maven interleaves generation and compilation steps within the single `dsl-store` module build to bootstrap this.
Bazel requires a strict, acyclic graph. We cannot have a library depend on itself during its own build.

**Bazel Solution: strict M3 Alignment**
We solve the cycle and the "Split Brain" by enforcing M3 utilization globally.
We explicitly provide the `store-compiled-extension` (built as a separate, upstream bootstrap target) to the `runtime_deps` of the Generator for `compiled-core`.

```starlark
# compiled-core/BUILD.bazel
java_binary(
    name = "Generator",
    runtime_deps = [
        "//legend-pure/legend-pure-dsl/legend-pure-dsl-store/legend-pure-m2-dsl-store-pure:store-compiled-extension",
        # ...
    ]
)
```

This ensures `compiled-core` treats `Store`/`Connection` as Platform Types, matching `dsl-store`. It prevents `Root_` generation, eliminating consistency issues but requiring updates to handwritten Java code to use M3 interfaces.

## Required Java Refactors

This change breaks handwritten Java code in `legend-engine-language-pure-compiler` that relied on the Maven-specific `Root_` artifact.

**1. Imports**: Change `Root_...` imports to M3 `org.finos.legend.pure.m3.coreinstance...` types.
**2. Instantiation**: Replace `new Root_...Impl(...)` with the M3 `RuntimeCoreInstanceFactoryRegistry` pattern.

```java
// OLD (Maven/User Type Style)
new Root_meta_core_runtime_ConnectionStore_Impl("")._connection(...)

// NEW (Bazel/M3 Style)
ConnectionStore cs = (ConnectionStore) RuntimeCoreInstanceFactoryRegistry.REGISTRY
    .getFactory("meta::core::runtime::ConnectionStore")
    .createCoreInstance(new SimpleCoreInstance(...));
cs._connection(...)
```

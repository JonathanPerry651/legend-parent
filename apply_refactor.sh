#!/bin/bash

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/_boolean
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/_boolean/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCompileAnd.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompileAnd",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompileNot.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompileNot",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompileOr.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompileOr",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompilePrecedence.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompilePrecedence",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/asserts
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/asserts/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestAssert.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssert",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertContains.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertContains",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertEmpty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertEmpty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertEqWithinTolerance.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertEqWithinTolerance",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertEquals.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertEquals",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertFalse.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertFalse",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertInstanceOf.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertInstanceOf",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertNotContains.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotContains",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertNotEmpty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotEmpty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertNotEquals.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotEquals",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertNotSize.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotSize",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertSameElements.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertSameElements",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestAssertSize.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertSize",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestFail.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestFail",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/collection
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/collection/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestAtCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestAtCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledFirst.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledFirst",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledGetAll.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledGetAll",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledInit.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledInit",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledIsEmpty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledIsEmpty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledLast.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledLast",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledReverse.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledReverse",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledTail.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledTail",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMapCollection.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestMapCollection",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMapCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestMapCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMapZeroOneCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestMapZeroOneCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestRangeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestRangeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestSlice.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestSlice",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/date
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/date/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestDayOfMonth.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestDayOfMonth",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestHour.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestHour",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMinute.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestMinute",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestNewDate.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestNewDate",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestSecond.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestSecond",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/io
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/io/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPrintCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.io.TestPrintCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/lang
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/lang/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCast.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestCast",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompareCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestCompareCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCopyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestCopyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDynamicNew.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNew",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDynamicNewConstraints.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNewConstraints",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDynamicNewConstraintsHandler.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNewConstraintsHandler",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDynamicNewGetterOverride.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNewGetterOverride",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestEvaluate.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestEvaluate",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestEvaluateFunctions.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestEvaluateFunctions",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestFunctionDefinitionModify.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestFunctionDefinitionModify",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestIfCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestIfCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestLetCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestLetCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMatch.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestMatch",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestNewCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestNewCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestRawEvalPropertyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestRawEvalPropertyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/math
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/math/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestArcCosine.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestArcCosine",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestArcSine.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestArcSine",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledCeiling.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledCeiling",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledDivide.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledDivide",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledFloor.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledFloor",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledPrecedence.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledPrecedence",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledRound.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledRound",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestCompiledTimes.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledTimes",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPowCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestPowCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestRem.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestRem",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestSqrt.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestSqrt",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/meta
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/meta/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCanReactivateDynamically.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestCanReactivateDynamically",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestId.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestId",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestInstanceOf.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestInstanceOf",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPathToElement.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestPathToElement",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestReactivate.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestReactivate",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/multiplicity
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/multiplicity/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestGetUpperBound.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestGetUpperBound",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestToMultiplicity.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestToMultiplicity",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestToOne.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestToOne",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestToOneMany.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestToOneMany",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/relation
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/relation/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestColSpecType.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.relation.TestColSpecType",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/string
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/string/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestFormat.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestFormat",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestIndexOfCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestIndexOfCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestLengthCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestLengthCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestParseBooleanCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseBooleanCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestParseDateCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseDateCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestParseFloatCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseFloatCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestParseIntegerCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseIntegerCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestSubstringCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestSubstringCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestToStringCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestToStringCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestTrimCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestTrimCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestIncrementalCompilationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestIncrementalCompilationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMultipleRepoIncrementalCompilationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestMultipleRepoIncrementalCompilationCompiled",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-core/legend-pure-m3-core/src/test/java/org/finos/legend/pure/m3/tests/incremental:TestMultipleRepoIncrementalCompilation_lib",
    ],
)
java_test(
    srcs = ["TestPureRuntimeEnumerationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestPureRuntimeEnumerationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestQualifiedPropertyInheritance.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestQualifiedPropertyInheritance",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_class
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_class/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimeClass_AsFunctionReturnCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_AsFunctionReturnCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_AsPointerCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_AsPointerCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_ConstraintsCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_ConstraintsCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_FunctionExpressionParamCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_FunctionExpressionParamCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_FunctionParamTypeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_FunctionParamTypeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_InCastCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_InCastCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_InCopyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_InCopyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_InGeneralizationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_InGeneralizationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeClass_Property_UsedInAutoCollectCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_Property_UsedInAutoCollectCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_package
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_package/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimePackageCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._package.TestPureRuntimePackageCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/association
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/association/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimeAssociationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.association.TestPureRuntimeAssociationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeAssociation_AsPointerCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.association.TestPureRuntimeAssociation_AsPointerCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeAssociation_UsePropertyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.association.TestPureRuntimeAssociation_UsePropertyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/function
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/function/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimeFunction_AllCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.function.TestPureRuntimeFunction_AllCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeFunction_ConstraintCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.function.TestPureRuntimeFunction_ConstraintCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeFunction_LambdaCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.function.TestPureRuntimeFunction_LambdaCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/imports
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/imports/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimeImportCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.imports.TestPureRuntimeImportCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/milestoning
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/milestoning/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimeMilestoningCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.milestoning.TestPureRuntimeMilestoningCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/profile
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/profile/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPureRuntimeStereotypeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.profile.TestPureRuntimeStereotypeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureRuntimeTaggedValueCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.profile.TestPureRuntimeTaggedValueCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestPCRReport.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.TestPCRReport",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/features
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/features/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestAdvancedOpenVariableCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestAdvancedOpenVariableCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestConstraintsCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestConstraintsCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDefaultValueCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestDefaultValueCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDispatchQualifiedPropertiesCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestDispatchQualifiedPropertiesCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestEnumerationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestEnumerationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestMeasureCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestMeasureCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCoreFunctions.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.TestCoreFunctions",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestFunction_TesterHelper_Compiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.TestFunction_TesterHelper_Compiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["Test_Compiled_EssentialFunctions_PCT.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.Test_Compiled_EssentialFunctions_PCT",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["Test_Compiled_GrammarFunctions_PCT.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.Test_Compiled_GrammarFunctions_PCT",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions/moveToPCT
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions/moveToPCT/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestEvaluateTypeManagementCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.moveToPCT.TestEvaluateTypeManagementCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestNewInferenceCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.moveToPCT.TestNewInferenceCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCompilationError.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestCompilationError",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDspClassloading.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestDspClassloading",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestGenerationWithPureStacktraceIncluded.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestGenerationWithPureStacktraceIncluded",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestIdBuilder.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestIdBuilder",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestJavaPrimitiveTypeMapping.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestJavaPrimitiveTypeMapping",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestJavaStandaloneLibraryGenerator.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestJavaStandaloneLibraryGenerator",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestPureCacheMap.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestPureCacheMap",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/compiler
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/compiler/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestMemoryFileManager.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.compiler.TestMemoryFileManager",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestStringJavaSource.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.compiler.TestStringJavaSource",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestJavaPackageAndImportBuilder.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.generation.TestJavaPackageAndImportBuilder",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/support
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/support/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCoreExtensionCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.generation.processors.support.TestCoreExtensionCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/type
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/type/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestTypeProcessor.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.generation.processors.type.TestTypeProcessor",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestMultiplicityArgument.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.TestMultiplicityArgument",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/_class
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/_class/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestClassPropertyNames.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestClassPropertyNames",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestClassWithParamSuperType.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestClassWithParamSuperType",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestGeneralizationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestGeneralizationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestQualifiedProperty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestQualifiedProperty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/function
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/function/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestCallWithParameter.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestCallWithParameter",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestFunctionEval.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestFunctionEval",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestFunctionProcessor.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestFunctionProcessor",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestFunctionReturnMultiplicity.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestFunctionReturnMultiplicity",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestLambdaAsInstanceValue.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestLambdaAsInstanceValue",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestLambdasWithTypeParameters.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestLambdasWithTypeParameters",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestReturnCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestReturnCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/valueSpec
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/valueSpec/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestClassInInstanceValue.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.valueSpec.TestClassInInstanceValue",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestNilTypeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.valueSpec.TestNilTypeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestGraphIsSerialized.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.TestGraphIsSerialized",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestLazyImplClassifiers.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.TestLazyImplClassifiers",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/binary
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/binary/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestBinaryGraphSerializationTypes.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestBinaryGraphSerializationTypes",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestClassLoaderDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestClassLoaderDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    srcs = ["TestDirectoryClassLoaderDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDirectoryClassLoaderDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    srcs = ["TestDirectoryDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDirectoryDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    srcs = ["TestDistributedMetadataHelper.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDistributedMetadataHelper",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDistributedMetadataSpecification.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDistributedMetadataSpecification",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    srcs = ["TestDistributedStringCaching.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDistributedStringCaching",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestStringCaching_lib",
    ],
)
java_test(
    srcs = ["TestInMemoryDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestInMemoryDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    srcs = ["TestJarDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestJarDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    srcs = ["TestSimpleStringCaching.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestSimpleStringCaching",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestStringCaching_lib",
    ],
)
java_test(
    srcs = ["TestStringCacheOrIndex.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestStringCacheOrIndex",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/model
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/model/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    srcs = ["TestObj.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.model.TestObj",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF


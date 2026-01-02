#!/bin/bash

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/_boolean
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/_boolean/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCompileAnd",
    srcs = ["TestCompileAnd.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompileAnd",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompileNot",
    srcs = ["TestCompileNot.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompileNot",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompileOr",
    srcs = ["TestCompileOr.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompileOr",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompilePrecedence",
    srcs = ["TestCompilePrecedence.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base._boolean.TestCompilePrecedence",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/asserts
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/asserts/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestAssert",
    srcs = ["TestAssert.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssert",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertContains",
    srcs = ["TestAssertContains.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertContains",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertEmpty",
    srcs = ["TestAssertEmpty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertEmpty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertEqWithinTolerance",
    srcs = ["TestAssertEqWithinTolerance.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertEqWithinTolerance",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertEquals",
    srcs = ["TestAssertEquals.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertEquals",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertFalse",
    srcs = ["TestAssertFalse.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertFalse",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertInstanceOf",
    srcs = ["TestAssertInstanceOf.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertInstanceOf",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertNotContains",
    srcs = ["TestAssertNotContains.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotContains",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertNotEmpty",
    srcs = ["TestAssertNotEmpty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotEmpty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertNotEquals",
    srcs = ["TestAssertNotEquals.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotEquals",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertNotSize",
    srcs = ["TestAssertNotSize.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertNotSize",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertSameElements",
    srcs = ["TestAssertSameElements.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertSameElements",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestAssertSize",
    srcs = ["TestAssertSize.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestAssertSize",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestFail",
    srcs = ["TestFail.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.asserts.TestFail",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/collection
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/collection/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestAtCompiled",
    srcs = ["TestAtCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestAtCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledFirst",
    srcs = ["TestCompiledFirst.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledFirst",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledGetAll",
    srcs = ["TestCompiledGetAll.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledGetAll",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledInit",
    srcs = ["TestCompiledInit.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledInit",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledIsEmpty",
    srcs = ["TestCompiledIsEmpty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledIsEmpty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledLast",
    srcs = ["TestCompiledLast.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledLast",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledReverse",
    srcs = ["TestCompiledReverse.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledReverse",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledTail",
    srcs = ["TestCompiledTail.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestCompiledTail",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMapCollection",
    srcs = ["TestMapCollection.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestMapCollection",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMapCompiled",
    srcs = ["TestMapCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestMapCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMapZeroOneCompiled",
    srcs = ["TestMapZeroOneCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestMapZeroOneCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestRangeCompiled",
    srcs = ["TestRangeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestRangeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestSlice",
    srcs = ["TestSlice.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.collection.TestSlice",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/date
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/date/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestDayOfMonth",
    srcs = ["TestDayOfMonth.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestDayOfMonth",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestHour",
    srcs = ["TestHour.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestHour",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMinute",
    srcs = ["TestMinute.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestMinute",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestNewDate",
    srcs = ["TestNewDate.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestNewDate",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestSecond",
    srcs = ["TestSecond.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.date.TestSecond",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/io
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/io/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPrintCompiled",
    srcs = ["TestPrintCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.io.TestPrintCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/lang
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/lang/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCast",
    srcs = ["TestCast.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestCast",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompareCompiled",
    srcs = ["TestCompareCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestCompareCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCopyCompiled",
    srcs = ["TestCopyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestCopyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDynamicNew",
    srcs = ["TestDynamicNew.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNew",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDynamicNewConstraints",
    srcs = ["TestDynamicNewConstraints.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNewConstraints",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDynamicNewConstraintsHandler",
    srcs = ["TestDynamicNewConstraintsHandler.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNewConstraintsHandler",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDynamicNewGetterOverride",
    srcs = ["TestDynamicNewGetterOverride.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestDynamicNewGetterOverride",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestEvaluate",
    srcs = ["TestEvaluate.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestEvaluate",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestEvaluateFunctions",
    srcs = ["TestEvaluateFunctions.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestEvaluateFunctions",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestFunctionDefinitionModify",
    srcs = ["TestFunctionDefinitionModify.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestFunctionDefinitionModify",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestIfCompiled",
    srcs = ["TestIfCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestIfCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestLetCompiled",
    srcs = ["TestLetCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestLetCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMatch",
    srcs = ["TestMatch.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestMatch",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestNewCompiled",
    srcs = ["TestNewCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestNewCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestRawEvalPropertyCompiled",
    srcs = ["TestRawEvalPropertyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.lang.TestRawEvalPropertyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/math
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/math/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestArcCosine",
    srcs = ["TestArcCosine.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestArcCosine",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestArcSine",
    srcs = ["TestArcSine.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestArcSine",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledCeiling",
    srcs = ["TestCompiledCeiling.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledCeiling",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledDivide",
    srcs = ["TestCompiledDivide.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledDivide",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledFloor",
    srcs = ["TestCompiledFloor.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledFloor",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledPrecedence",
    srcs = ["TestCompiledPrecedence.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledPrecedence",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledRound",
    srcs = ["TestCompiledRound.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledRound",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestCompiledTimes",
    srcs = ["TestCompiledTimes.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestCompiledTimes",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPowCompiled",
    srcs = ["TestPowCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestPowCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestRem",
    srcs = ["TestRem.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestRem",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestSqrt",
    srcs = ["TestSqrt.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.math.TestSqrt",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/meta
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/meta/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCanReactivateDynamically",
    srcs = ["TestCanReactivateDynamically.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestCanReactivateDynamically",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestId",
    srcs = ["TestId.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestId",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestInstanceOf",
    srcs = ["TestInstanceOf.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestInstanceOf",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPathToElement",
    srcs = ["TestPathToElement.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestPathToElement",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestReactivate",
    srcs = ["TestReactivate.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.meta.TestReactivate",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/multiplicity
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/multiplicity/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestGetUpperBound",
    srcs = ["TestGetUpperBound.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestGetUpperBound",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestToMultiplicity",
    srcs = ["TestToMultiplicity.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestToMultiplicity",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestToOne",
    srcs = ["TestToOne.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestToOne",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestToOneMany",
    srcs = ["TestToOneMany.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.multiplicity.TestToOneMany",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/relation
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/relation/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestColSpecType",
    srcs = ["TestColSpecType.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.relation.TestColSpecType",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/string
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/generation/processors/support/function/base/string/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestFormat",
    srcs = ["TestFormat.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestFormat",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestIndexOfCompiled",
    srcs = ["TestIndexOfCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestIndexOfCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestLengthCompiled",
    srcs = ["TestLengthCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestLengthCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestParseBooleanCompiled",
    srcs = ["TestParseBooleanCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseBooleanCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestParseDateCompiled",
    srcs = ["TestParseDateCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseDateCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestParseFloatCompiled",
    srcs = ["TestParseFloatCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseFloatCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestParseIntegerCompiled",
    srcs = ["TestParseIntegerCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestParseIntegerCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestSubstringCompiled",
    srcs = ["TestSubstringCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestSubstringCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestToStringCompiled",
    srcs = ["TestToStringCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestToStringCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestTrimCompiled",
    srcs = ["TestTrimCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.base.string.TestTrimCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestIncrementalCompilationCompiled",
    srcs = ["TestIncrementalCompilationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestIncrementalCompilationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMultipleRepoIncrementalCompilationCompiled",
    srcs = ["TestMultipleRepoIncrementalCompilationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestMultipleRepoIncrementalCompilationCompiled",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-core/legend-pure-m3-core/src/test/java/org/finos/legend/pure/m3/tests/incremental:TestMultipleRepoIncrementalCompilation_lib",
    ],
)
java_test(
    name = "TestPureRuntimeEnumerationCompiled",
    srcs = ["TestPureRuntimeEnumerationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestPureRuntimeEnumerationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestQualifiedPropertyInheritance",
    srcs = ["TestQualifiedPropertyInheritance.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.TestQualifiedPropertyInheritance",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_class
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_class/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimeClass_AsFunctionReturnCompiled",
    srcs = ["TestPureRuntimeClass_AsFunctionReturnCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_AsFunctionReturnCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_AsPointerCompiled",
    srcs = ["TestPureRuntimeClass_AsPointerCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_AsPointerCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_ConstraintsCompiled",
    srcs = ["TestPureRuntimeClass_ConstraintsCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_ConstraintsCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_FunctionExpressionParamCompiled",
    srcs = ["TestPureRuntimeClass_FunctionExpressionParamCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_FunctionExpressionParamCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_FunctionParamTypeCompiled",
    srcs = ["TestPureRuntimeClass_FunctionParamTypeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_FunctionParamTypeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_InCastCompiled",
    srcs = ["TestPureRuntimeClass_InCastCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_InCastCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_InCopyCompiled",
    srcs = ["TestPureRuntimeClass_InCopyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_InCopyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_InGeneralizationCompiled",
    srcs = ["TestPureRuntimeClass_InGeneralizationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_InGeneralizationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeClass_Property_UsedInAutoCollectCompiled",
    srcs = ["TestPureRuntimeClass_Property_UsedInAutoCollectCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._class.TestPureRuntimeClass_Property_UsedInAutoCollectCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_package
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/_package/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimePackageCompiled",
    srcs = ["TestPureRuntimePackageCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental._package.TestPureRuntimePackageCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/association
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/association/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimeAssociationCompiled",
    srcs = ["TestPureRuntimeAssociationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.association.TestPureRuntimeAssociationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeAssociation_AsPointerCompiled",
    srcs = ["TestPureRuntimeAssociation_AsPointerCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.association.TestPureRuntimeAssociation_AsPointerCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeAssociation_UsePropertyCompiled",
    srcs = ["TestPureRuntimeAssociation_UsePropertyCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.association.TestPureRuntimeAssociation_UsePropertyCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/function
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/function/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimeFunction_AllCompiled",
    srcs = ["TestPureRuntimeFunction_AllCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.function.TestPureRuntimeFunction_AllCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeFunction_ConstraintCompiled",
    srcs = ["TestPureRuntimeFunction_ConstraintCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.function.TestPureRuntimeFunction_ConstraintCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeFunction_LambdaCompiled",
    srcs = ["TestPureRuntimeFunction_LambdaCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.function.TestPureRuntimeFunction_LambdaCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/imports
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/imports/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimeImportCompiled",
    srcs = ["TestPureRuntimeImportCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.imports.TestPureRuntimeImportCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/milestoning
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/milestoning/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimeMilestoningCompiled",
    srcs = ["TestPureRuntimeMilestoningCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.milestoning.TestPureRuntimeMilestoningCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/profile
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/incremental/profile/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPureRuntimeStereotypeCompiled",
    srcs = ["TestPureRuntimeStereotypeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.profile.TestPureRuntimeStereotypeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureRuntimeTaggedValueCompiled",
    srcs = ["TestPureRuntimeTaggedValueCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.incremental.profile.TestPureRuntimeTaggedValueCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestPCRReport",
    srcs = ["TestPCRReport.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.TestPCRReport",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/features
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/features/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestAdvancedOpenVariableCompiled",
    srcs = ["TestAdvancedOpenVariableCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestAdvancedOpenVariableCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestConstraintsCompiled",
    srcs = ["TestConstraintsCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestConstraintsCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDefaultValueCompiled",
    srcs = ["TestDefaultValueCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestDefaultValueCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDispatchQualifiedPropertiesCompiled",
    srcs = ["TestDispatchQualifiedPropertiesCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestDispatchQualifiedPropertiesCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestEnumerationCompiled",
    srcs = ["TestEnumerationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestEnumerationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestMeasureCompiled",
    srcs = ["TestMeasureCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.features.TestMeasureCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCoreFunctions",
    srcs = ["TestCoreFunctions.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.TestCoreFunctions",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestFunction_TesterHelper_Compiled",
    srcs = ["TestFunction_TesterHelper_Compiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.TestFunction_TesterHelper_Compiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "Test_Compiled_EssentialFunctions_PCT",
    srcs = ["Test_Compiled_EssentialFunctions_PCT.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.Test_Compiled_EssentialFunctions_PCT",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "Test_Compiled_GrammarFunctions_PCT",
    srcs = ["Test_Compiled_GrammarFunctions_PCT.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.Test_Compiled_GrammarFunctions_PCT",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions/moveToPCT
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/pct/functions/moveToPCT/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestEvaluateTypeManagementCompiled",
    srcs = ["TestEvaluateTypeManagementCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.moveToPCT.TestEvaluateTypeManagementCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestNewInferenceCompiled",
    srcs = ["TestNewInferenceCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.pct.functions.moveToPCT.TestNewInferenceCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCompilationError",
    srcs = ["TestCompilationError.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestCompilationError",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDspClassloading",
    srcs = ["TestDspClassloading.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestDspClassloading",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestGenerationWithPureStacktraceIncluded",
    srcs = ["TestGenerationWithPureStacktraceIncluded.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestGenerationWithPureStacktraceIncluded",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestIdBuilder",
    srcs = ["TestIdBuilder.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestIdBuilder",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestJavaPrimitiveTypeMapping",
    srcs = ["TestJavaPrimitiveTypeMapping.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestJavaPrimitiveTypeMapping",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestJavaStandaloneLibraryGenerator",
    srcs = ["TestJavaStandaloneLibraryGenerator.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestJavaStandaloneLibraryGenerator",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestPureCacheMap",
    srcs = ["TestPureCacheMap.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.TestPureCacheMap",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/compiler
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/compiler/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestMemoryFileManager",
    srcs = ["TestMemoryFileManager.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.compiler.TestMemoryFileManager",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestStringJavaSource",
    srcs = ["TestStringJavaSource.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.compiler.TestStringJavaSource",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestJavaPackageAndImportBuilder",
    srcs = ["TestJavaPackageAndImportBuilder.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.generation.TestJavaPackageAndImportBuilder",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/support
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/support/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCoreExtensionCompiled",
    srcs = ["TestCoreExtensionCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.generation.processors.support.TestCoreExtensionCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/type
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/generation/processors/type/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestTypeProcessor",
    srcs = ["TestTypeProcessor.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.generation.processors.type.TestTypeProcessor",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestMultiplicityArgument",
    srcs = ["TestMultiplicityArgument.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.TestMultiplicityArgument",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/_class
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/_class/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestClassPropertyNames",
    srcs = ["TestClassPropertyNames.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestClassPropertyNames",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestClassWithParamSuperType",
    srcs = ["TestClassWithParamSuperType.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestClassWithParamSuperType",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestGeneralizationCompiled",
    srcs = ["TestGeneralizationCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestGeneralizationCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestQualifiedProperty",
    srcs = ["TestQualifiedProperty.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling._class.TestQualifiedProperty",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/function
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/function/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestCallWithParameter",
    srcs = ["TestCallWithParameter.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestCallWithParameter",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestFunctionEval",
    srcs = ["TestFunctionEval.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestFunctionEval",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestFunctionProcessor",
    srcs = ["TestFunctionProcessor.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestFunctionProcessor",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestFunctionReturnMultiplicity",
    srcs = ["TestFunctionReturnMultiplicity.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestFunctionReturnMultiplicity",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestLambdaAsInstanceValue",
    srcs = ["TestLambdaAsInstanceValue.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestLambdaAsInstanceValue",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestLambdasWithTypeParameters",
    srcs = ["TestLambdasWithTypeParameters.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestLambdasWithTypeParameters",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestReturnCompiled",
    srcs = ["TestReturnCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.function.TestReturnCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/valueSpec
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/modeling/valueSpec/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestClassInInstanceValue",
    srcs = ["TestClassInInstanceValue.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.valueSpec.TestClassInInstanceValue",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestNilTypeCompiled",
    srcs = ["TestNilTypeCompiled.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.modeling.valueSpec.TestNilTypeCompiled",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestGraphIsSerialized",
    srcs = ["TestGraphIsSerialized.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.TestGraphIsSerialized",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestLazyImplClassifiers",
    srcs = ["TestLazyImplClassifiers.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.TestLazyImplClassifiers",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/binary
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/binary/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestBinaryGraphSerializationTypes",
    srcs = ["TestBinaryGraphSerializationTypes.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestBinaryGraphSerializationTypes",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestClassLoaderDistributedBinaryGraphSerialization",
    srcs = ["TestClassLoaderDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestClassLoaderDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    name = "TestDirectoryClassLoaderDistributedBinaryGraphSerialization",
    srcs = ["TestDirectoryClassLoaderDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDirectoryClassLoaderDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    name = "TestDirectoryDistributedBinaryGraphSerialization",
    srcs = ["TestDirectoryDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDirectoryDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    name = "TestDistributedMetadataHelper",
    srcs = ["TestDistributedMetadataHelper.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDistributedMetadataHelper",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDistributedMetadataSpecification",
    srcs = ["TestDistributedMetadataSpecification.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDistributedMetadataSpecification",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
java_test(
    name = "TestDistributedStringCaching",
    srcs = ["TestDistributedStringCaching.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestDistributedStringCaching",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestStringCaching_lib",
    ],
)
java_test(
    name = "TestInMemoryDistributedBinaryGraphSerialization",
    srcs = ["TestInMemoryDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestInMemoryDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    name = "TestJarDistributedBinaryGraphSerialization",
    srcs = ["TestJarDistributedBinaryGraphSerialization.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestJarDistributedBinaryGraphSerialization",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestDistributedBinaryGraphSerialization_lib",
    ],
)
java_test(
    name = "TestSimpleStringCaching",
    srcs = ["TestSimpleStringCaching.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestSimpleStringCaching",
    deps = [
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils",
        "//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:TestStringCaching_lib",
    ],
)
java_test(
    name = "TestStringCacheOrIndex",
    srcs = ["TestStringCacheOrIndex.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.binary.TestStringCacheOrIndex",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF

mkdir -p legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/model
cat > legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled/src/test/java/org/finos/legend/pure/runtime/java/compiled/runtime/serialization/model/BUILD.bazel << 'EOF'
load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_test(
    name = "TestObj",
    srcs = ["TestObj.java"],
    test_class = "org.finos.legend.pure.runtime.java.compiled.runtime.serialization.model.TestObj",
    deps = ["//legend-pure/legend-pure-runtime/legend-pure-runtime-java-engine-compiled:compiled-engine-test-utils"],
)
EOF


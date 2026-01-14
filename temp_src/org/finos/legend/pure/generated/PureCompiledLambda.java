package org.finos.legend.pure.generated;
import org.eclipse.collections.api.LazyIterable;
import org.eclipse.collections.api.block.function.Function0;
import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.block.function.Function2;
import org.eclipse.collections.api.block.predicate.Predicate;
import org.eclipse.collections.api.block.procedure.Procedure;
import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.api.map.MutableMapIterable;
import org.eclipse.collections.api.map.MapIterable;
import org.eclipse.collections.api.map.primitive.IntObjectMap;
import org.eclipse.collections.api.set.MutableSet;
import org.eclipse.collections.api.set.SetIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import org.eclipse.collections.impl.map.strategy.mutable.UnifiedMapWithHashingStrategy;
import org.eclipse.collections.impl.set.mutable.UnifiedSet;
import org.eclipse.collections.impl.set.strategy.mutable.UnifiedSetWithHashingStrategy;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.eclipse.collections.impl.factory.Sets;
import org.eclipse.collections.impl.block.function.checked.CheckedFunction0;
import org.eclipse.collections.impl.utility.Iterate;
import org.eclipse.collections.impl.utility.LazyIterate;
import org.eclipse.collections.impl.utility.StringIterate;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.primitive.date.PureDate;
import org.finos.legend.pure.m4.coreinstance.primitive.date.DateFunctions;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.relationship.Generalization;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Type;
import org.finos.legend.pure.m3.exception.PureExecutionException;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m3.navigation.ProcessorSupport;
import org.finos.legend.pure.m3.navigation.PackageableElement.PackageableElement;
import org.finos.legend.pure.m3.navigation.generictype.GenericType;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.vcs.ChangeType;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.vcs.ChangedPath;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.vcs.Revision;
import org.finos.legend.pure.m3.tools.ListHelper;
import org.finos.legend.pure.runtime.java.compiled.execution.*;
import org.finos.legend.pure.runtime.java.compiled.execution.sourceInformation.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.defended.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.map.*;
import org.finos.legend.pure.runtime.java.compiled.metadata.*;
import org.finos.legend.pure.runtime.java.compiled.serialization.model.*;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.Iterator;
import java.util.Calendar;
import java.util.Map;
import java.util.ArrayDeque;
import java.util.Deque;
import org.json.simple.JSONObject;

import org.finos.legend.pure.generated.*;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.AbstractPureCompiledLambda;
import org.eclipse.collections.api.RichIterable;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.SharedPureFunction;

public class PureCompiledLambda extends AbstractPureCompiledLambda<Object>
{
    public PureCompiledLambda(LambdaFunction lambdaFunction, SharedPureFunction pureFunction)
    {
        super(lambdaFunction, pureFunction);
    }

    public PureCompiledLambda(ExecutionSupport executionSupport, String lambdaId, SharedPureFunction pureFunction)
    {
        super(executionSupport, lambdaId, pureFunction);
    }

    @Override
    public PureCompiledLambda copy()
    {
        LambdaFunction<Object> lambda = lambdaFunction();
        return new PureCompiledLambda((lambda == null) ? null : lambda.copy(), pureFunction());
    }

    public void _reverse_applications(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression val)
    {
        throw new RuntimeException("Not Supported in Lazy Mode!");    }

    public void _sever_reverse_applications(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression val)
    {
        throw new RuntimeException("Not Supported in Lazy Mode!");    }

    public LambdaFunction _applications(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression> val)
    {
        lambdaFunction()._applications(val);
        return lambdaFunction();
    }

    public LambdaFunction _applicationsAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression val)
    {
        lambdaFunction()._applicationsAdd(val);
        return lambdaFunction();
    }

    public LambdaFunction _applicationsAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression> val)
    {
        lambdaFunction()._applicationsAddAll(val);
        return lambdaFunction();
    }
    public LambdaFunction _applicationsRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression val)
    {
        lambdaFunction()._applicationsRemove(val);
        return lambdaFunction();
    }
    public LambdaFunction _applicationsRemove()
    {
        lambdaFunction()._applicationsRemove();
        return lambdaFunction();
    }
    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.FunctionExpression> _applications()
    {
        return lambdaFunction()._applications();
    }
    public LambdaFunction _applicationsCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _applicationsRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _applicationsAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _applicationsAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }



    public void _reverse_classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        throw new RuntimeException("Not Supported !");
    }

    public void _sever_reverse_classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        throw new RuntimeException("Not Supported!");
    }

    public LambdaFunction _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        lambdaFunction()._classifierGenericType(val);
        return lambdaFunction();
    }

    public LambdaFunction _classifierGenericTypeRemove()
    {
        lambdaFunction()._classifierGenericTypeRemove();
        return lambdaFunction();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType _classifierGenericType()
    {
        return lambdaFunction()._classifierGenericType();
    }


    public void _reverse_elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        throw new RuntimeException("Not Supported !");
    }

    public void _sever_reverse_elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        throw new RuntimeException("Not Supported!");
    }

    public LambdaFunction _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        lambdaFunction()._elementOverride(val);
        return lambdaFunction();
    }

    public LambdaFunction _elementOverrideRemove()
    {
        lambdaFunction()._elementOverrideRemove();
        return lambdaFunction();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride _elementOverride()
    {
        return lambdaFunction()._elementOverride();
    }


    public void _reverse_expressionSequence(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification val)
    {
        throw new RuntimeException("Not Supported in Lazy Mode!");    }

    public void _sever_reverse_expressionSequence(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification val)
    {
        throw new RuntimeException("Not Supported in Lazy Mode!");    }

    public LambdaFunction _expressionSequence(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification> val)
    {
        lambdaFunction()._expressionSequence(val);
        return lambdaFunction();
    }

    public LambdaFunction _expressionSequenceAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification val)
    {
        lambdaFunction()._expressionSequenceAdd(val);
        return lambdaFunction();
    }

    public LambdaFunction _expressionSequenceAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification> val)
    {
        lambdaFunction()._expressionSequenceAddAll(val);
        return lambdaFunction();
    }
    public LambdaFunction _expressionSequenceRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification val)
    {
        lambdaFunction()._expressionSequenceRemove(val);
        return lambdaFunction();
    }
    public LambdaFunction _expressionSequenceRemove()
    {
        lambdaFunction()._expressionSequenceRemove();
        return lambdaFunction();
    }
    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.ValueSpecification> _expressionSequence()
    {
        return lambdaFunction()._expressionSequence();
    }
    public LambdaFunction _expressionSequenceCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _expressionSequenceRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _expressionSequenceAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _expressionSequenceAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }



    public LambdaFunction _functionName(java.lang.String val)
    {
        lambdaFunction()._functionName(val);
        return lambdaFunction();
    }

    public LambdaFunction _functionNameRemove()
    {
        lambdaFunction()._functionNameRemove();
        return lambdaFunction();
    }

    public java.lang.String _functionName()
    {
        return lambdaFunction()._functionName();
    }


    public LambdaFunction _name(java.lang.String val)
    {
        lambdaFunction()._name(val);
        return lambdaFunction();
    }

    public LambdaFunction _nameRemove()
    {
        lambdaFunction()._nameRemove();
        return lambdaFunction();
    }

    public java.lang.String _name()
    {
        return lambdaFunction()._name();
    }


    public LambdaFunction _openVariables(RichIterable<? extends java.lang.String> val)
    {
        lambdaFunction()._openVariables(val);
        return lambdaFunction();
    }

    public LambdaFunction _openVariablesAdd(java.lang.String val)
    {
        lambdaFunction()._openVariablesAdd(val);
        return lambdaFunction();
    }

    public LambdaFunction _openVariablesAddAll(RichIterable<? extends java.lang.String> val)
    {
        lambdaFunction()._openVariablesAddAll(val);
        return lambdaFunction();
    }
    public LambdaFunction _openVariablesRemove(java.lang.String val)
    {
        lambdaFunction()._openVariablesRemove(val);
        return lambdaFunction();
    }
    public LambdaFunction _openVariablesRemove()
    {
        lambdaFunction()._openVariablesRemove();
        return lambdaFunction();
    }
    public RichIterable<? extends java.lang.String> _openVariables()
    {
        return lambdaFunction()._openVariables();
    }
    public LambdaFunction _openVariablesCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _openVariablesRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _openVariablesAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _openVariablesAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }



    public void _reverse_referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        throw new RuntimeException("Not Supported in Lazy Mode!");    }

    public void _sever_reverse_referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        throw new RuntimeException("Not Supported in Lazy Mode!");    }

    public LambdaFunction _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        lambdaFunction()._referenceUsages(val);
        return lambdaFunction();
    }

    public LambdaFunction _referenceUsagesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        lambdaFunction()._referenceUsagesAdd(val);
        return lambdaFunction();
    }

    public LambdaFunction _referenceUsagesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        lambdaFunction()._referenceUsagesAddAll(val);
        return lambdaFunction();
    }
    public LambdaFunction _referenceUsagesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        lambdaFunction()._referenceUsagesRemove(val);
        return lambdaFunction();
    }
    public LambdaFunction _referenceUsagesRemove()
    {
        lambdaFunction()._referenceUsagesRemove();
        return lambdaFunction();
    }
    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> _referenceUsages()
    {
        return lambdaFunction()._referenceUsages();
    }
    public LambdaFunction _referenceUsagesCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _referenceUsagesRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _referenceUsagesAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public LambdaFunction _referenceUsagesAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public static SharedPureFunction getPureFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<?> function, ExecutionSupport es)
    {
        return (function == null) ? null : CoreGen.getSharedPureFunction(function, es);
    }
}

package org.finos.legend.pure.generated;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.*;
import org.eclipse.collections.api.block.function.Function2;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.map.PureMap;
import org.eclipse.collections.api.block.function.Function0;
import org.eclipse.collections.api.block.function.Function;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.eclipse.collections.impl.factory.Maps;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.defended.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.*;
import org.finos.legend.pure.runtime.java.compiled.execution.*;
import org.finos.legend.pure.runtime.java.compiled.execution.sourceInformation.*;
public class platform_dsl_store_grammar_runtime
{
    public static MutableMap<String, SharedPureFunction<?>> __functions = Maps.mutable.empty();
    static
    {
        __functions.put("meta_core_runtime_Runtime_connectionByElement_0$3", meta_core_runtime_Runtime_connectionByElement_0$3());
    }

    private static SharedPureFunction<?> meta_core_runtime_Runtime_connectionByElement_0$3()
    {
        return new DefaultPureLambdaFunction1<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection>()
{
     public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection execute(ListIterable<?> vars, ExecutionSupport es)
     {
         return value((org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore)CompiledSupport.makeOne(vars.get(0)), es);
     }

     public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection value(final org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore _v_automap, final ExecutionSupport es)
     {
return _v_automap._connection();
     }
}
;
    }
}
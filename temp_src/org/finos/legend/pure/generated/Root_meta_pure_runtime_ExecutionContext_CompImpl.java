package org.finos.legend.pure.generated;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.factory.Maps;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.map.MutableMap;
import org.finos.legend.pure.m3.coreinstance.KeyIndex;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m4.ModelRepository;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.m4.coreinstance.factory.CoreInstanceFactory;
import org.finos.legend.pure.runtime.java.compiled.execution.*;
import org.finos.legend.pure.runtime.java.compiled.execution.sourceInformation.E_;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.GetterOverrideExecutor;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.QuantityCoreInstance;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.ReflectiveCoreInstance;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.ValCoreInstance;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.defended.*;
import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.block.function.Function0;
import org.eclipse.collections.api.block.function.Function2;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.map.PureMap;
import org.finos.legend.pure.m3.coreinstance.BaseM3CoreInstanceFactory;
public class Root_meta_pure_runtime_ExecutionContext_CompImpl extends org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContextInstance implements org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.JavaCompiledCoreInstance
{
    public static final CoreInstanceFactory FACTORY = new BaseM3CoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_pure_runtime_ExecutionContext_CompImpl(name, sourceInformation, classifier, internalSyntheticId, repository, persistent);
        }

        @Override
        public boolean supports(String classifierPath)
        {
            return "Root::meta::pure::runtime::ExecutionContext".equals(classifierPath);
        }
    };
    protected Root_meta_pure_runtime_ExecutionContext_CompImpl(String name, SourceInformation sourceInformation, CoreInstance classifier, int internalSyntheticId, ModelRepository repository, boolean persistent)
    {
        super(name, sourceInformation, classifier, internalSyntheticId, repository, persistent);
    }

    protected Root_meta_pure_runtime_ExecutionContext_CompImpl(Root_meta_pure_runtime_ExecutionContext_CompImpl instance)
    {
        super(instance);
    }
    @Override
    public org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext copy()
    {
        return new Root_meta_pure_runtime_ExecutionContext_CompImpl(this);
    }

    public boolean pureEquals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext that = (org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext)o;
        if (!CompiledSupport.equal(this._enableConstraints(), that._enableConstraints()))
        {
            return false;
        }
        if (!CompiledSupport.equal(this._queryTimeOutInSeconds(), that._queryTimeOutInSeconds()))
        {
            return false;
        }
        return true;
    }

    public int pureHashCode()
    {
        int result = CompiledSupport.safeHashCode(this._enableConstraints());
        result = 31 * result + CompiledSupport.safeHashCode(this._queryTimeOutInSeconds());
        return result;
    }
}
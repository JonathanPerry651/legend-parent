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
public class Root_meta_core_runtime_Runtime_CompImpl extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.RuntimeInstance
{
    public static final CoreInstanceFactory FACTORY = new BaseM3CoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_core_runtime_Runtime_CompImpl(name, sourceInformation, classifier, internalSyntheticId, repository, persistent);
        }

        @Override
        public boolean supports(String classifierPath)
        {
            return "Root::meta::core::runtime::Runtime".equals(classifierPath);
        }
    };
    protected Root_meta_core_runtime_Runtime_CompImpl(String name, SourceInformation sourceInformation, CoreInstance classifier, int internalSyntheticId, ModelRepository repository, boolean persistent)
    {
        super(name, sourceInformation, classifier, internalSyntheticId, repository, persistent);
    }

    protected Root_meta_core_runtime_Runtime_CompImpl(Root_meta_core_runtime_Runtime_CompImpl instance)
    {
        super(instance);
    }
    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection connectionByElement(final org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement _a,final ExecutionSupport es)
    {
        return CompiledSupport.toOne(CompiledSupport.mapToOneOverMany(CompiledSupport.toPureCollection(CompiledSupport.toPureCollection(Root_meta_core_runtime_Runtime_CompImpl.this._connectionStores()).select(new DefendedPredicate<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore>(){public boolean accept(final org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore _c){return CompiledSupport.equal(_c._element(), _a);}})), (org.eclipse.collections.api.block.function.Function2<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore, ExecutionSupport, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection>)(platform_dsl_store_grammar_runtime.__functions.get("meta_core_runtime_Runtime_connectionByElement_0$3")), es)
, new org.finos.legend.pure.m4.coreinstance.SourceInformation("/platform_dsl_store/grammar/runtime.pure", -1, -1, 21, 135, -1, -1));
    }

    @Override
    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime copy()
    {
        return new Root_meta_core_runtime_Runtime_CompImpl(this);
    }

}
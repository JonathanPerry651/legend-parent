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
public class Root_meta_core_runtime_Runtime_Impl extends Root_meta_pure_metamodel_type_Any_Impl implements org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime
{
    public static final String tempTypeName = "Runtime";
    private static final String tempFullTypeId = "Root::meta::core::runtime::Runtime";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "connectionStores", "preprocessFunction")
           .build();
    private CoreInstance classifier;

    public Root_meta_core_runtime_Runtime_Impl(String id)
    {
        super(id);
    }

    public Root_meta_core_runtime_Runtime_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
    {
        this(name == null ? "Anonymous_NoCounter": name);
        this.setSourceInformation(sourceInformation);
        this.classifier = classifier;
    }

    public static final CoreInstanceFactory FACTORY = new org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.BaseJavaModelCoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_core_runtime_Runtime_Impl(name, sourceInformation, classifier);
        }

        @Override
        public boolean supports(String classifierPath)
        {
            return tempFullTypeId.equals(classifierPath);
        }
    };

    @Override
    public CoreInstance getClassifier()
    {
        return this.classifier;
    }

    @Override
    public RichIterable<String> getKeys()
    {
        return KEY_INDEX.getKeys();
    }

    @Override
    public ListIterable<String> getRealKeyByName(String name)
    {
        return KEY_INDEX.getRealKeyByName(name);
    }

    @Override
    public CoreInstance getValueForMetaPropertyToOne(String keyName)
    {
        switch (keyName)
        {
            case "classifierGenericType":
            {
                return ValCoreInstance.toCoreInstance(_classifierGenericType());
            }
            case "elementOverride":
            {
                return ValCoreInstance.toCoreInstance(_elementOverride());
            }
            case "preprocessFunction":
            {
                return ValCoreInstance.toCoreInstance(_preprocessFunction());
            }
            default:
            {
                return super.getValueForMetaPropertyToOne(keyName);
            }
        }
    }

    @Override
    public ListIterable<CoreInstance> getValueForMetaPropertyToMany(String keyName)
    {
        return "connectionStores".equals(keyName) ? ValCoreInstance.toCoreInstances(_connectionStores()) : super.getValueForMetaPropertyToMany(keyName);
    }

    public Root_meta_core_runtime_Runtime_Impl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_core_runtime_Runtime_Impl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_core_runtime_Runtime_Impl _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public RichIterable _connectionStores = Lists.mutable.empty();
    private Root_meta_core_runtime_Runtime_Impl _connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val, boolean add)
    {
        if (val == null)
        {
            if (!add)
            {
                this._connectionStores = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._connectionStores instanceof MutableList))
            {
                this._connectionStores = this._connectionStores.toList();
            }
            ((MutableList)this._connectionStores).add(val);
        }
        else
        {
            this._connectionStores = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_core_runtime_Runtime_Impl _connectionStores(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> val, boolean add)
    {
        if (add)
        {
            if (!(this._connectionStores instanceof MutableList))
            {
                this._connectionStores = this._connectionStores.toList();
            }
            ((MutableList)this._connectionStores).addAllIterable(val);
        }
        else
        {
            this._connectionStores = val;
        }
        return this;
    }

    public Root_meta_core_runtime_Runtime_Impl _connectionStores(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> val)
    {
        return this._connectionStores(val, false);
    }

    public Root_meta_core_runtime_Runtime_Impl _connectionStoresAdd(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        return this._connectionStores(Lists.immutable.with(val), true);
    }

    public Root_meta_core_runtime_Runtime_Impl _connectionStoresAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> val)
    {
        return this._connectionStores(val, true);
    }

    public Root_meta_core_runtime_Runtime_Impl _connectionStoresRemove()
    {
        this._connectionStores = Lists.mutable.empty();
        return this;
    }

    public Root_meta_core_runtime_Runtime_Impl _connectionStoresRemove(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        if (!(this._connectionStores instanceof MutableList))
        {
            this._connectionStores = this._connectionStores.toList();
        }
        ((MutableList)this._connectionStores).remove(val);
        return this;
    }


    public void _reverse_connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        if (!(this._connectionStores instanceof MutableList))
        {
            this._connectionStores = this._connectionStores.toList();
        }
        ((MutableList)this._connectionStores).add(val);
    }

    public void _sever_reverse_connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        if (!(this._connectionStores instanceof MutableList))
        {
            this._connectionStores = this._connectionStores.toList();
        }
        ((MutableList)this._connectionStores).remove(val);
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> _connectionStores()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._connectionStores : (RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore>)((GetterOverrideExecutor)this._elementOverride()).executeToMany(this, "Root::meta::core::runtime::Runtime", "connectionStores");
    }

    public Root_meta_core_runtime_Runtime_Impl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_core_runtime_Runtime_Impl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_core_runtime_Runtime_Impl _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> _preprocessFunction;
    public Root_meta_core_runtime_Runtime_Impl _preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> val)
    {
        this._preprocessFunction = val;
        return this;
    }

    public Root_meta_core_runtime_Runtime_Impl _preprocessFunction(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object>> val)
    {
        return _preprocessFunction(val.getFirst());
    }

    public Root_meta_core_runtime_Runtime_Impl _preprocessFunctionRemove()
    {
        this._preprocessFunction = null;
        return this;
    }

    public Root_meta_core_runtime_Runtime_Impl _preprocessFunctionCoreInstance(org.finos.legend.pure.m4.coreinstance.CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public void _reverse_preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> val)
    {
        this._preprocessFunction = val;
    }

    public void _sever_reverse_preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> val)
    {
        this._preprocessFunction = null;
    }

    public org.finos.legend.pure.m4.coreinstance.CoreInstance _preprocessFunctionCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> _preprocessFunction()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._preprocessFunction : (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object>)((GetterOverrideExecutor)this._elementOverride()).executeToOne(this, "Root::meta::core::runtime::Runtime", "preprocessFunction");
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection connectionByElement(final org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement _a,final ExecutionSupport es)
    {
        return CompiledSupport.toOne(CompiledSupport.mapToOneOverMany(CompiledSupport.toPureCollection(CompiledSupport.toPureCollection(Root_meta_core_runtime_Runtime_Impl.this._connectionStores()).select(new DefendedPredicate<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore>(){public boolean accept(final org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore _c){return CompiledSupport.equal(_c._element(), _a);}})), (org.eclipse.collections.api.block.function.Function2<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore, ExecutionSupport, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection>)(platform_dsl_store_grammar_runtime.__functions.get("meta_core_runtime_Runtime_connectionByElement_0$3")), es)
, new org.finos.legend.pure.m4.coreinstance.SourceInformation("/platform_dsl_store/grammar/runtime.pure", -1, -1, 21, 135, -1, -1));
    }

    public Root_meta_core_runtime_Runtime_Impl copy()
    {
        return new Root_meta_core_runtime_Runtime_Impl(this);
    }
    public Root_meta_core_runtime_Runtime_Impl(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_core_runtime_Runtime_Impl)src).classifier;
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_core_runtime_Runtime_Impl)src)._elementOverride;
        this._connectionStores = Lists.mutable.ofAll(((Root_meta_core_runtime_Runtime_Impl)src)._connectionStores);
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_core_runtime_Runtime_Impl)src)._classifierGenericType;
        this._preprocessFunction = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object>)((Root_meta_core_runtime_Runtime_Impl)src)._preprocessFunction;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
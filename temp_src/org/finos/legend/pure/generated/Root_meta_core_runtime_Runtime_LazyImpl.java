package org.finos.legend.pure.generated;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.factory.Maps;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.finos.legend.pure.m3.coreinstance.KeyIndex;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m4.ModelRepository;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.m4.coreinstance.factory.CoreInstanceFactory;
import org.finos.legend.pure.runtime.java.compiled.metadata.MetadataLazy;
import org.finos.legend.pure.runtime.java.compiled.execution.*;
import org.finos.legend.pure.runtime.java.compiled.execution.sourceInformation.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.coreinstance.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.*;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function.defended.*;
import org.finos.legend.pure.runtime.java.compiled.serialization.model.*;
import org.eclipse.collections.api.block.function.Function0;
import org.eclipse.collections.api.block.function.Function2;
import org.finos.legend.pure.runtime.java.compiled.generation.processors.support.map.PureMap;
public class Root_meta_core_runtime_Runtime_LazyImpl extends AbstractLazyReflectiveCoreInstance implements org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime
{
    public static final String tempTypeName = "Runtime";
    private static final String tempFullTypeId = "Root::meta::core::runtime::Runtime";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "connectionStores", "preprocessFunction")
           .build();

    public Root_meta_core_runtime_Runtime_LazyImpl(Obj instance, MetadataLazy metadataLazy)
    {
        super(instance, metadataLazy);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy)
    {
        super(id, sourceInformation, metadataLazy, vals);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy, CoreInstance classifier)
    {
        super(id, sourceInformation, metadataLazy, vals, classifier);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl(String name, SourceInformation sourceInformation, CoreInstance classifier)
    {
        super(name, sourceInformation, classifier);
    }

    public static final CoreInstanceFactory FACTORY = new BaseJavaModelCoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_core_runtime_Runtime_LazyImpl(name, sourceInformation, classifier);
        }

        @Override
        public boolean supports(String classifierPath)
        {
            return tempFullTypeId.equals(classifierPath);
        }
    };


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

    public final AtomicBoolean _classifierGenericType_initialized = new AtomicBoolean(false);
    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType _classifierGenericType;

    public void _reverse_classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = val;
    }

    public void _sever_reverse_classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = null;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _classifierGenericTypeRemove()
    {
        this._classifierGenericType();
        this._classifierGenericType = null;
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType _classifierGenericType()
    {
        if (!this._classifierGenericType_initialized.get())
        {
            synchronized (this._classifierGenericType_initialized)
            {
                if (!this._classifierGenericType_initialized.get())
                {
                    this._classifierGenericType = loadValueFromMetadata("classifierGenericType");
                    this._classifierGenericType_initialized.set(true);
                }
            }
        }
        return this._classifierGenericType;
    }

    public final AtomicBoolean _connectionStores_initialized = new AtomicBoolean(false);
    public RichIterable _connectionStores = Lists.mutable.empty();

    public void _reverse_connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        this._connectionStores();
        if (!(this._connectionStores instanceof MutableList))
        {
            this._connectionStores = this._connectionStores.toList();
        }
        ((MutableList)this._connectionStores).add(val);
    }

    public void _sever_reverse_connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        this._connectionStores();
        if (!(this._connectionStores instanceof MutableList))
        {
            this._connectionStores = this._connectionStores.toList();
        }
        ((MutableList)this._connectionStores).remove(val);
    }

    private Root_meta_core_runtime_Runtime_LazyImpl _connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val, boolean add)
    {
        this._connectionStores();
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

    private Root_meta_core_runtime_Runtime_LazyImpl _connectionStores(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> val, boolean add)
    {
        this._connectionStores();
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

    public Root_meta_core_runtime_Runtime_LazyImpl _connectionStores(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> val)
    {
        return this._connectionStores(val, false);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _connectionStoresAdd(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        return this._connectionStores(Lists.immutable.with(val), true);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _connectionStoresAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> val)
    {
        return this._connectionStores(val, true);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _connectionStoresRemove()
    {
        this._connectionStores();
        this._connectionStores = Lists.mutable.empty();
        return this;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _connectionStoresRemove(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore val)
    {
        this._connectionStores();
        if (!(this._connectionStores instanceof MutableList))
        {
            this._connectionStores = this._connectionStores.toList();
        }
        ((MutableList)this._connectionStores).remove(val);
        return this;
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> _connectionStores()
    {
        if (!this._connectionStores_initialized.get())
        {
            synchronized (this._connectionStores_initialized)
            {
                if (!this._connectionStores_initialized.get())
                {
                    this._connectionStores = loadValuesFromMetadata("connectionStores");
                    this._connectionStores_initialized.set(true);
                }
            }
        }
        return this._connectionStores;
    }

    public final AtomicBoolean _elementOverride_initialized = new AtomicBoolean(false);
    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride _elementOverride;

    public void _reverse_elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = val;
    }

    public void _sever_reverse_elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = null;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = val;
        return this;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _elementOverrideRemove()
    {
        this._elementOverride();
        this._elementOverride = null;
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride _elementOverride()
    {
        if (!this._elementOverride_initialized.get())
        {
            synchronized (this._elementOverride_initialized)
            {
                if (!this._elementOverride_initialized.get())
                {
                    this._elementOverride = loadValueFromMetadata("elementOverride");
                    this._elementOverride_initialized.set(true);
                }
            }
        }
        return this._elementOverride;
    }

    public final AtomicBoolean _preprocessFunction_initialized = new AtomicBoolean(false);
    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> _preprocessFunction;

    public void _reverse_preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> val)
    {
        this._preprocessFunction();
        this._preprocessFunction = val;
    }

    public void _sever_reverse_preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> val)
    {
        this._preprocessFunction();
        this._preprocessFunction = null;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> val)
    {
        this._preprocessFunction();
        this._preprocessFunction = val;
        return this;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _preprocessFunction(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object>> val)
    {
        return _preprocessFunction(val.getFirst());
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _preprocessFunctionRemove()
    {
        this._preprocessFunction();
        this._preprocessFunction = null;
        return this;
    }

    public Root_meta_core_runtime_Runtime_LazyImpl _preprocessFunctionCoreInstance(org.finos.legend.pure.m4.coreinstance.CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public org.finos.legend.pure.m4.coreinstance.CoreInstance _preprocessFunctionCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> _preprocessFunction()
    {
        if (!this._preprocessFunction_initialized.get())
        {
            synchronized (this._preprocessFunction_initialized)
            {
                if (!this._preprocessFunction_initialized.get())
                {
                    this._preprocessFunction = loadValueFromMetadata("preprocessFunction");
                    this._preprocessFunction_initialized.set(true);
                }
            }
        }
        return this._preprocessFunction;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection connectionByElement(final org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement _a,final ExecutionSupport es)
    {
        return CompiledSupport.toOne(CompiledSupport.mapToOneOverMany(CompiledSupport.toPureCollection(CompiledSupport.toPureCollection(Root_meta_core_runtime_Runtime_LazyImpl.this._connectionStores()).select(new DefendedPredicate<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore>(){public boolean accept(final org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore _c){return CompiledSupport.equal(_c._element(), _a);}})), (org.eclipse.collections.api.block.function.Function2<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore, ExecutionSupport, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection>)(platform_dsl_store_grammar_runtime.__functions.get("meta_core_runtime_Runtime_connectionByElement_0$3")), es)
, new org.finos.legend.pure.m4.coreinstance.SourceInformation("/platform_dsl_store/grammar/runtime.pure", -1, -1, 21, 135, -1, -1));
    }

    public Root_meta_core_runtime_Runtime_LazyImpl copy()
    {
        return new Root_meta_core_runtime_Runtime_LazyImpl(this);
    }

    public Root_meta_core_runtime_Runtime_LazyImpl(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime src)
    {
        super((Root_meta_core_runtime_Runtime_LazyImpl)src);
        synchronized (((Root_meta_core_runtime_Runtime_LazyImpl)src)._elementOverride_initialized)
        {
            this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_core_runtime_Runtime_LazyImpl)src)._elementOverride;
            this._elementOverride_initialized.set(((Root_meta_core_runtime_Runtime_LazyImpl)src)._elementOverride_initialized.get());
        }
        synchronized (((Root_meta_core_runtime_Runtime_LazyImpl)src)._connectionStores_initialized)
        {
            this._connectionStores = FastList.newList(((Root_meta_core_runtime_Runtime_LazyImpl)src)._connectionStores);
            this._connectionStores_initialized.set(((Root_meta_core_runtime_Runtime_LazyImpl)src)._connectionStores_initialized.get());
        }
        synchronized (((Root_meta_core_runtime_Runtime_LazyImpl)src)._classifierGenericType_initialized)
        {
            this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_core_runtime_Runtime_LazyImpl)src)._classifierGenericType;
            this._classifierGenericType_initialized.set(((Root_meta_core_runtime_Runtime_LazyImpl)src)._classifierGenericType_initialized.get());
        }
        synchronized (((Root_meta_core_runtime_Runtime_LazyImpl)src)._preprocessFunction_initialized)
        {
            this._preprocessFunction = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object>)((Root_meta_core_runtime_Runtime_LazyImpl)src)._preprocessFunction;
            this._preprocessFunction_initialized.set(((Root_meta_core_runtime_Runtime_LazyImpl)src)._preprocessFunction_initialized.get());
        }
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
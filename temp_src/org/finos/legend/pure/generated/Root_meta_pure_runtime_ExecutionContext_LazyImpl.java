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
public class Root_meta_pure_runtime_ExecutionContext_LazyImpl extends AbstractLazyReflectiveCoreInstance implements org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext
{
    public static final String tempTypeName = "ExecutionContext";
    private static final String tempFullTypeId = "Root::meta::pure::runtime::ExecutionContext";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "enableConstraints", "queryTimeOutInSeconds")
           .build();

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl(Obj instance, MetadataLazy metadataLazy)
    {
        super(instance, metadataLazy);
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy)
    {
        super(id, sourceInformation, metadataLazy, vals);
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy, CoreInstance classifier)
    {
        super(id, sourceInformation, metadataLazy, vals, classifier);
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl(String name, SourceInformation sourceInformation, CoreInstance classifier)
    {
        super(name, sourceInformation, classifier);
    }

    public static final CoreInstanceFactory FACTORY = new BaseJavaModelCoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_pure_runtime_ExecutionContext_LazyImpl(name, sourceInformation, classifier);
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
            case "enableConstraints":
            {
                return ValCoreInstance.toCoreInstance(_enableConstraints());
            }
            case "queryTimeOutInSeconds":
            {
                return ValCoreInstance.toCoreInstance(_queryTimeOutInSeconds());
            }
            default:
            {
                return super.getValueForMetaPropertyToOne(keyName);
            }
        }
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

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _classifierGenericTypeRemove()
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

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _elementOverrideRemove()
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

    public final AtomicBoolean _enableConstraints_initialized = new AtomicBoolean(false);
    public java.lang.Boolean _enableConstraints;

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _enableConstraints(java.lang.Boolean val)
    {
        this._enableConstraints();
        this._enableConstraints = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _enableConstraints(RichIterable<? extends java.lang.Boolean> val)
    {
        return _enableConstraints(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _enableConstraintsRemove()
    {
        this._enableConstraints();
        this._enableConstraints = false;
        return this;
    }

    public java.lang.Boolean _enableConstraints()
    {
        if (!this._enableConstraints_initialized.get())
        {
            synchronized (this._enableConstraints_initialized)
            {
                if (!this._enableConstraints_initialized.get())
                {
                    this._enableConstraints = loadValueFromMetadata("enableConstraints");
                    this._enableConstraints_initialized.set(true);
                }
            }
        }
        return this._enableConstraints;
    }

    public final AtomicBoolean _queryTimeOutInSeconds_initialized = new AtomicBoolean(false);
    public java.lang.Long _queryTimeOutInSeconds;

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _queryTimeOutInSeconds(java.lang.Long val)
    {
        this._queryTimeOutInSeconds();
        this._queryTimeOutInSeconds = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _queryTimeOutInSeconds(RichIterable<? extends java.lang.Long> val)
    {
        return _queryTimeOutInSeconds(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl _queryTimeOutInSecondsRemove()
    {
        this._queryTimeOutInSeconds();
        this._queryTimeOutInSeconds = 0L;
        return this;
    }

    public java.lang.Long _queryTimeOutInSeconds()
    {
        if (!this._queryTimeOutInSeconds_initialized.get())
        {
            synchronized (this._queryTimeOutInSeconds_initialized)
            {
                if (!this._queryTimeOutInSeconds_initialized.get())
                {
                    this._queryTimeOutInSeconds = loadValueFromMetadata("queryTimeOutInSeconds");
                    this._queryTimeOutInSeconds_initialized.set(true);
                }
            }
        }
        return this._queryTimeOutInSeconds;
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl copy()
    {
        return new Root_meta_pure_runtime_ExecutionContext_LazyImpl(this);
    }

    public Root_meta_pure_runtime_ExecutionContext_LazyImpl(org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext src)
    {
        super((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src);
        synchronized (((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._enableConstraints_initialized)
        {
            this._enableConstraints = (java.lang.Boolean)((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._enableConstraints;
            this._enableConstraints_initialized.set(((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._enableConstraints_initialized.get());
        }
        synchronized (((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._elementOverride_initialized)
        {
            this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._elementOverride;
            this._elementOverride_initialized.set(((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._elementOverride_initialized.get());
        }
        synchronized (((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._queryTimeOutInSeconds_initialized)
        {
            this._queryTimeOutInSeconds = (java.lang.Long)((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._queryTimeOutInSeconds;
            this._queryTimeOutInSeconds_initialized.set(((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._queryTimeOutInSeconds_initialized.get());
        }
        synchronized (((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._classifierGenericType_initialized)
        {
            this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._classifierGenericType;
            this._classifierGenericType_initialized.set(((Root_meta_pure_runtime_ExecutionContext_LazyImpl)src)._classifierGenericType_initialized.get());
        }
    }
    public boolean pureEquals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || (o.getClass() != org.finos.legend.pure.generated.Root_meta_pure_runtime_ExecutionContext_LazyImpl.class && o.getClass() !=org.finos.legend.pure.generated.Root_meta_pure_runtime_ExecutionContext_Impl.class && o.getClass() != org.finos.legend.pure.generated.Root_meta_pure_runtime_ExecutionContext_CompImpl.class))        {
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
        int result = CompiledSupport.safeHashCode(this._enableConstraints);
        result = 31 * result + CompiledSupport.safeHashCode(this._queryTimeOutInSeconds);
        return result;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
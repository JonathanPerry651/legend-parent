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
public class Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> extends AbstractLazyReflectiveCoreInstance implements org.finos.legend.pure.m3.coreinstance.meta.pure.store.RelationStoreAccessor<T>
{
    public static final String tempTypeName = "RelationStoreAccessor";
    private static final String tempFullTypeId = "Root::meta::pure::store::RelationStoreAccessor";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(7)
           .withKey("Root::meta::pure::metamodel::Referenceable", "referenceUsages")
           .withKeys("Root::meta::pure::metamodel::relation::RelationElementAccessor", "sourceElement", "sourceElementContainer")
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "path", "store")
           .build();

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl(Obj instance, MetadataLazy metadataLazy)
    {
        super(instance, metadataLazy);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy)
    {
        super(id, sourceInformation, metadataLazy, vals);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy, CoreInstance classifier)
    {
        super(id, sourceInformation, metadataLazy, vals, classifier);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl(String name, SourceInformation sourceInformation, CoreInstance classifier)
    {
        super(name, sourceInformation, classifier);
    }

    public static final CoreInstanceFactory FACTORY = new BaseJavaModelCoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_pure_store_RelationStoreAccessor_LazyImpl(name, sourceInformation, classifier);
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
            case "sourceElement":
            {
                return ValCoreInstance.toCoreInstance(_sourceElement());
            }
            case "sourceElementContainer":
            {
                return ValCoreInstance.toCoreInstance(_sourceElementContainer());
            }
            case "store":
            {
                return ValCoreInstance.toCoreInstance(_store());
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
        switch (keyName)
        {
            case "path":
            {
                return ValCoreInstance.toCoreInstances(_path());
            }
            case "referenceUsages":
            {
                return ValCoreInstance.toCoreInstances(_referenceUsages());
            }
            default:
            {
                return super.getValueForMetaPropertyToMany(keyName);
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

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _classifierGenericTypeRemove()
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

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _elementOverrideRemove()
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

    public final AtomicBoolean _path_initialized = new AtomicBoolean(false);
    public RichIterable _path = Lists.mutable.empty();
    private Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _path(java.lang.String val, boolean add)
    {
        this._path();
        if (add)
        {
            if (!(this._path instanceof MutableList))
            {
                this._path = this._path.toList();
            }
            ((MutableList)this._path).add(val);
        }
        else
        {
            this._path = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _path(RichIterable<? extends java.lang.String> val, boolean add)
    {
        this._path();
        if (add)
        {
            if (!(this._path instanceof MutableList))
            {
                this._path = this._path.toList();
            }
            ((MutableList)this._path).addAllIterable(val);
        }
        else
        {
            this._path = val;
        }
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _path(RichIterable<? extends java.lang.String> val)
    {
        return this._path(val, false);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _pathAdd(java.lang.String val)
    {
        return this._path(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _pathAddAll(RichIterable<? extends java.lang.String> val)
    {
        return this._path(val, true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _pathRemove()
    {
        this._path();
        this._path = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _pathRemove(java.lang.String val)
    {
        this._path();
        if (!(this._path instanceof MutableList))
        {
            this._path = this._path.toList();
        }
        ((MutableList)this._path).remove(val);
        return this;
    }

    public RichIterable<? extends java.lang.String> _path()
    {
        if (!this._path_initialized.get())
        {
            synchronized (this._path_initialized)
            {
                if (!this._path_initialized.get())
                {
                    this._path = loadValuesFromMetadata("path");
                    this._path_initialized.set(true);
                }
            }
        }
        return this._path;
    }

    public final AtomicBoolean _referenceUsages_initialized = new AtomicBoolean(false);
    public RichIterable _referenceUsages = Lists.mutable.empty();

    public void _reverse_referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        this._referenceUsages();
        if (!(this._referenceUsages instanceof MutableList))
        {
            this._referenceUsages = this._referenceUsages.toList();
        }
        ((MutableList)this._referenceUsages).add(val);
    }

    public void _sever_reverse_referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        this._referenceUsages();
        if (!(this._referenceUsages instanceof MutableList))
        {
            this._referenceUsages = this._referenceUsages.toList();
        }
        ((MutableList)this._referenceUsages).remove(val);
    }

    private Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val, boolean add)
    {
        this._referenceUsages();
        if (val == null)
        {
            if (!add)
            {
                this._referenceUsages = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._referenceUsages instanceof MutableList))
            {
                this._referenceUsages = this._referenceUsages.toList();
            }
            ((MutableList)this._referenceUsages).add(val);
        }
        else
        {
            this._referenceUsages = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val, boolean add)
    {
        this._referenceUsages();
        if (add)
        {
            if (!(this._referenceUsages instanceof MutableList))
            {
                this._referenceUsages = this._referenceUsages.toList();
            }
            ((MutableList)this._referenceUsages).addAllIterable(val);
        }
        else
        {
            this._referenceUsages = val;
        }
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, false);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsagesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        return this._referenceUsages(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsagesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsagesRemove()
    {
        this._referenceUsages();
        this._referenceUsages = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _referenceUsagesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        this._referenceUsages();
        if (!(this._referenceUsages instanceof MutableList))
        {
            this._referenceUsages = this._referenceUsages.toList();
        }
        ((MutableList)this._referenceUsages).remove(val);
        return this;
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> _referenceUsages()
    {
        if (!this._referenceUsages_initialized.get())
        {
            synchronized (this._referenceUsages_initialized)
            {
                if (!this._referenceUsages_initialized.get())
                {
                    this._referenceUsages = loadValuesFromMetadata("referenceUsages");
                    this._referenceUsages_initialized.set(true);
                }
            }
        }
        return this._referenceUsages;
    }

    public final AtomicBoolean _sourceElement_initialized = new AtomicBoolean(false);
    public java.lang.Object _sourceElement;

    public void _reverse_sourceElement(java.lang.Object val)
    {
        this._sourceElement();
        this._sourceElement = val;
    }

    public void _sever_reverse_sourceElement(java.lang.Object val)
    {
        this._sourceElement();
        this._sourceElement = null;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _sourceElement(java.lang.Object val)
    {
        this._sourceElement();
        this._sourceElement = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _sourceElement(RichIterable<? extends java.lang.Object> val)
    {
        return _sourceElement(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _sourceElementRemove()
    {
        this._sourceElement();
        this._sourceElement = null;
        return this;
    }

    public org.finos.legend.pure.m4.coreinstance.CoreInstance _sourceElementCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public java.lang.Object _sourceElement()
    {
        if (!this._sourceElement_initialized.get())
        {
            synchronized (this._sourceElement_initialized)
            {
                if (!this._sourceElement_initialized.get())
                {
                    this._sourceElement = loadValueFromMetadata("sourceElement");
                    this._sourceElement_initialized.set(true);
                }
            }
        }
        return this._sourceElement;
    }

    public final AtomicBoolean _sourceElementContainer_initialized = new AtomicBoolean(false);
    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement _sourceElementContainer;

    public void _reverse_sourceElementContainer(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement val)
    {
        this._sourceElementContainer();
        this._sourceElementContainer = val;
    }

    public void _sever_reverse_sourceElementContainer(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement val)
    {
        this._sourceElementContainer();
        this._sourceElementContainer = null;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _sourceElementContainer(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement val)
    {
        this._sourceElementContainer();
        this._sourceElementContainer = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _sourceElementContainer(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement> val)
    {
        return _sourceElementContainer(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _sourceElementContainerRemove()
    {
        this._sourceElementContainer();
        this._sourceElementContainer = null;
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement _sourceElementContainer()
    {
        if (!this._sourceElementContainer_initialized.get())
        {
            synchronized (this._sourceElementContainer_initialized)
            {
                if (!this._sourceElementContainer_initialized.get())
                {
                    this._sourceElementContainer = loadValueFromMetadata("sourceElementContainer");
                    this._sourceElementContainer_initialized.set(true);
                }
            }
        }
        return this._sourceElementContainer;
    }

    public final AtomicBoolean _store_initialized = new AtomicBoolean(false);
    public org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store _store;

    public void _reverse_store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store();
        this._store = val;
    }

    public void _sever_reverse_store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store();
        this._store = null;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store();
        this._store = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _store(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return _store(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _storeRemove()
    {
        this._store();
        this._store = null;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> _storeCoreInstance(org.finos.legend.pure.m4.coreinstance.CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public org.finos.legend.pure.m4.coreinstance.CoreInstance _storeCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store _store()
    {
        if (!this._store_initialized.get())
        {
            synchronized (this._store_initialized)
            {
                if (!this._store_initialized.get())
                {
                    this._store = loadValueFromMetadata("store");
                    this._store_initialized.set(true);
                }
            }
        }
        return this._store;
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl<T> copy()
    {
        return new Root_meta_pure_store_RelationStoreAccessor_LazyImpl(this);
    }

    public Root_meta_pure_store_RelationStoreAccessor_LazyImpl(org.finos.legend.pure.m3.coreinstance.meta.pure.store.RelationStoreAccessor<T> src)
    {
        super((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src);
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._elementOverride_initialized)
        {
            this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._elementOverride;
            this._elementOverride_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._elementOverride_initialized.get());
        }
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._store_initialized)
        {
            this._store = (org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store)((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._store;
            this._store_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._store_initialized.get());
        }
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._path_initialized)
        {
            this._path = FastList.newList(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._path);
            this._path_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._path_initialized.get());
        }
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._sourceElementContainer_initialized)
        {
            this._sourceElementContainer = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement)((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._sourceElementContainer;
            this._sourceElementContainer_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._sourceElementContainer_initialized.get());
        }
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._sourceElement_initialized)
        {
            this._sourceElement = (java.lang.Object)((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._sourceElement;
            this._sourceElement_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._sourceElement_initialized.get());
        }
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._referenceUsages_initialized)
        {
            this._referenceUsages = FastList.newList(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._referenceUsages);
            this._referenceUsages_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._referenceUsages_initialized.get());
        }
        synchronized (((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._classifierGenericType_initialized)
        {
            this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._classifierGenericType;
            this._classifierGenericType_initialized.set(((Root_meta_pure_store_RelationStoreAccessor_LazyImpl)src)._classifierGenericType_initialized.get());
        }
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
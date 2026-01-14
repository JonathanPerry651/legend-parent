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
public class Root_meta_pure_store_RelationStoreAccessor_Impl<T> extends Root_meta_pure_metamodel_relation_RelationElementAccessor_Impl<T> implements org.finos.legend.pure.m3.coreinstance.meta.pure.store.RelationStoreAccessor<T>
{
    public static final String tempTypeName = "RelationStoreAccessor";
    private static final String tempFullTypeId = "Root::meta::pure::store::RelationStoreAccessor";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(7)
           .withKey("Root::meta::pure::metamodel::Referenceable", "referenceUsages")
           .withKeys("Root::meta::pure::metamodel::relation::RelationElementAccessor", "sourceElement", "sourceElementContainer")
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "path", "store")
           .build();
    private CoreInstance classifier;

    public Root_meta_pure_store_RelationStoreAccessor_Impl(String id)
    {
        super(id);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
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
            return new Root_meta_pure_store_RelationStoreAccessor_Impl(name, sourceInformation, classifier);
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

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public RichIterable _path = Lists.mutable.empty();
    private Root_meta_pure_store_RelationStoreAccessor_Impl<T> _path(java.lang.String val, boolean add)
    {
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

    private Root_meta_pure_store_RelationStoreAccessor_Impl<T> _path(RichIterable<? extends java.lang.String> val, boolean add)
    {
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

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _path(RichIterable<? extends java.lang.String> val)
    {
        return this._path(val, false);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _pathAdd(java.lang.String val)
    {
        return this._path(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _pathAddAll(RichIterable<? extends java.lang.String> val)
    {
        return this._path(val, true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _pathRemove()
    {
        this._path = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _pathRemove(java.lang.String val)
    {
        if (!(this._path instanceof MutableList))
        {
            this._path = this._path.toList();
        }
        ((MutableList)this._path).remove(val);
        return this;
    }

    public RichIterable<? extends java.lang.String> _path()
    {
        return this._path;
    }

    private Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val, boolean add)
    {
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

    private Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val, boolean add)
    {
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

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, false);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsagesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        return this._referenceUsages(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsagesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, true);
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsagesRemove()
    {
        this._referenceUsages = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _referenceUsagesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        if (!(this._referenceUsages instanceof MutableList))
        {
            this._referenceUsages = this._referenceUsages.toList();
        }
        ((MutableList)this._referenceUsages).remove(val);
        return this;
    }


    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _sourceElement(java.lang.Object val)
    {
        this._sourceElement = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _sourceElement(RichIterable<? extends java.lang.Object> val)
    {
        return _sourceElement(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _sourceElementRemove()
    {
        this._sourceElement = null;
        return this;
    }


    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _sourceElementContainer(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement val)
    {
        this._sourceElementContainer = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _sourceElementContainer(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement> val)
    {
        return _sourceElementContainer(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _sourceElementContainerRemove()
    {
        this._sourceElementContainer = null;
        return this;
    }


    public org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store _store;
    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store = val;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _store(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return _store(val.getFirst());
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _storeRemove()
    {
        this._store = null;
        return this;
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> _storeCoreInstance(org.finos.legend.pure.m4.coreinstance.CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public void _reverse_store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store = val;
    }

    public void _sever_reverse_store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store = null;
    }

    public org.finos.legend.pure.m4.coreinstance.CoreInstance _storeCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store _store()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._store : (org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store)((GetterOverrideExecutor)this._elementOverride()).executeToOne(this, "Root::meta::pure::store::RelationStoreAccessor", "store");
    }

    public Root_meta_pure_store_RelationStoreAccessor_Impl<T> copy()
    {
        return new Root_meta_pure_store_RelationStoreAccessor_Impl(this);
    }
    public Root_meta_pure_store_RelationStoreAccessor_Impl(org.finos.legend.pure.m3.coreinstance.meta.pure.store.RelationStoreAccessor<T> src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_pure_store_RelationStoreAccessor_Impl)src).classifier;
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._elementOverride;
        this._store = (org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store)((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._store;
        this._path = Lists.mutable.ofAll(((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._path);
        this._sourceElementContainer = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement)((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._sourceElementContainer;
        this._sourceElement = (java.lang.Object)((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._sourceElement;
        this._referenceUsages = Lists.mutable.ofAll(((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._referenceUsages);
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_store_RelationStoreAccessor_Impl)src)._classifierGenericType;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
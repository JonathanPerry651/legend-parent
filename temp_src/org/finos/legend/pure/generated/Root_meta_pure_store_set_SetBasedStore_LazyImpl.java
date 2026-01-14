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
public class Root_meta_pure_store_set_SetBasedStore_LazyImpl extends AbstractLazyReflectiveCoreInstance implements org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetBasedStore
{
    public static final String tempTypeName = "SetBasedStore";
    private static final String tempFullTypeId = "Root::meta::pure::store::set::SetBasedStore";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(9)
           .withKey("Root::meta::pure::metamodel::ModelElement", "name")
           .withKey("Root::meta::pure::metamodel::PackageableElement", "package")
           .withKey("Root::meta::pure::metamodel::Referenceable", "referenceUsages")
           .withKey("Root::meta::pure::metamodel::extension::ElementWithStereotypes", "stereotypes")
           .withKey("Root::meta::pure::metamodel::extension::ElementWithTaggedValues", "taggedValues")
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKey("Root::meta::pure::store::Store", "includes")
           .withKey(tempFullTypeId, "namespaces")
           .build();

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl(Obj instance, MetadataLazy metadataLazy)
    {
        super(instance, metadataLazy);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy)
    {
        super(id, sourceInformation, metadataLazy, vals);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy, CoreInstance classifier)
    {
        super(id, sourceInformation, metadataLazy, vals, classifier);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl(String name, SourceInformation sourceInformation, CoreInstance classifier)
    {
        super(name, sourceInformation, classifier);
    }

    public static final CoreInstanceFactory FACTORY = new BaseJavaModelCoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_pure_store_set_SetBasedStore_LazyImpl(name, sourceInformation, classifier);
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
            case "name":
            {
                return ValCoreInstance.toCoreInstance(_name());
            }
            case "package":
            {
                return ValCoreInstance.toCoreInstance(_package());
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
            case "includes":
            {
                return ValCoreInstance.toCoreInstances(_includes());
            }
            case "namespaces":
            {
                return ValCoreInstance.toCoreInstances(_namespaces());
            }
            case "referenceUsages":
            {
                return ValCoreInstance.toCoreInstances(_referenceUsages());
            }
            case "stereotypes":
            {
                return ValCoreInstance.toCoreInstances(_stereotypes());
            }
            case "taggedValues":
            {
                return ValCoreInstance.toCoreInstances(_taggedValues());
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

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _classifierGenericTypeRemove()
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

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _elementOverrideRemove()
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

    public final AtomicBoolean _includes_initialized = new AtomicBoolean(false);
    public RichIterable _includes = Lists.mutable.empty();

    public void _reverse_includes(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._includes();
        if (!(this._includes instanceof MutableList))
        {
            this._includes = this._includes.toList();
        }
        ((MutableList)this._includes).add(val);
    }

    public void _sever_reverse_includes(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._includes();
        if (!(this._includes instanceof MutableList))
        {
            this._includes = this._includes.toList();
        }
        ((MutableList)this._includes).remove(val);
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _includes(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val, boolean add)
    {
        this._includes();
        if (val == null)
        {
            if (!add)
            {
                this._includes = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._includes instanceof MutableList))
            {
                this._includes = this._includes.toList();
            }
            ((MutableList)this._includes).add(val);
        }
        else
        {
            this._includes = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _includes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val, boolean add)
    {
        this._includes();
        if (add)
        {
            if (!(this._includes instanceof MutableList))
            {
                this._includes = this._includes.toList();
            }
            ((MutableList)this._includes).addAllIterable(val);
        }
        else
        {
            this._includes = val;
        }
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return this._includes(val, false);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        return this._includes(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return this._includes(val, true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesRemove()
    {
        this._includes();
        this._includes = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._includes();
        if (!(this._includes instanceof MutableList))
        {
            this._includes = this._includes.toList();
        }
        ((MutableList)this._includes).remove(val);
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _includesRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<org.finos.legend.pure.m4.coreinstance.CoreInstance> _includesCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> _includes()
    {
        if (!this._includes_initialized.get())
        {
            synchronized (this._includes_initialized)
            {
                if (!this._includes_initialized.get())
                {
                    this._includes = loadValuesFromMetadata("includes");
                    this._includes_initialized.set(true);
                }
            }
        }
        return this._includes;
    }

    public final AtomicBoolean _name_initialized = new AtomicBoolean(false);
    public java.lang.String _name;

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _name(java.lang.String val)
    {
        this._name();
        this._name = val;
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _name(RichIterable<? extends java.lang.String> val)
    {
        return _name(val.getFirst());
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _nameRemove()
    {
        this._name();
        this._name = null;
        return this;
    }

    public java.lang.String _name()
    {
        if (!this._name_initialized.get())
        {
            synchronized (this._name_initialized)
            {
                if (!this._name_initialized.get())
                {
                    this._name = loadValueFromMetadata("name");
                    this._name_initialized.set(true);
                }
            }
        }
        return this._name;
    }

    public final AtomicBoolean _namespaces_initialized = new AtomicBoolean(false);
    public RichIterable _namespaces = Lists.mutable.empty();

    public void _reverse_namespaces(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace val)
    {
        this._namespaces();
        if (!(this._namespaces instanceof MutableList))
        {
            this._namespaces = this._namespaces.toList();
        }
        ((MutableList)this._namespaces).add(val);
    }

    public void _sever_reverse_namespaces(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace val)
    {
        this._namespaces();
        if (!(this._namespaces instanceof MutableList))
        {
            this._namespaces = this._namespaces.toList();
        }
        ((MutableList)this._namespaces).remove(val);
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespaces(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace val, boolean add)
    {
        this._namespaces();
        if (val == null)
        {
            if (!add)
            {
                this._namespaces = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._namespaces instanceof MutableList))
            {
                this._namespaces = this._namespaces.toList();
            }
            ((MutableList)this._namespaces).add(val);
        }
        else
        {
            this._namespaces = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespaces(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace> val, boolean add)
    {
        this._namespaces();
        if (add)
        {
            if (!(this._namespaces instanceof MutableList))
            {
                this._namespaces = this._namespaces.toList();
            }
            ((MutableList)this._namespaces).addAllIterable(val);
        }
        else
        {
            this._namespaces = val;
        }
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespaces(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace> val)
    {
        return this._namespaces(val, false);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespacesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace val)
    {
        return this._namespaces(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespacesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace> val)
    {
        return this._namespaces(val, true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespacesRemove()
    {
        this._namespaces();
        this._namespaces = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _namespacesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace val)
    {
        this._namespaces();
        if (!(this._namespaces instanceof MutableList))
        {
            this._namespaces = this._namespaces.toList();
        }
        ((MutableList)this._namespaces).remove(val);
        return this;
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace> _namespaces()
    {
        if (!this._namespaces_initialized.get())
        {
            synchronized (this._namespaces_initialized)
            {
                if (!this._namespaces_initialized.get())
                {
                    this._namespaces = loadValuesFromMetadata("namespaces");
                    this._namespaces_initialized.set(true);
                }
            }
        }
        return this._namespaces;
    }

    public final AtomicBoolean _package_initialized = new AtomicBoolean(false);
    public org.finos.legend.pure.m3.coreinstance.Package _package;

    public void _reverse_package(org.finos.legend.pure.m3.coreinstance.Package val)
    {
        this._package();
        this._package = val;
    }

    public void _sever_reverse_package(org.finos.legend.pure.m3.coreinstance.Package val)
    {
        this._package();
        this._package = null;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _package(org.finos.legend.pure.m3.coreinstance.Package val)
    {
        this._package();
        this._package = val;
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _package(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.Package> val)
    {
        return _package(val.getFirst());
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _packageRemove()
    {
        this._package();
        this._package = null;
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.Package _package()
    {
        if (!this._package_initialized.get())
        {
            synchronized (this._package_initialized)
            {
                if (!this._package_initialized.get())
                {
                    this._package = loadValueFromMetadata("package");
                    this._package_initialized.set(true);
                }
            }
        }
        return this._package;
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

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val, boolean add)
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

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val, boolean add)
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

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, false);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsagesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        return this._referenceUsages(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsagesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsagesRemove()
    {
        this._referenceUsages();
        this._referenceUsages = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _referenceUsagesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
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

    public final AtomicBoolean _stereotypes_initialized = new AtomicBoolean(false);
    public RichIterable _stereotypes = Lists.mutable.empty();

    public void _reverse_stereotypes(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val)
    {
        this._stereotypes();
        if (!(this._stereotypes instanceof MutableList))
        {
            this._stereotypes = this._stereotypes.toList();
        }
        ((MutableList)this._stereotypes).add(val);
    }

    public void _sever_reverse_stereotypes(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val)
    {
        this._stereotypes();
        if (!(this._stereotypes instanceof MutableList))
        {
            this._stereotypes = this._stereotypes.toList();
        }
        ((MutableList)this._stereotypes).remove(val);
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypes(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val, boolean add)
    {
        this._stereotypes();
        if (val == null)
        {
            if (!add)
            {
                this._stereotypes = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._stereotypes instanceof MutableList))
            {
                this._stereotypes = this._stereotypes.toList();
            }
            ((MutableList)this._stereotypes).add(val);
        }
        else
        {
            this._stereotypes = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> val, boolean add)
    {
        this._stereotypes();
        if (add)
        {
            if (!(this._stereotypes instanceof MutableList))
            {
                this._stereotypes = this._stereotypes.toList();
            }
            ((MutableList)this._stereotypes).addAllIterable(val);
        }
        else
        {
            this._stereotypes = val;
        }
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> val)
    {
        return this._stereotypes(val, false);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val)
    {
        return this._stereotypes(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> val)
    {
        return this._stereotypes(val, true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesRemove()
    {
        this._stereotypes();
        this._stereotypes = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val)
    {
        this._stereotypes();
        if (!(this._stereotypes instanceof MutableList))
        {
            this._stereotypes = this._stereotypes.toList();
        }
        ((MutableList)this._stereotypes).remove(val);
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _stereotypesRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<org.finos.legend.pure.m4.coreinstance.CoreInstance> _stereotypesCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> _stereotypes()
    {
        if (!this._stereotypes_initialized.get())
        {
            synchronized (this._stereotypes_initialized)
            {
                if (!this._stereotypes_initialized.get())
                {
                    this._stereotypes = loadValuesFromMetadata("stereotypes");
                    this._stereotypes_initialized.set(true);
                }
            }
        }
        return this._stereotypes;
    }

    public final AtomicBoolean _taggedValues_initialized = new AtomicBoolean(false);
    public RichIterable _taggedValues = Lists.mutable.empty();

    public void _reverse_taggedValues(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val)
    {
        this._taggedValues();
        if (!(this._taggedValues instanceof MutableList))
        {
            this._taggedValues = this._taggedValues.toList();
        }
        ((MutableList)this._taggedValues).add(val);
    }

    public void _sever_reverse_taggedValues(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val)
    {
        this._taggedValues();
        if (!(this._taggedValues instanceof MutableList))
        {
            this._taggedValues = this._taggedValues.toList();
        }
        ((MutableList)this._taggedValues).remove(val);
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValues(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val, boolean add)
    {
        this._taggedValues();
        if (val == null)
        {
            if (!add)
            {
                this._taggedValues = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._taggedValues instanceof MutableList))
            {
                this._taggedValues = this._taggedValues.toList();
            }
            ((MutableList)this._taggedValues).add(val);
        }
        else
        {
            this._taggedValues = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValues(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> val, boolean add)
    {
        this._taggedValues();
        if (add)
        {
            if (!(this._taggedValues instanceof MutableList))
            {
                this._taggedValues = this._taggedValues.toList();
            }
            ((MutableList)this._taggedValues).addAllIterable(val);
        }
        else
        {
            this._taggedValues = val;
        }
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValues(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> val)
    {
        return this._taggedValues(val, false);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValuesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val)
    {
        return this._taggedValues(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValuesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> val)
    {
        return this._taggedValues(val, true);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValuesRemove()
    {
        this._taggedValues();
        this._taggedValues = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl _taggedValuesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val)
    {
        this._taggedValues();
        if (!(this._taggedValues instanceof MutableList))
        {
            this._taggedValues = this._taggedValues.toList();
        }
        ((MutableList)this._taggedValues).remove(val);
        return this;
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> _taggedValues()
    {
        if (!this._taggedValues_initialized.get())
        {
            synchronized (this._taggedValues_initialized)
            {
                if (!this._taggedValues_initialized.get())
                {
                    this._taggedValues = loadValuesFromMetadata("taggedValues");
                    this._taggedValues_initialized.set(true);
                }
            }
        }
        return this._taggedValues;
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl copy()
    {
        return new Root_meta_pure_store_set_SetBasedStore_LazyImpl(this);
    }

    public Root_meta_pure_store_set_SetBasedStore_LazyImpl(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetBasedStore src)
    {
        super((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src);
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._taggedValues_initialized)
        {
            this._taggedValues = FastList.newList(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._taggedValues);
            this._taggedValues_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._taggedValues_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._elementOverride_initialized)
        {
            this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._elementOverride;
            this._elementOverride_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._elementOverride_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._stereotypes_initialized)
        {
            this._stereotypes = FastList.newList(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._stereotypes);
            this._stereotypes_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._stereotypes_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._name_initialized)
        {
            this._name = (java.lang.String)((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._name;
            this._name_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._name_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._package_initialized)
        {
            this._package = (org.finos.legend.pure.m3.coreinstance.Package)((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._package;
            this._package_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._package_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._includes_initialized)
        {
            this._includes = FastList.newList(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._includes);
            this._includes_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._includes_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._referenceUsages_initialized)
        {
            this._referenceUsages = FastList.newList(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._referenceUsages);
            this._referenceUsages_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._referenceUsages_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._namespaces_initialized)
        {
            this._namespaces = FastList.newList(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._namespaces);
            this._namespaces_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._namespaces_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._classifierGenericType_initialized)
        {
            this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._classifierGenericType;
            this._classifierGenericType_initialized.set(((Root_meta_pure_store_set_SetBasedStore_LazyImpl)src)._classifierGenericType_initialized.get());
        }
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
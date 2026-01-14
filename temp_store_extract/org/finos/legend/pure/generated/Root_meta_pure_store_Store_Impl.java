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
public class Root_meta_pure_store_Store_Impl extends Root_meta_pure_metamodel_PackageableElement_Impl implements org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store
{
    public static final String tempTypeName = "Store";
    private static final String tempFullTypeId = "Root::meta::pure::store::Store";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(8)
           .withKey("Root::meta::pure::metamodel::ModelElement", "name")
           .withKey("Root::meta::pure::metamodel::PackageableElement", "package")
           .withKey("Root::meta::pure::metamodel::Referenceable", "referenceUsages")
           .withKey("Root::meta::pure::metamodel::extension::ElementWithStereotypes", "stereotypes")
           .withKey("Root::meta::pure::metamodel::extension::ElementWithTaggedValues", "taggedValues")
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKey(tempFullTypeId, "includes")
           .build();
    private CoreInstance classifier;

    public Root_meta_pure_store_Store_Impl(String id)
    {
        super(id);
    }

    public Root_meta_pure_store_Store_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
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
            return new Root_meta_pure_store_Store_Impl(name, sourceInformation, classifier);
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

    public Root_meta_pure_store_Store_Impl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_store_Store_Impl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_store_Store_Impl _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public Root_meta_pure_store_Store_Impl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_store_Store_Impl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_store_Store_Impl _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public RichIterable _includes = Lists.mutable.empty();
    private Root_meta_pure_store_Store_Impl _includes(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val, boolean add)
    {
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

    private Root_meta_pure_store_Store_Impl _includes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val, boolean add)
    {
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

    public Root_meta_pure_store_Store_Impl _includes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return this._includes(val, false);
    }

    public Root_meta_pure_store_Store_Impl _includesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        return this._includes(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_Store_Impl _includesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return this._includes(val, true);
    }

    public Root_meta_pure_store_Store_Impl _includesRemove()
    {
        this._includes = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_Store_Impl _includesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        if (!(this._includes instanceof MutableList))
        {
            this._includes = this._includes.toList();
        }
        ((MutableList)this._includes).remove(val);
        return this;
    }

    public Root_meta_pure_store_Store_Impl _includesAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_Store_Impl _includesAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_Store_Impl _includesCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_Store_Impl _includesRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public void _reverse_includes(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        if (!(this._includes instanceof MutableList))
        {
            this._includes = this._includes.toList();
        }
        ((MutableList)this._includes).add(val);
    }

    public void _sever_reverse_includes(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        if (!(this._includes instanceof MutableList))
        {
            this._includes = this._includes.toList();
        }
        ((MutableList)this._includes).remove(val);
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> _includes()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._includes : (RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store>)((GetterOverrideExecutor)this._elementOverride()).executeToMany(this, "Root::meta::pure::store::Store", "includes");
    }
    public RichIterable<org.finos.legend.pure.m4.coreinstance.CoreInstance> _includesCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public Root_meta_pure_store_Store_Impl _name(java.lang.String val)
    {
        this._name = val;
        return this;
    }

    public Root_meta_pure_store_Store_Impl _name(RichIterable<? extends java.lang.String> val)
    {
        return _name(val.getFirst());
    }

    public Root_meta_pure_store_Store_Impl _nameRemove()
    {
        this._name = null;
        return this;
    }


    public Root_meta_pure_store_Store_Impl _package(org.finos.legend.pure.m3.coreinstance.Package val)
    {
        this._package = val;
        return this;
    }

    public Root_meta_pure_store_Store_Impl _package(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.Package> val)
    {
        return _package(val.getFirst());
    }

    public Root_meta_pure_store_Store_Impl _packageRemove()
    {
        this._package = null;
        return this;
    }


    private Root_meta_pure_store_Store_Impl _referenceUsages(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val, boolean add)
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

    private Root_meta_pure_store_Store_Impl _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val, boolean add)
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

    public Root_meta_pure_store_Store_Impl _referenceUsages(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, false);
    }

    public Root_meta_pure_store_Store_Impl _referenceUsagesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        return this._referenceUsages(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_Store_Impl _referenceUsagesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage> val)
    {
        return this._referenceUsages(val, true);
    }

    public Root_meta_pure_store_Store_Impl _referenceUsagesRemove()
    {
        this._referenceUsages = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_Store_Impl _referenceUsagesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.ReferenceUsage val)
    {
        if (!(this._referenceUsages instanceof MutableList))
        {
            this._referenceUsages = this._referenceUsages.toList();
        }
        ((MutableList)this._referenceUsages).remove(val);
        return this;
    }


    private Root_meta_pure_store_Store_Impl _stereotypes(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val, boolean add)
    {
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

    private Root_meta_pure_store_Store_Impl _stereotypes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> val, boolean add)
    {
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

    public Root_meta_pure_store_Store_Impl _stereotypes(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> val)
    {
        return this._stereotypes(val, false);
    }

    public Root_meta_pure_store_Store_Impl _stereotypesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val)
    {
        return this._stereotypes(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_Store_Impl _stereotypesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype> val)
    {
        return this._stereotypes(val, true);
    }

    public Root_meta_pure_store_Store_Impl _stereotypesRemove()
    {
        this._stereotypes = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_Store_Impl _stereotypesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.Stereotype val)
    {
        if (!(this._stereotypes instanceof MutableList))
        {
            this._stereotypes = this._stereotypes.toList();
        }
        ((MutableList)this._stereotypes).remove(val);
        return this;
    }

    public Root_meta_pure_store_Store_Impl _stereotypesAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_Store_Impl _stereotypesAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_Store_Impl _stereotypesCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_Store_Impl _stereotypesRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<org.finos.legend.pure.m4.coreinstance.CoreInstance> _stereotypesCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    private Root_meta_pure_store_Store_Impl _taggedValues(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val, boolean add)
    {
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

    private Root_meta_pure_store_Store_Impl _taggedValues(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> val, boolean add)
    {
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

    public Root_meta_pure_store_Store_Impl _taggedValues(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> val)
    {
        return this._taggedValues(val, false);
    }

    public Root_meta_pure_store_Store_Impl _taggedValuesAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val)
    {
        return this._taggedValues(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_Store_Impl _taggedValuesAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue> val)
    {
        return this._taggedValues(val, true);
    }

    public Root_meta_pure_store_Store_Impl _taggedValuesRemove()
    {
        this._taggedValues = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_Store_Impl _taggedValuesRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.extension.TaggedValue val)
    {
        if (!(this._taggedValues instanceof MutableList))
        {
            this._taggedValues = this._taggedValues.toList();
        }
        ((MutableList)this._taggedValues).remove(val);
        return this;
    }


    public Root_meta_pure_store_Store_Impl copy()
    {
        return new Root_meta_pure_store_Store_Impl(this);
    }
    public Root_meta_pure_store_Store_Impl(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_pure_store_Store_Impl)src).classifier;
        this._taggedValues = Lists.mutable.ofAll(((Root_meta_pure_store_Store_Impl)src)._taggedValues);
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_store_Store_Impl)src)._elementOverride;
        this._stereotypes = Lists.mutable.ofAll(((Root_meta_pure_store_Store_Impl)src)._stereotypes);
        this._name = (java.lang.String)((Root_meta_pure_store_Store_Impl)src)._name;
        this._package = (org.finos.legend.pure.m3.coreinstance.Package)((Root_meta_pure_store_Store_Impl)src)._package;
        this._includes = Lists.mutable.ofAll(((Root_meta_pure_store_Store_Impl)src)._includes);
        this._referenceUsages = Lists.mutable.ofAll(((Root_meta_pure_store_Store_Impl)src)._referenceUsages);
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_store_Store_Impl)src)._classifierGenericType;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
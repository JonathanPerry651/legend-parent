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
public class Root_meta_pure_store_set_Namespace_Impl extends Root_meta_pure_metamodel_type_Any_Impl implements org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace
{
    public static final String tempTypeName = "Namespace";
    private static final String tempFullTypeId = "Root::meta::pure::store::set::Namespace";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(3)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKey(tempFullTypeId, "relations")
           .build();
    private CoreInstance classifier;

    public Root_meta_pure_store_set_Namespace_Impl(String id)
    {
        super(id);
    }

    public Root_meta_pure_store_set_Namespace_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
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
            return new Root_meta_pure_store_set_Namespace_Impl(name, sourceInformation, classifier);
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
            default:
            {
                return super.getValueForMetaPropertyToOne(keyName);
            }
        }
    }

    @Override
    public ListIterable<CoreInstance> getValueForMetaPropertyToMany(String keyName)
    {
        return "relations".equals(keyName) ? ValCoreInstance.toCoreInstances(_relations()) : super.getValueForMetaPropertyToMany(keyName);
    }

    public Root_meta_pure_store_set_Namespace_Impl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_store_set_Namespace_Impl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_store_set_Namespace_Impl _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public Root_meta_pure_store_set_Namespace_Impl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_store_set_Namespace_Impl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_store_set_Namespace_Impl _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public RichIterable _relations = Lists.mutable.empty();
    private Root_meta_pure_store_set_Namespace_Impl _relations(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation val, boolean add)
    {
        if (val == null)
        {
            if (!add)
            {
                this._relations = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._relations instanceof MutableList))
            {
                this._relations = this._relations.toList();
            }
            ((MutableList)this._relations).add(val);
        }
        else
        {
            this._relations = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_set_Namespace_Impl _relations(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation> val, boolean add)
    {
        if (add)
        {
            if (!(this._relations instanceof MutableList))
            {
                this._relations = this._relations.toList();
            }
            ((MutableList)this._relations).addAllIterable(val);
        }
        else
        {
            this._relations = val;
        }
        return this;
    }

    public Root_meta_pure_store_set_Namespace_Impl _relations(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation> val)
    {
        return this._relations(val, false);
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation val)
    {
        return this._relations(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation> val)
    {
        return this._relations(val, true);
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsRemove()
    {
        this._relations = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation val)
    {
        if (!(this._relations instanceof MutableList))
        {
            this._relations = this._relations.toList();
        }
        ((MutableList)this._relations).remove(val);
        return this;
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_Namespace_Impl _relationsRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public void _reverse_relations(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation val)
    {
        if (!(this._relations instanceof MutableList))
        {
            this._relations = this._relations.toList();
        }
        ((MutableList)this._relations).add(val);
    }

    public void _sever_reverse_relations(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation val)
    {
        if (!(this._relations instanceof MutableList))
        {
            this._relations = this._relations.toList();
        }
        ((MutableList)this._relations).remove(val);
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation> _relations()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._relations : (RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation>)((GetterOverrideExecutor)this._elementOverride()).executeToMany(this, "Root::meta::pure::store::set::Namespace", "relations");
    }
    public RichIterable<org.finos.legend.pure.m4.coreinstance.CoreInstance> _relationsCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }


    public Root_meta_pure_store_set_Namespace_Impl copy()
    {
        return new Root_meta_pure_store_set_Namespace_Impl(this);
    }
    public Root_meta_pure_store_set_Namespace_Impl(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_pure_store_set_Namespace_Impl)src).classifier;
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_store_set_Namespace_Impl)src)._elementOverride;
        this._relations = Lists.mutable.ofAll(((Root_meta_pure_store_set_Namespace_Impl)src)._relations);
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_store_set_Namespace_Impl)src)._classifierGenericType;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
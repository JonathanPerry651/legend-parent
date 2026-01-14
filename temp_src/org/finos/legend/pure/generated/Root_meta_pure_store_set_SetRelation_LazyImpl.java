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
public class Root_meta_pure_store_set_SetRelation_LazyImpl extends AbstractLazyReflectiveCoreInstance implements org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation
{
    public static final String tempTypeName = "SetRelation";
    private static final String tempFullTypeId = "Root::meta::pure::store::set::SetRelation";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(3)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKey(tempFullTypeId, "setColumns")
           .build();

    public Root_meta_pure_store_set_SetRelation_LazyImpl(Obj instance, MetadataLazy metadataLazy)
    {
        super(instance, metadataLazy);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy)
    {
        super(id, sourceInformation, metadataLazy, vals);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl(String id, org.finos.legend.pure.m4.coreinstance.SourceInformation sourceInformation, ImmutableMap<String, Object> vals, MetadataLazy metadataLazy, CoreInstance classifier)
    {
        super(id, sourceInformation, metadataLazy, vals, classifier);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl(String name, SourceInformation sourceInformation, CoreInstance classifier)
    {
        super(name, sourceInformation, classifier);
    }

    public static final CoreInstanceFactory FACTORY = new BaseJavaModelCoreInstanceFactory()
    {
        @Override
        public CoreInstance createCoreInstance(String name, int internalSyntheticId, SourceInformation sourceInformation, CoreInstance classifier, ModelRepository repository, boolean persistent)
        {
            return new Root_meta_pure_store_set_SetRelation_LazyImpl(name, sourceInformation, classifier);
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
            default:
            {
                return super.getValueForMetaPropertyToOne(keyName);
            }
        }
    }

    @Override
    public ListIterable<CoreInstance> getValueForMetaPropertyToMany(String keyName)
    {
        return "setColumns".equals(keyName) ? ValCoreInstance.toCoreInstances(_setColumns()) : super.getValueForMetaPropertyToMany(keyName);
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

    public Root_meta_pure_store_set_SetRelation_LazyImpl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType();
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _classifierGenericTypeRemove()
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

    public Root_meta_pure_store_set_SetRelation_LazyImpl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride();
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _elementOverrideRemove()
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

    public final AtomicBoolean _setColumns_initialized = new AtomicBoolean(false);
    public RichIterable _setColumns = Lists.mutable.empty();

    public void _reverse_setColumns(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn val)
    {
        this._setColumns();
        if (!(this._setColumns instanceof MutableList))
        {
            this._setColumns = this._setColumns.toList();
        }
        ((MutableList)this._setColumns).add(val);
    }

    public void _sever_reverse_setColumns(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn val)
    {
        this._setColumns();
        if (!(this._setColumns instanceof MutableList))
        {
            this._setColumns = this._setColumns.toList();
        }
        ((MutableList)this._setColumns).remove(val);
    }

    private Root_meta_pure_store_set_SetRelation_LazyImpl _setColumns(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn val, boolean add)
    {
        this._setColumns();
        if (val == null)
        {
            if (!add)
            {
                this._setColumns = Lists.mutable.empty();
            }
            return this;
        }
        if (add)
        {
            if (!(this._setColumns instanceof MutableList))
            {
                this._setColumns = this._setColumns.toList();
            }
            ((MutableList)this._setColumns).add(val);
        }
        else
        {
            this._setColumns = (val == null ? Lists.mutable.empty() : Lists.mutable.with(val));
        }
        return this;
    }

    private Root_meta_pure_store_set_SetRelation_LazyImpl _setColumns(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn> val, boolean add)
    {
        this._setColumns();
        if (add)
        {
            if (!(this._setColumns instanceof MutableList))
            {
                this._setColumns = this._setColumns.toList();
            }
            ((MutableList)this._setColumns).addAllIterable(val);
        }
        else
        {
            this._setColumns = val;
        }
        return this;
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumns(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn> val)
    {
        return this._setColumns(val, false);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsAdd(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn val)
    {
        return this._setColumns(Lists.immutable.with(val), true);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn> val)
    {
        return this._setColumns(val, true);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsRemove()
    {
        this._setColumns();
        this._setColumns = Lists.mutable.empty();
        return this;
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsRemove(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn val)
    {
        this._setColumns();
        if (!(this._setColumns instanceof MutableList))
        {
            this._setColumns = this._setColumns.toList();
        }
        ((MutableList)this._setColumns).remove(val);
        return this;
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsAddCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsAddAllCoreInstance(RichIterable<? extends CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsCoreInstance(RichIterable<? extends org.finos.legend.pure.m4.coreinstance.CoreInstance> val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl _setColumnsRemoveCoreInstance(CoreInstance val)
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<org.finos.legend.pure.m4.coreinstance.CoreInstance> _setColumnsCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn> _setColumns()
    {
        if (!this._setColumns_initialized.get())
        {
            synchronized (this._setColumns_initialized)
            {
                if (!this._setColumns_initialized.get())
                {
                    this._setColumns = loadValuesFromMetadata("setColumns");
                    this._setColumns_initialized.set(true);
                }
            }
        }
        return this._setColumns;
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl copy()
    {
        return new Root_meta_pure_store_set_SetRelation_LazyImpl(this);
    }

    public Root_meta_pure_store_set_SetRelation_LazyImpl(org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation src)
    {
        super((Root_meta_pure_store_set_SetRelation_LazyImpl)src);
        synchronized (((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._setColumns_initialized)
        {
            this._setColumns = FastList.newList(((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._setColumns);
            this._setColumns_initialized.set(((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._setColumns_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._elementOverride_initialized)
        {
            this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._elementOverride;
            this._elementOverride_initialized.set(((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._elementOverride_initialized.get());
        }
        synchronized (((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._classifierGenericType_initialized)
        {
            this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._classifierGenericType;
            this._classifierGenericType_initialized.set(((Root_meta_pure_store_set_SetRelation_LazyImpl)src)._classifierGenericType_initialized.get());
        }
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
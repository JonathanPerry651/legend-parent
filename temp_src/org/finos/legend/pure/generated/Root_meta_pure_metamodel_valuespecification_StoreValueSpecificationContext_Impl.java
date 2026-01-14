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
public class Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl extends Root_meta_pure_metamodel_valuespecification_ValueSpecificationContext_Impl implements org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.StoreValueSpecificationContext
{
    public static final String tempTypeName = "StoreValueSpecificationContext";
    private static final String tempFullTypeId = "Root::meta::pure::metamodel::valuespecification::StoreValueSpecificationContext";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKey("Root::meta::pure::metamodel::valuespecification::ValueSpecificationContext", "offset")
           .withKey(tempFullTypeId, "store")
           .build();
    private CoreInstance classifier;

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl(String id)
    {
        super(id);
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
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
            return new Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl(name, sourceInformation, classifier);
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
            case "offset":
            {
                return ValCoreInstance.toCoreInstance(_offset());
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

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _offset(long val)
    {
        this._offset = val;
        return this;
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _offset(RichIterable<? extends java.lang.Long> val)
    {
        return _offset(val.getFirst());
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _offsetRemove()
    {
        this._offset = 0L;
        return this;
    }


    public org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store _store;
    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _store(org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store val)
    {
        this._store = val;
        return this;
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _store(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store> val)
    {
        return _store(val.getFirst());
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _storeRemove()
    {
        this._store = null;
        return this;
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl _storeCoreInstance(org.finos.legend.pure.m4.coreinstance.CoreInstance val)
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
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._store : (org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store)((GetterOverrideExecutor)this._elementOverride()).executeToOne(this, "Root::meta::pure::metamodel::valuespecification::StoreValueSpecificationContext", "store");
    }

    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl copy()
    {
        return new Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl(this);
    }
    public Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.StoreValueSpecificationContext src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl)src).classifier;
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl)src)._elementOverride;
        this._store = (org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store)((Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl)src)._store;
        this._offset = (long)((Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl)src)._offset;
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_metamodel_valuespecification_StoreValueSpecificationContext_Impl)src)._classifierGenericType;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
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
public class Root_meta_core_runtime_ConnectionStore_Impl extends Root_meta_pure_metamodel_type_Any_Impl implements org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore
{
    public static final String tempTypeName = "ConnectionStore";
    private static final String tempFullTypeId = "Root::meta::core::runtime::ConnectionStore";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "connection", "element")
           .build();
    private CoreInstance classifier;

    public Root_meta_core_runtime_ConnectionStore_Impl(String id)
    {
        super(id);
    }

    public Root_meta_core_runtime_ConnectionStore_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
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
            return new Root_meta_core_runtime_ConnectionStore_Impl(name, sourceInformation, classifier);
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
            case "connection":
            {
                return ValCoreInstance.toCoreInstance(_connection());
            }
            case "element":
            {
                return ValCoreInstance.toCoreInstance(_element());
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

    public Root_meta_core_runtime_ConnectionStore_Impl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection _connection;
    public Root_meta_core_runtime_ConnectionStore_Impl _connection(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection val)
    {
        this._connection = val;
        return this;
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _connection(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection> val)
    {
        return _connection(val.getFirst());
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _connectionRemove()
    {
        this._connection = null;
        return this;
    }


    public void _reverse_connection(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection val)
    {
        this._connection = val;
    }

    public void _sever_reverse_connection(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection val)
    {
        this._connection = null;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection _connection()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._connection : (org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection)((GetterOverrideExecutor)this._elementOverride()).executeToOne(this, "Root::meta::core::runtime::ConnectionStore", "connection");
    }

    public java.lang.Object _element;
    public Root_meta_core_runtime_ConnectionStore_Impl _element(java.lang.Object val)
    {
        this._element = val;
        return this;
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _element(RichIterable<? extends java.lang.Object> val)
    {
        return _element(val.getFirst());
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _elementRemove()
    {
        this._element = null;
        return this;
    }


    public void _reverse_element(java.lang.Object val)
    {
        this._element = val;
    }

    public void _sever_reverse_element(java.lang.Object val)
    {
        this._element = null;
    }

    public org.finos.legend.pure.m4.coreinstance.CoreInstance _elementCoreInstance()
    {
        throw new UnsupportedOperationException("Not supported in Compiled Mode at this time");
    }

    public java.lang.Object _element()
    {
        return this._elementOverride() == null || !GetterOverrideExecutor.class.isInstance(this._elementOverride()) ? this._element : (java.lang.Object)((GetterOverrideExecutor)this._elementOverride()).executeToOne(this, "Root::meta::core::runtime::ConnectionStore", "element");
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_core_runtime_ConnectionStore_Impl _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public Root_meta_core_runtime_ConnectionStore_Impl copy()
    {
        return new Root_meta_core_runtime_ConnectionStore_Impl(this);
    }
    public Root_meta_core_runtime_ConnectionStore_Impl(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_core_runtime_ConnectionStore_Impl)src).classifier;
        this._element = (java.lang.Object)((Root_meta_core_runtime_ConnectionStore_Impl)src)._element;
        this._connection = (org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection)((Root_meta_core_runtime_ConnectionStore_Impl)src)._connection;
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_core_runtime_ConnectionStore_Impl)src)._elementOverride;
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_core_runtime_ConnectionStore_Impl)src)._classifierGenericType;
    }
    @Override
    public String getFullSystemPath()
    {
         return tempFullTypeId;
    }
}
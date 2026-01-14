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
public class Root_meta_pure_runtime_ExecutionContext_Impl extends Root_meta_pure_metamodel_type_Any_Impl implements org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext
{
    public static final String tempTypeName = "ExecutionContext";
    private static final String tempFullTypeId = "Root::meta::pure::runtime::ExecutionContext";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(tempFullTypeId, "enableConstraints", "queryTimeOutInSeconds")
           .build();
    private CoreInstance classifier;

    public Root_meta_pure_runtime_ExecutionContext_Impl(String id)
    {
        super(id);
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl(String name, SourceInformation sourceInformation, CoreInstance classifier)
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
            return new Root_meta_pure_runtime_ExecutionContext_Impl(name, sourceInformation, classifier);
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

    public Root_meta_pure_runtime_ExecutionContext_Impl _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType val)
    {
        this._classifierGenericType = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _classifierGenericType(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> val)
    {
        return _classifierGenericType(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _classifierGenericTypeRemove()
    {
        this._classifierGenericType = null;
        return this;
    }


    public Root_meta_pure_runtime_ExecutionContext_Impl _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride val)
    {
        this._elementOverride = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _elementOverride(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> val)
    {
        return _elementOverride(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _elementOverrideRemove()
    {
        this._elementOverride = null;
        return this;
    }


    public java.lang.Boolean _enableConstraints;
    public Root_meta_pure_runtime_ExecutionContext_Impl _enableConstraints(java.lang.Boolean val)
    {
        this._enableConstraints = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _enableConstraints(RichIterable<? extends java.lang.Boolean> val)
    {
        return _enableConstraints(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _enableConstraintsRemove()
    {
        this._enableConstraints = false;
        return this;
    }


    public java.lang.Boolean _enableConstraints()
    {
        return this._enableConstraints;
    }

    public java.lang.Long _queryTimeOutInSeconds;
    public Root_meta_pure_runtime_ExecutionContext_Impl _queryTimeOutInSeconds(java.lang.Long val)
    {
        this._queryTimeOutInSeconds = val;
        return this;
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _queryTimeOutInSeconds(RichIterable<? extends java.lang.Long> val)
    {
        return _queryTimeOutInSeconds(val.getFirst());
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl _queryTimeOutInSecondsRemove()
    {
        this._queryTimeOutInSeconds = 0L;
        return this;
    }


    public java.lang.Long _queryTimeOutInSeconds()
    {
        return this._queryTimeOutInSeconds;
    }

    public Root_meta_pure_runtime_ExecutionContext_Impl copy()
    {
        return new Root_meta_pure_runtime_ExecutionContext_Impl(this);
    }
    public Root_meta_pure_runtime_ExecutionContext_Impl(org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext src)
    {
        this("Anonymous_NoCounter");
        this.classifier = ((Root_meta_pure_runtime_ExecutionContext_Impl)src).classifier;
        this._enableConstraints = (java.lang.Boolean)((Root_meta_pure_runtime_ExecutionContext_Impl)src)._enableConstraints;
        this._elementOverride = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride)((Root_meta_pure_runtime_ExecutionContext_Impl)src)._elementOverride;
        this._queryTimeOutInSeconds = (java.lang.Long)((Root_meta_pure_runtime_ExecutionContext_Impl)src)._queryTimeOutInSeconds;
        this._classifierGenericType = (org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType)((Root_meta_pure_runtime_ExecutionContext_Impl)src)._classifierGenericType;
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
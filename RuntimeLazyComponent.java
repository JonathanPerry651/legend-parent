package org.finos.legend.pure.m3.coreinstance.meta.core.runtime;

import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.map.MutableMap;
import org.finos.legend.pure.m3.coreinstance.KeyIndex;
import org.finos.legend.pure.m3.coreinstance.helper.*;
import org.finos.legend.pure.m3.coreinstance.lazy.ManyValues;
import org.finos.legend.pure.m3.coreinstance.lazy.OneValue;
import org.finos.legend.pure.m3.coreinstance.lazy.PrimitiveValueResolver;
import org.finos.legend.pure.m3.coreinstance.lazy.PropertyValue;
import org.finos.legend.pure.m3.coreinstance.lazy.generator.AbstractM3GeneratedLazyComponentInstance;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m3.serialization.compiler.element.ElementBuilder;
import org.finos.legend.pure.m3.serialization.compiler.element.InstanceData;
import org.finos.legend.pure.m3.serialization.compiler.element.PropertyValues;
import org.finos.legend.pure.m3.serialization.compiler.metadata.BackReference;
import org.finos.legend.pure.m3.serialization.compiler.reference.ReferenceIdResolver;
import org.finos.legend.pure.m4.ModelRepository;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.primitive.*;
import org.finos.legend.pure.m4.transaction.ModelRepositoryTransaction;

import java.util.function.IntFunction;

public class RuntimeLazyComponent extends AbstractM3GeneratedLazyComponentInstance implements org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime
{
    private static final String FULL_SYSTEM_PATH = "Root::meta::core::runtime::Runtime";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(FULL_SYSTEM_PATH, "connectionStores", "preprocessFunction")
           .build();

    private volatile _State state;

    public RuntimeLazyComponent(ModelRepository repository, InstanceData instanceData, ListIterable<? extends BackReference> backReferences, ReferenceIdResolver referenceIdResolver, IntFunction<? extends CoreInstance> internalIdResolver, PrimitiveValueResolver primitiveValueResolver, ElementBuilder elementBuilder)
    {
        super(repository, instanceData, referenceIdResolver);
        this.state = new _State(instanceData, backReferences, referenceIdResolver, internalIdResolver, primitiveValueResolver, elementBuilder);
    }

    public RuntimeLazyComponent(RuntimeLazyComponent source)
    {
        super(source);
        this.state = new _State(source.state);
    }

    @Override
    public RichIterable<String> getKeys()
    {
        return KEY_INDEX.getKeys();
    }

    @Override
    public ListIterable<String> getRealKeyByName(String keyName)
    {
        return KEY_INDEX.getRealKeyByName(keyName);
    }

    @Override
    public String getFullSystemPath()
    {
        return FULL_SYSTEM_PATH;
    }

    @Override
    public void commit(ModelRepositoryTransaction transaction)
    {
        this.state = (_State) transaction.getState(this);
    }

    @Override
    protected PropertyValue<?> getPropertyValue(String propertyName, boolean forWrite)
    {
        switch (propertyName)
        {
            case "classifierGenericType":
            {
                return getState(forWrite)._classifierGenericType;
            }
            case "connectionStores":
            {
                return getState(forWrite)._connectionStores;
            }
            case "elementOverride":
            {
                return getState(forWrite)._elementOverride;
            }
            case "preprocessFunction":
            {
                return getState(forWrite)._preprocessFunction;
            }
            default:
            {
                return null;
            }
        }
    }

    @Override
    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime copy()
    {
        return new RuntimeLazyComponent(this);
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType _classifierGenericType()
    {
        return getState(false)._classifierGenericType.getValue();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType value)
    {
        getState(true)._classifierGenericType.setValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _classifierGenericTypeRemove()
    {
        getState(true)._classifierGenericType.removeAllValues();
        return this;
    }

    public void _reverse_classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType value)
    {
        getState(true)._classifierGenericType.addValue(value);
    }

    public void _sever_reverse_classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType value)
    {
        getState(true)._classifierGenericType.removeValue(value);
    }

    public RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> _connectionStores()
    {
        return getState(false)._connectionStores.getValues();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _connectionStores(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> values)
    {
        getState(true)._connectionStores.setValues(values);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _connectionStoresAdd(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore value)
    {
        getState(true)._connectionStores.addValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _connectionStoresAddAll(RichIterable<? extends org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> values)
    {
        getState(true)._connectionStores.addValues(values);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _connectionStoresRemove(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore value)
    {
        getState(true)._connectionStores.removeValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _connectionStoresRemove()
    {
        getState(true)._connectionStores.removeAllValues();
        return this;
    }

    public void _reverse_connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore value)
    {
        getState(true)._connectionStores.addValue(value);
    }

    public void _sever_reverse_connectionStores(org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore value)
    {
        getState(true)._connectionStores.removeValue(value);
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride _elementOverride()
    {
        return getState(false)._elementOverride.getValue();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride value)
    {
        getState(true)._elementOverride.setValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _elementOverrideRemove()
    {
        getState(true)._elementOverride.removeAllValues();
        return this;
    }

    public void _reverse_elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride value)
    {
        getState(true)._elementOverride.addValue(value);
    }

    public void _sever_reverse_elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride value)
    {
        getState(true)._elementOverride.removeValue(value);
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> _preprocessFunction()
    {
        return org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.FunctionCoreInstanceWrapper.toFunction(AnyStubHelper.fromStub(_preprocessFunctionCoreInstance()));
    }

    public CoreInstance _preprocessFunctionCoreInstance()
    {
        return getState(false)._preprocessFunction.getValue();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> value)
    {
        return _preprocessFunctionCoreInstance(value);
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _preprocessFunctionCoreInstance(CoreInstance value)
    {
        getState(true)._preprocessFunction.setValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime _preprocessFunctionRemove()
    {
        getState(true)._preprocessFunction.removeAllValues();
        return this;
    }

    public void _reverse_preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> value)
    {
        getState(true)._preprocessFunction.addValue(value);
    }

    public void _sever_reverse_preprocessFunction(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function<? extends java.lang.Object> value)
    {
        getState(true)._preprocessFunction.removeValue(value);
    }

    public org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection connectionByElement(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Any _a, ExecutionSupport es)
    {
        throw new UnsupportedOperationException("This method is not supported on M3 classes");
    }

    private _State getState(boolean forWrite)
    {
        ModelRepositoryTransaction transaction = this.repository.getTransaction();
        if ((transaction != null) && transaction.isOpen())
        {
            if (forWrite && !transaction.isRegistered(this))
            {
                transaction.registerModified(this, new _State(this.state));
            }
            _State transactionState = (_State) transaction.getState(this);
            if (transactionState != null)
            {
                return transactionState;
            }
        }
        return this.state;
    }

    private class _State extends _AbstractState
    {
        private final OneValue<org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType> _classifierGenericType;
        private final ManyValues<org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore> _connectionStores;
        private final OneValue<org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> _elementOverride;
        private final OneValue<CoreInstance> _preprocessFunction;

        private _State(InstanceData instanceData, ListIterable<? extends BackReference> backReferences, ReferenceIdResolver referenceIdResolver, IntFunction<? extends CoreInstance> internalIdResolver, PrimitiveValueResolver primitiveValueResolver, ElementBuilder elementBuilder)
        {
            super(instanceData);
            MutableMap<String, PropertyValues> propertyValuesByName = indexPropertyValues(instanceData);
            this._classifierGenericType = newToOnePropertyValue(propertyValuesByName.get("classifierGenericType"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true, org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericTypeCoreInstanceWrapper.FROM_CORE_INSTANCE_FN);
            this._connectionStores = newToManyPropertyValue(propertyValuesByName.get("connectionStores"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStoreCoreInstanceWrapper.FROM_CORE_INSTANCE_FN);
            this._elementOverride = newToOnePropertyValue(propertyValuesByName.get("elementOverride"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true, org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverrideCoreInstanceWrapper.FROM_CORE_INSTANCE_FN);
            this._preprocessFunction = newToOnePropertyValue(propertyValuesByName.get("preprocessFunction"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true);
        }

        private _State(_State source)
        {
            super(source);
            this._classifierGenericType = source._classifierGenericType.copy();
            this._connectionStores = source._connectionStores.copy();
            this._elementOverride = source._elementOverride.copy();
            this._preprocessFunction = source._preprocessFunction.copy();
        }
    }
}

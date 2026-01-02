package org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute;

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

public class RowLazyComponent extends AbstractM3GeneratedLazyComponentInstance implements org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row
{
    private static final String FULL_SYSTEM_PATH = "Root::meta::relational::metamodel::execute::Row";
    private static final KeyIndex KEY_INDEX = KeyIndex.builder(4)
           .withKeys("Root::meta::pure::metamodel::type::Any", "classifierGenericType", "elementOverride")
           .withKeys(FULL_SYSTEM_PATH, "parent", "values")
           .build();

    private volatile _State state;

    public RowLazyComponent(ModelRepository repository, InstanceData instanceData, ListIterable<? extends BackReference> backReferences, ReferenceIdResolver referenceIdResolver, IntFunction<? extends CoreInstance> internalIdResolver, PrimitiveValueResolver primitiveValueResolver, ElementBuilder elementBuilder)
    {
        super(repository, instanceData, referenceIdResolver);
        this.state = new _State(instanceData, backReferences, referenceIdResolver, internalIdResolver, primitiveValueResolver, elementBuilder);
    }

    public RowLazyComponent(RowLazyComponent source)
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
            case "elementOverride":
            {
                return getState(forWrite)._elementOverride;
            }
            case "parent":
            {
                return getState(forWrite)._parent;
            }
            case "values":
            {
                return getState(forWrite)._values;
            }
            default:
            {
                return null;
            }
        }
    }

    @Override
    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row copy()
    {
        return new RowLazyComponent(this);
    }

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType _classifierGenericType()
    {
        return getState(false)._classifierGenericType.getValue();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _classifierGenericType(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType value)
    {
        getState(true)._classifierGenericType.setValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _classifierGenericTypeRemove()
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

    public org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride _elementOverride()
    {
        return getState(false)._elementOverride.getValue();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _elementOverride(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride value)
    {
        getState(true)._elementOverride.setValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _elementOverrideRemove()
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

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSet _parent()
    {
        return getState(false)._parent.getValue();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _parent(org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSet value)
    {
        getState(true)._parent.setValue(value);
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _parentRemove()
    {
        getState(true)._parent.removeAllValues();
        return this;
    }

    public void _reverse_parent(org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSet value)
    {
        getState(true)._parent.addValue(value);
    }

    public void _sever_reverse_parent(org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSet value)
    {
        getState(true)._parent.removeValue(value);
    }

    public RichIterable<? extends Object> _values()
    {
        return AnyHelper.resolveAndUnwrap(_valuesCoreInstance());
    }

    public RichIterable<? extends CoreInstance> _valuesCoreInstance()
    {
        return getState(false)._values.getValues();
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _values(RichIterable<?> values)
    {
        getState(true)._values.setValues(AnyHelper.wrapPrimitives(values, getRepository()));
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _valuesAdd(Object value)
    {
        getState(true)._values.addValue(AnyHelper.wrapPrimitive(value, getRepository()));
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _valuesAddAll(RichIterable<?> values)
    {
        getState(true)._values.addValues(AnyHelper.wrapPrimitives(values, getRepository()));
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _valuesRemove(Object value)
    {
        getState(true)._values.removeValue(AnyHelper.wrapPrimitive(value, getRepository()));
        return this;
    }

    public org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.Row _valuesRemove()
    {
        getState(true)._values.removeAllValues();
        return this;
    }

    public java.lang.Object value(org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Any _name, ExecutionSupport es)
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
        private final OneValue<org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride> _elementOverride;
        private final OneValue<org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSet> _parent;
        private final ManyValues<CoreInstance> _values;

        private _State(InstanceData instanceData, ListIterable<? extends BackReference> backReferences, ReferenceIdResolver referenceIdResolver, IntFunction<? extends CoreInstance> internalIdResolver, PrimitiveValueResolver primitiveValueResolver, ElementBuilder elementBuilder)
        {
            super(instanceData);
            MutableMap<String, PropertyValues> propertyValuesByName = indexPropertyValues(instanceData);
            this._classifierGenericType = newToOnePropertyValue(propertyValuesByName.get("classifierGenericType"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true, org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericTypeCoreInstanceWrapper.FROM_CORE_INSTANCE_FN);
            this._elementOverride = newToOnePropertyValue(propertyValuesByName.get("elementOverride"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true, org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverrideCoreInstanceWrapper.FROM_CORE_INSTANCE_FN);
            this._parent = newToOnePropertyValue(propertyValuesByName.get("parent"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true, org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSetCoreInstanceWrapper.FROM_CORE_INSTANCE_FN);
            this._values = newToManyPropertyValue(propertyValuesByName.get("values"), referenceIdResolver, internalIdResolver, primitiveValueResolver, true);
        }

        private _State(_State source)
        {
            super(source);
            this._classifierGenericType = source._classifierGenericType.copy();
            this._elementOverride = source._elementOverride.copy();
            this._parent = source._parent.copy();
            this._values = source._values.copy();
        }
    }
}

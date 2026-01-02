package org.finos.legend.pure.m3.coreinstance.meta.core.runtime;

import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.RuntimeAccessor;
import org.eclipse.collections.api.RichIterable;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function;
import org.finos.legend.pure.m3.coreinstance.PackageInstance;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStoreInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverride;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.FunctionInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Any;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.EnumStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.PropertyStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.AnyAccessor;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericType;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverrideInstance;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.FunctionCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStoreCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericTypeCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.ImportStubCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.generics.GenericTypeInstance;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.tools.GrammarInfoStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.ImportStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.ElementOverrideCoreInstanceWrapper;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;

public interface Runtime extends CoreInstance, RuntimeAccessor, Any
{
    Runtime _preprocessFunction(Function<? extends Object> value);
    Runtime _preprocessFunctionRemove();
    Runtime _preprocessFunctionCoreInstance(CoreInstance value);
    Runtime _classifierGenericType(GenericType value);
    Runtime _classifierGenericTypeRemove();
    Runtime _elementOverride(ElementOverride value);
    Runtime _elementOverrideRemove();
    Runtime _connectionStores(RichIterable<? extends ConnectionStore> values);
    Runtime _connectionStoresRemove();
    Runtime _connectionStoresAdd(ConnectionStore value);
    Runtime _connectionStoresAddAll(RichIterable<? extends ConnectionStore> values);
    Runtime _connectionStoresRemove(ConnectionStore value);
    Runtime copy();
}

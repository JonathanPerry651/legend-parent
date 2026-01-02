package org.finos.legend.pure.m3.coreinstance.meta.core.runtime;


import org.eclipse.collections.api.RichIterable;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Any;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStoreCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.ImportStubCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.PackageInstance;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStoreInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.FunctionInstance;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.EnumStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.PropertyStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.tools.GrammarInfoStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.AnyAccessor;
import org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.ImportStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.FunctionCoreInstanceWrapper;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.primitive.*;

public interface RuntimeAccessor extends CoreInstance
{
    RichIterable<? extends ConnectionStore> _connectionStores();
    Function<? extends Object> _preprocessFunction();
    CoreInstance _preprocessFunctionCoreInstance();
    Connection connectionByElement(Object _a, final ExecutionSupport es);
}

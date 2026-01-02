package org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute;


import org.eclipse.collections.api.RichIterable;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Any;
import org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSetInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.EnumStub;
import org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSetCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.PropertyStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.tools.GrammarInfoStub;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.AnyAccessor;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.ImportStubCoreInstanceWrapper;
import org.finos.legend.pure.m3.coreinstance.PackageInstance;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel._import.ImportStub;
import org.finos.legend.pure.m3.coreinstance.meta.relational.metamodel.execute.ResultSet;
import org.finos.legend.pure.m3.execution.ExecutionSupport;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.primitive.*;

public interface RowAccessor extends CoreInstance
{
    ResultSet _parent();
    RichIterable<? extends Object> _values();
    RichIterable<? extends CoreInstance> _valuesCoreInstance();
    Object value(Object _name, final ExecutionSupport es);
}

package org.finos.legend.pure.generated;

import org.finos.legend.pure.m3.coreinstance.CoreInstanceFactoryRegistry;

public class platform_dsl_storeJavaModelFactoryRegistry implements org.finos.legend.pure.runtime.java.compiled.factory.JavaModelFactoryRegistry
{
    public static final CoreInstanceFactoryRegistry REGISTRY = CoreInstanceFactoryRegistry.builder(11)
            .withType("meta::core::runtime::Connection", org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Connection.class)
            .withType("meta::core::runtime::ConnectionStore", org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStoreInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.ConnectionStore.class)
            .withType("meta::core::runtime::Runtime", org.finos.legend.pure.generated.Root_meta_core_runtime_Runtime_CompImpl.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.core.runtime.Runtime.class)
            .withType("meta::pure::metamodel::valuespecification::StoreValueSpecificationContext", org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.StoreValueSpecificationContextInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.valuespecification.StoreValueSpecificationContext.class)
            .withType("meta::pure::runtime::ExecutionContext", org.finos.legend.pure.generated.Root_meta_pure_runtime_ExecutionContext_CompImpl.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.runtime.ExecutionContext.class)
            .withType("meta::pure::store::RelationStoreAccessor", org.finos.legend.pure.m3.coreinstance.meta.pure.store.RelationStoreAccessorInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.store.RelationStoreAccessor.class)
            .withType("meta::pure::store::Store", org.finos.legend.pure.m3.coreinstance.meta.pure.store.StoreInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.store.Store.class)
            .withType("meta::pure::store::set::Namespace", org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.NamespaceInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.Namespace.class)
            .withType("meta::pure::store::set::SetBasedStore", org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetBasedStoreInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetBasedStore.class)
            .withType("meta::pure::store::set::SetColumn", org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumnInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetColumn.class)
            .withType("meta::pure::store::set::SetRelation", org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelationInstance.FACTORY, org.finos.legend.pure.m3.coreinstance.meta.pure.store.set.SetRelation.class)
            .build();

    @Override
    public CoreInstanceFactoryRegistry getRegistry()
    {
        return REGISTRY;
    }
}

package dev.cammiescorner.mobb.fabric.entrypoints;

import dev.cammiescorner.mobb.common.entities.PhantomEntity;
import dev.cammiescorner.mobb.common.registries.MobBEntities;
import dev.upcraft.sparkweave.api.annotation.CalledByReflection;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

@CalledByReflection
public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(MobBEntities.PHANTOM.get(), PhantomEntity.createPhantomAttributes());
	}
}

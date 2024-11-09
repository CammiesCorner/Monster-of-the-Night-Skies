package dev.cammiescorner.mobb.neoforge;

import dev.cammiescorner.mobb.MobB;
import dev.cammiescorner.mobb.common.entities.PhantomEntity;
import dev.cammiescorner.mobb.common.registries.MobBEntities;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = MobB.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CommonEvents {
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MobBEntities.PHANTOM.get(), PhantomEntity.createPhantomAttributes().build());
	}
}

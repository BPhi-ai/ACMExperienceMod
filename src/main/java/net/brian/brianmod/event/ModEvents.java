package net.brian.brianmod.event;

import net.brian.brianmod.BrianMod;
import net.brian.brianmod.entity.*;
import net.brian.brianmod.entity.custom.ChomperEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = BrianMod.MOD_ID)
public class ModEvents {


    @Mod.EventBusSubscriber(modid = BrianMod.MOD_ID)
    public static class ForgeEvents {

        @Mod.EventBusSubscriber(modid = BrianMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModEventBusEvents {
            @SubscribeEvent
            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
                event.put(ModEntityTypes.CHOMPER.get(), ChomperEntity.setAttributes());
            }
        }
    }
}

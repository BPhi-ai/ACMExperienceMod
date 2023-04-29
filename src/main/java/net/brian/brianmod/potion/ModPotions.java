package net.brian.brianmod.potion;

import net.brian.brianmod.BrianMod;
import net.brian.brianmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, BrianMod.MOD_ID);

    public static final RegistryObject<Potion> FREEZE_POTION = POTIONS.register("freeze_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.FREEZE.get(), 2000, 10)));

    public static final RegistryObject<Potion> DRUNK_POTION = POTIONS.register("drunk_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 3600, 120),
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 120),
                    new MobEffectInstance(MobEffects.WEAKNESS, 3600, 120),
                    new MobEffectInstance(MobEffects.DARKNESS, 3600, 120)));

    public static final RegistryObject<Potion> ENERGY_POTION = POTIONS.register("energy_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20000, 300),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20000, 300),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20000, 300)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}

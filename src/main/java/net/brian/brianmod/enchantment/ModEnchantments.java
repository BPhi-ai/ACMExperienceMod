package net.brian.brianmod.enchantment;

import net.brian.brianmod.BrianMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BrianMod.MOD_ID);

    public static RegistryObject<Enchantment> LIGHTNING_STRIKER =
            ENCHANTMENTS.register("lightning_striker",
                    () -> new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> TNT_SPAMMER =
            ENCHANTMENTS.register("tnt_spam",
                    () -> new TNTSpamEnchantment(Enchantment.Rarity.RARE,
                            EnchantmentCategory.BOW, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> SATURATION =
            ENCHANTMENTS.register("noisy_villager",
                    () -> new NoisyVillagerEnchantment(Enchantment.Rarity.VERY_RARE,
                            EnchantmentCategory.BOW, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> SECRET_SERVICE =
            ENCHANTMENTS.register("secret_service",
                    () -> new SecretServiceEnchantment(Enchantment.Rarity.VERY_RARE,
                            EnchantmentCategory.BOW, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> BEE_SWARM =
            ENCHANTMENTS.register("bee_swarm",
                    () -> new BeeSwarmEnchantment(Enchantment.Rarity.VERY_RARE,
                            EnchantmentCategory.BOW, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> XP_EXPLOSION =
            ENCHANTMENTS.register("xp_explosion",
                    () -> new XPExplosionEnchantment(Enchantment.Rarity.VERY_RARE,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}

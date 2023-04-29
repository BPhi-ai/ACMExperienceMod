package net.brian.brianmod.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class NoisyVillagerEnchantment extends Enchantment {
    public NoisyVillagerEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level.isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level);
            BlockPos position = pTarget.blockPosition();

            if(pLevel == 1) {
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
                EntityType.VILLAGER.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
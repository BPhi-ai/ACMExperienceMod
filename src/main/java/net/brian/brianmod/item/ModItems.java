package net.brian.brianmod.item;

import net.brian.brianmod.BrianMod;
import net.brian.brianmod.entity.ModEntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrianMod.MOD_ID);

    public static final RegistryObject<Item> ACMIUM = ITEMS.register("acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ACMIUM = ITEMS.register("raw_acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    //tools below
    public static final RegistryObject<Item> EXAMPLE_SWORD = ITEMS.register("example_sword",
            () -> new SwordItem(Tiers.DIAMOND, 7, 4f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 4, 5f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_AXE = ITEMS.register("example_axe",
            () -> new AxeItem(Tiers.DIAMOND, 8, 3f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_HOE = ITEMS.register("example_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 3, 5f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));

    //armor below
    public static final RegistryObject<Item> EXAMPLE_HELMET = ITEMS.register("example_helmet",
            () -> new ModArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_CHESTPIECE = ITEMS.register("example_chestpiece",
            () -> new ModArmorItem(ArmorMaterials.NETHERITE,EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_LEGGINGS = ITEMS.register("example_leggings",
            () -> new ModArmorItem(ArmorMaterials.NETHERITE,EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_BOOTS = ITEMS.register("example_boots",
            () -> new ModArmorItem(ArmorMaterials.NETHERITE,EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> BOBA = ITEMS.register("boba",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.BOBA)));
    public static final RegistryObject<Item> KBBQ = ITEMS.register("kbbq",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.KBBQ)));
    public static final RegistryObject<Item> RAMEN = ITEMS.register("ramen",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.RAMEN)));
    public static final RegistryObject<Item> BANHBOT = ITEMS.register("banhbot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.BANHBOT)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.LETTUCE)));
    public static final RegistryObject<Item> TAPIOCA = ITEMS.register("tapioca",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.TAPIOCA)));
    public static final RegistryObject<Item> BACON = ITEMS.register("bacon",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.BACON)));
    public static final RegistryObject<Item> COOKED_EGG = ITEMS.register("cooked_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.COOKED_EGG)));
    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.SANDWICH)));
    public static final RegistryObject<Item> SALAD = ITEMS.register("salad",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).food(ModFoods.SALAD)));


    public static final RegistryObject<Item> CHOMPER_SPAWN_EGG = ITEMS.register("chomper_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CHOMPER, 0x2c68ca, 0xcde0ff,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

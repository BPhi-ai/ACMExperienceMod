package net.brian.brianmod.block;

import net.brian.brianmod.BrianMod;
import net.brian.brianmod.item.ModCreativeModTab;
import net.brian.brianmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BrianMod.MOD_ID);

    public static final RegistryObject<Block> ACM_BLOCK = registerBlock("acm_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> ACM_LOGO = registerBlock("acm_logo",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> BRIAN_BLOCK = registerBlock("brian_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> MFZ_LOGO = registerBlock("mfz_logo",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> PI_SYMBOL = registerBlock("pi_symbol",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> COOL_BEANS = registerBlock("cool_beans",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> SAD_TACO = registerBlock("sad_taco",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> ACM_ORE = registerBlock("acm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ACM_ORE = registerBlock("deepslate_acm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModTab.TUTORIAL_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

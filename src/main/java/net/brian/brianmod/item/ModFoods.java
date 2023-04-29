package net.brian.brianmod.item;

import net.brian.brianmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.FoodOnAStickItem;

public class ModFoods {
    public static final FoodProperties BOBA = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.2F).build();
    public static final FoodProperties KBBQ = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties RAMEN = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.2F).build();
    public static final FoodProperties BANHBOT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();
    public static final FoodProperties LETTUCE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties TOMATO = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties TAPIOCA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties BACON = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties COOKED_EGG = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties SANDWICH = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.2F).build();
    public static final FoodProperties SALAD = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();
}

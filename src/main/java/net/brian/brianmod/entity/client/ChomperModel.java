package net.brian.brianmod.entity.client;

import net.brian.brianmod.BrianMod;
import net.brian.brianmod.entity.custom.ChomperEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChomperModel extends AnimatedGeoModel<ChomperEntity> {
    @Override
    public ResourceLocation getModelResource(ChomperEntity object) {
        return new ResourceLocation(BrianMod.MOD_ID, "geo/chomper.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChomperEntity object) {
        return new ResourceLocation(BrianMod.MOD_ID, "textures/entity/chomper_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChomperEntity animatable) {
        return new ResourceLocation(BrianMod.MOD_ID, "animations/chomper.animation.json");
    }
}

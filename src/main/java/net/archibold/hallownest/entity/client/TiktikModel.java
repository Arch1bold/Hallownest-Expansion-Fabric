package net.archibold.hallownest.entity.client;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.entity.custom.TiktikEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class TiktikModel extends AnimatedGeoModel<TiktikEntity> {
    public Identifier getModelLocation(TiktikEntity object) {
        return new Identifier(Hallownest.MOD_ID, "geo/raccoon.geo.json");
    }


    public Identifier getTextureLocation(TiktikEntity object) {
        return new Identifier(Hallownest.MOD_ID, "textures/entity/tiktik/tiktik.png");
    }

    public Identifier getAnimationFileLocation(TiktikEntity animatable) {
        return new Identifier(Hallownest.MOD_ID, "animations/tiktik.animation.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(TiktikEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

    @Override
    public Identifier getModelResource(TiktikEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureResource(TiktikEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationResource(TiktikEntity animatable) {
        return null;
    }
}
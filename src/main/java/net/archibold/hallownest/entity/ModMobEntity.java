package net.archibold.hallownest.entity;

import net.archibold.hallownest.entity.attribute.ModEntityAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public abstract class ModMobEntity
        extends MobEntity {

    protected ModMobEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder createModMobAttributes() {
        return LivingEntity.createLivingAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE, 16.0).add(ModEntityAttributes.GENERIC_ATTACK_BOUNCE);
    }
}

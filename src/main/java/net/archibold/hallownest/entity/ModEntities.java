package net.archibold.hallownest.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.entity.custom.TiktikEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<TiktikEntity> TIKTIK = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Hallownest.MOD_ID, "tiktik"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TiktikEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());
}

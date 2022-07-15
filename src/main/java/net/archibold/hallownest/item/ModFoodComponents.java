package net.archibold.hallownest.item;

import net.archibold.hallownest.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ISMA_TEAR = new FoodComponent.Builder().statusEffect(new StatusEffectInstance(ModEffects.ISMA, 99999, 0), 1.0F).alwaysEdible().build();
}

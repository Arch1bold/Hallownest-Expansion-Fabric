package net.archibold.hallownest.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.function.Supplier;

public class IsmaEffect extends StatusEffect {
    public IsmaEffect(StatusEffectCategory Category, int potionColor) {
        super(Category, potionColor);
    }

}
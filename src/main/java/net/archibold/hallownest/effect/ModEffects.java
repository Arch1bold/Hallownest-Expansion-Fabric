package net.archibold.hallownest.effect;

import net.archibold.hallownest.Hallownest;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect ISMA;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Hallownest.MOD_ID, name),
                new IsmaEffect(StatusEffectCategory.NEUTRAL, 8035674));
    }

    public static void registerEffects() {
        ISMA = registerStatusEffect("isma");
    }
}

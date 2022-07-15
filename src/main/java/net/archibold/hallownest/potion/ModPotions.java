package net.archibold.hallownest.potion;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
    public static Potion ISMA_POTION;

    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(Hallownest.MOD_ID, name),
                new Potion(new StatusEffectInstance(ModEffects.ISMA, 200, 0)));

    }

    public static void registerPotions() {
        ISMA_POTION = registerPotion("isma_potion");
    }
}
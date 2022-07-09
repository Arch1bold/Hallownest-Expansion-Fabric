package net.archibold.hallownest.painting;

import net.archibold.hallownest.Hallownest;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingVariant THE_KNIGHT = registerPaintings("the_knight", new PaintingVariant(16, 16));

    private static PaintingVariant registerPaintings(String name, PaintingVariant PaintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Hallownest.MOD_ID, name), PaintingVariant);
    }

    public static void registerPaintings() {
        Hallownest.LOGGER.info("Registering Paintings for " + Hallownest.MOD_ID);
    }
}

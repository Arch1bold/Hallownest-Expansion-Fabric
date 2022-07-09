package net.archibold.hallownest;

import net.archibold.hallownest.block.ModBlocks;
import net.archibold.hallownest.enchantment.ModEnchantments;
import net.archibold.hallownest.entity.attribute.ModEntityAttributes;
import net.archibold.hallownest.item.ModItems;
import net.archibold.hallownest.painting.ModPaintings;
import net.archibold.hallownest.util.ModLootTableModifiers;
import net.archibold.hallownest.world.feature.ModConfiguredFeatures;
import net.archibold.hallownest.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Hallownest implements ModInitializer {
    public static final String MOD_ID = "hallownest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        ModConfiguredFeatures.registerConfiguredFeatures();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEnchantments.registerModEnchantments();
        ModPaintings.registerPaintings();
        ModEntityAttributes.registerModEntityAttributes();
        ModLootTableModifiers.modifyLootTables();
        ModWorldGen.generateModWorldGen();

    }
}

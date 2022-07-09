package net.archibold.hallownest.world.feature;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_SOLID_PALE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SOLID_PALE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SOLID_PALE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SOLID_PALE_ORE =
            ConfiguredFeatures.register("solid_pale_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SOLID_PALE_ORES, 1, 0.7f));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Hallownest.MOD_ID);
    }
}

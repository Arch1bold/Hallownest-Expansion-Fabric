package net.archibold.hallownest.item;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.archibold.hallownest.item.ModItemGroup.HALLOWNEST_TAB;

public class ModItems {

    public static final Item PALE_ORE = registerItem("pale_ore",
            new PaleOreItem(new FabricItemSettings().group(HALLOWNEST_TAB)));
    public static final Item OLD_NAIL = registerItem("old_nail",
            new OldNailItem(ModToolMaterials.PALE_ORE, 0, -3f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item SHARP_NAIL = registerItem("sharp_nail",
            new SharpNailItem(ModToolMaterials.PALE_ORE, 1, -1f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item CHANNEL_NAIL = registerItem("channel_nail",
            new ChannelNailItem(ModToolMaterials.PALE_ORE, 2, 1f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.UNCOMMON)));
    public static final Item COIL_NAIL = registerItem("coil_nail",
            new CoilNailItem(ModToolMaterials.PALE_ORE, 3, 2f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.RARE)));
    public static final Item PURE_NAIL = registerItem("pure_nail",
            new PureNailItem(ModToolMaterials.PALE_ORE, 4, 3f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.EPIC)));
    public static final Item DREAM_NAIL = registerItem("dream_nail",
            new DreamNailItem(new FabricItemSettings().group(HALLOWNEST_TAB)));
    public static final Item MASK_SHARD = registerItem("mask_shard",
            new MaskShardItem(new FabricItemSettings().group(HALLOWNEST_TAB)));
    public static final Item ANCIENT_MASK = registerItem("ancient_mask",
            new ModArmorItem(ModArmorMaterials.MASK_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.RARE)));
    public static final Item MOTHWING_CLOAK = registerItem("mothwing_cloak",
            new CloakItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.UNCOMMON)));
    public static final Item CRYSTAL_HEART = registerItem("crystal_heart",
            new CrystalHeartItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.UNCOMMON)));
    public static final Item CRYSTAL_CLOAK = registerItem("crystal_cloak",
            new CrystalCloakItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.RARE)));
    public static final Item SHADE_CLOAK = registerItem("shade_cloak",
            new ShadeCloakItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.EPIC)));
    public static final Item MONARCH_WINGS = registerItem("monarch_wings",
            new MonarchWingsItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).rarity(Rarity.RARE)));
    public static final Item LUMAFLY_LANTERN = registerItem("lumafly_lantern",
            new LumaflyLanternItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item ISMA_TEAR = registerItem("isma_tear",
            new IsmaTearItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB).food(ModFoodComponents.ISMA_TEAR)));
    public static final Item GEO = registerItem("geo",
            new GeoItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Hallownest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hallownest.LOGGER.debug("Registering Mod Items for " + Hallownest.MOD_ID);
    }

}

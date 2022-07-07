package net.archibold.hallownest.item;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.entity.ModEntities;
import net.archibold.hallownest.item.custom.CloakItem;
import net.archibold.hallownest.item.custom.ModArmorItem;
import net.archibold.hallownest.item.custom.NailItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.tinyremapper.extension.mixin.common.Logger;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.List;

import static net.archibold.hallownest.item.ModItemGroup.*;

public class ModItems {
    @Override
    @Environment(EnvType.CLIENT)
    public void appendHoverText(ItemStack stack, Logger.Level world, List<Component> tooltip, TooltipFlag flags) {
        if (Artifacts.CONFIG.general.showTooltips) {
            appendTooltipDescription(tooltip, this.getDescriptionId() + ".tooltip");
        }
    }

    public static final Item PALE_ORE = registerItem("pale_ore",
            new Item(new FabricItemSettings().group(HALLOWNEST_TAB)));
    public static final Item OLD_NAIL = registerItem("old_nail",
            new NailItem(ModToolMaterials.PALE_ORE, 0, -3f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item SHARP_NAIL = registerItem("sharp_nail",
            new NailItem(ModToolMaterials.PALE_ORE, 1, -1f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item CHANNEL_NAIL = registerItem("channel_nail",
            new NailItem(ModToolMaterials.PALE_ORE, 2, 1f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item COIL_NAIL = registerItem("coil_nail",
            new NailItem(ModToolMaterials.PALE_ORE, 3, 2f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item PURE_NAIL = registerItem("pure_nail",
            new NailItem(ModToolMaterials.PALE_ORE, 4, 3f,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item MASK_SHARD = registerItem("mask_shard",
            new Item(new FabricItemSettings().group(HALLOWNEST_TAB)));
    public static final Item ANCIENT_MASK = registerItem("ancient_mask",
            new ModArmorItem(ModArmorMaterials.MASK_SHARD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item MOTHWING_CLOAK = registerItem("mothwing_cloak",
            new CloakItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item CRYSTAL_HEART = registerItem("crystal_heart",
            new Item(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item CRYSTAL_CLOAK = registerItem("crystal_cloak",
            new CloakItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item SHADE_CLOAK = registerItem("shade_cloak",
            new CloakItem(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item GEO = registerItem("geo",
            new Item(new FabricItemSettings().group(ModItemGroup.HALLOWNEST_TAB)));
    public static final Item TIKTIK_SPAWN_EGG = registerItem("tiktik_spawn_egg",
            new SpawnEggItem(ModEntities.TIKTIK, 0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(HALLOWNEST_TAB).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Hallownest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hallownest.LOGGER.debug("Registering Mod Items for " + Hallownest.MOD_ID);
    }

}

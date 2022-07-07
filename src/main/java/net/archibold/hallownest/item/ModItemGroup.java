package net.archibold.hallownest.item;

import net.archibold.hallownest.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.archibold.hallownest.Hallownest;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HALLOWNEST_TAB = FabricItemGroupBuilder.create(
                    new Identifier(Hallownest.MOD_ID, "hallownest_tab"))
            .icon(() -> new ItemStack(ModItems.OLD_NAIL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.GEO));
                stacks.add(new ItemStack(ModBlocks.SOLID_PALE_ORE));
                stacks.add(new ItemStack(ModItems.PALE_ORE));
                stacks.add(new ItemStack(ModItems.OLD_NAIL));
                stacks.add(new ItemStack(ModItems.SHARP_NAIL));
                stacks.add(new ItemStack(ModItems.CHANNEL_NAIL));
                stacks.add(new ItemStack(ModItems.COIL_NAIL));
                stacks.add(new ItemStack(ModItems.PURE_NAIL));
                stacks.add(new ItemStack(ModItems.MASK_SHARD));
                stacks.add(new ItemStack(ModItems.ANCIENT_MASK));
                stacks.add(new ItemStack(ModItems.MOTHWING_CLOAK));
                stacks.add(new ItemStack(ModItems.CRYSTAL_HEART));
                stacks.add(new ItemStack(ModItems.CRYSTAL_CLOAK));
                stacks.add(new ItemStack(ModItems.SHADE_CLOAK));
                stacks.add(new ItemStack(ModItems.TIKTIK_SPAWN_EGG));
            })
            .build();
}

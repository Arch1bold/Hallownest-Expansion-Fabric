package net.archibold.hallownest.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class MaskShardItem extends Item {
    public MaskShardItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.hallownest.mask_shard.tooltip_1").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("item.hallownest.mask_shard.tooltip_2".formatted(Formatting.LIGHT_PURPLE)));
        } else {
            tooltip.add(Text.translatable("item.hallownest.mask_shard.tooltip_1").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Press Shift for more info!").formatted(Formatting.BOLD));
        }
    }
}
//A shard of an ancient mask, worn to protect oneself from harm.
//Collect more to strengthen your shell and protect yourself from damage.
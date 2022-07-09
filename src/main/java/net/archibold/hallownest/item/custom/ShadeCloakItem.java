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

public class ShadeCloakItem extends Item {
    public ShadeCloakItem(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.hallownest.shade_cloak.tooltip_1").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("item.hallownest.shade_cloak.tooltip_2").formatted(Formatting.BLACK));
        } else {
            tooltip.add(Text.translatable("item.hallownest.shade_cloak.tooltip_1").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("item.hallownest.shift.tooltip").formatted(Formatting.BOLD).formatted(Formatting.BLACK));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
package net.archibold.hallownest.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.util.Formatting;

import javax.annotation.Nullable;
import java.util.List;

public class OldNailItem extends SwordItem implements Vanishable {

    public OldNailItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.hallownest.old_nail.tooltip_1").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("item.hallownest.old_nail.tooltip_2").formatted(Formatting.WHITE));
        } else {
            tooltip.add(Text.translatable("item.hallownest.old_nail.tooltip_1").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Press Shift for more info!").formatted(Formatting.BOLD));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
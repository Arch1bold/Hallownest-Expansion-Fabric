package net.archibold.hallownest.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.util.Formatting;

import javax.annotation.Nullable;
import java.util.List;

public class NailItem extends SwordItem implements Vanishable {

    public NailItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("The traditional weapon of Hallownest.").formatted(Formatting.DARK_GRAY));
            tooltip.add(Text.literal("Get above enemies to bounce off of them.").formatted(Formatting.WHITE));
        } else {
            tooltip.add(Text.literal("Press Shift for more info!").formatted(Formatting.YELLOW));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
// A traditional weapon of Hallownest. Get above enemies to bounce off of them.
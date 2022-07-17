package net.archibold.hallownest.item.custom;

import net.archibold.hallownest.effect.ModEffects;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class IsmaTearItem extends Item {
    private static final int MAX_USE_TIME = 32;

    public IsmaTearItem(Item.Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        if (user instanceof PlayerEntity && !((PlayerEntity) user).getAbilities().creativeMode) {
            stack.decrement(1);
        }
        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(ModEffects.ISMA, 99999, 0));
        }

        return stack.isEmpty() ? new ItemStack(Items.AIR) : stack;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.hallownest.isma_tear.tooltip_1").formatted(Formatting.GREEN));
            tooltip.add(Text.translatable("item.hallownest.isma_tear.tooltip_2").formatted(Formatting.DARK_GREEN));
        } else {
            tooltip.add(Text.translatable("item.hallownest.isma_tear.tooltip_1").formatted(Formatting.GREEN));
            tooltip.add(Text.translatable("item.hallownest.shift.tooltip").formatted(Formatting.BOLD, Formatting.DARK_GREEN));
        }
    }
}
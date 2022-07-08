package net.archibold.hallownest.util;

import net.fabricmc.fabric.api.loot.v2.*;
import net.archibold.hallownest.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.*;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier ANCIENT_CITY_CHEST_ID
            = new Identifier("minecraft", "chests/ancient_city");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if (ANCIENT_CITY_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.312f))
                        .with(ItemEntry.builder(ModItems.OLD_NAIL))
                        .conditionally(RandomChanceLootCondition.builder(0.523f))
                        .with(ItemEntry.builder(ModItems.MASK_SHARD))
                        .conditionally(RandomChanceLootCondition.builder(0.262f))
                        .with(ItemEntry.builder(Items.BOOK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
    }
}

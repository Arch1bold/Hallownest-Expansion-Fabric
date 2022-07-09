package net.archibold.hallownest.modinit;

import net.archibold.hallownest.Hallownest;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HkTags {
    public static void initTags() {
    }

    public static TagKey<Item> NAIL_REPAIR_ITEMS
            = TagKey.of(Registry.ITEM_KEY, new Identifier(Hallownest.MOD_ID, "nail_repair_items"));
}
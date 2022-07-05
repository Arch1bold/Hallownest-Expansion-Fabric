package net.archibold.hallownest;

import net.archibold.hallownest.enchantment.ModEnchantments;
import net.archibold.hallownest.item.ModItems;
import net.archibold.hallownest.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hallownest implements ModInitializer {
	public static final String MOD_ID = "hallownest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEnchantments.registerModEnchantments();

	}
}

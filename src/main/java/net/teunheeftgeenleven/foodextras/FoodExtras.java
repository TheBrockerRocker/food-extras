package net.teunheeftgeenleven.foodextras;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.teunheeftgeenleven.foodextras.block.ModBlocks;
import net.teunheeftgeenleven.foodextras.item.ModItemGroups;
import net.teunheeftgeenleven.foodextras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodExtras implements ModInitializer {
	public static final String MOD_ID = "foodextras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Done with registering");

		CompostingChanceRegistry.INSTANCE.add(ModItems.BROCCOLI,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BROCCOLIE_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CABBAGE,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CABBAGE_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAPSICUM,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAPSICUM_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOUR_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CORN,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CORN_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.EGGPLANT,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.EGGPLANT_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HOT_PEPPER,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HOT_PEPPER_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ONION,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPINACH,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.SPINACH_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO_SEEDS, 0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ZUCCHINI,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ZUCCHINI_SEEDS, 0.1f);
	}
}
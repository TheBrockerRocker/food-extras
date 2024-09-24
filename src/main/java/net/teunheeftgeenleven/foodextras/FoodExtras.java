package net.teunheeftgeenleven.foodextras;

import net.fabricmc.api.ModInitializer;

import net.teunheeftgeenleven.foodextras.item.ModItemGroups;
import net.teunheeftgeenleven.foodextras.item.ModItems;
import net.teunheeftgeenleven.foodextras.item.StirFry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodExtras implements ModInitializer {
	public static final String MOD_ID = "foodextras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		StirFry.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}
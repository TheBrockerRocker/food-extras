package net.teunheeftgeenleven.foodextras;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.teunheeftgeenleven.foodextras.datagen.*;

public class FoodExtrasDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
       FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		//pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}

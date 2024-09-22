package net.teunheeftgeenleven.foodextras;

import net.fabricmc.api.ClientModInitializer;
import net.teunheeftgeenleven.foodextras.item.ModItems;
import net.teunheeftgeenleven.foodextras.item.StirFry;

public class FoodExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
        StirFry.registerModItems();
    }
}

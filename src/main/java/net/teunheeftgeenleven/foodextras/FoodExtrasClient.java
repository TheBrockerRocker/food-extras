package net.teunheeftgeenleven.foodextras;

import net.fabricmc.api.ClientModInitializer;
import net.teunheeftgeenleven.foodextras.item.ModItems;

public class FoodExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
    }
}

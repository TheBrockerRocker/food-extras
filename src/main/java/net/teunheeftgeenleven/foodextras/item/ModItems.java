package net.teunheeftgeenleven.foodextras.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.teunheeftgeenleven.foodextras.FoodExtras;
import  net.minecraft.registry.Registry;


public class ModItems {

    public static final Item KNIFE = registerItem("knife", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, new Identifier(FoodExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodExtras.LOGGER.info("Registering mod items for " + FoodExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KNIFE);
        });

    }
}

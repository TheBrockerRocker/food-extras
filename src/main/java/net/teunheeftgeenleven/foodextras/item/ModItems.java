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
    public static final Item PIZZA = registerItem( "whole_pizza", new Item(new Item.Settings()));
    public static final Item COCA = registerItem("cocoa_powder" , new Item(new Item.Settings()));
    public static final Item PURE = registerItem("pure_chocolate", new Item(new Item.Settings()));
    public static final Item MILK = registerItem("milk_chocolate", new Item(new Item.Settings()));
    public static final Item WHITE = registerItem("white_chocolate", new Item(new Item.Settings()));
    public static final Item RMUF = registerItem("raw_muffin", new Item(new Item.Settings()));
    public static final Item CMUF = registerItem("cooked_muffin", new Item(new Item.Settings()));
    public static final Item BMUF = registerItem("black_muffin", new Item(new Item.Settings()));
    public static final Item BLMUF = registerItem("blue_muffin", new Item(new Item.Settings()));
    public static final Item BRMUF = registerItem("brown_muffin", new Item(new Item.Settings()));
    public static final Item CYMUF = registerItem("cyan_muffin", new Item(new Item.Settings()));
    public static final Item GMUF = registerItem("gray_muffin", new Item(new Item.Settings()));
    public static final Item GRMUF = registerItem("green_muffin", new Item(new Item.Settings()));
    public static final Item LBMUF = registerItem("light_blue_muffin", new Item(new Item.Settings()));
    public static final Item LGMUF = registerItem("light_gray_muffin", new Item(new Item.Settings()));
    public static final Item LMUF = registerItem("lime_muffin", new Item(new Item.Settings()));
    public static final Item MMUF = registerItem("magenta_muffin", new Item(new Item.Settings()));
    public static final Item OMUF = registerItem("orange_muffin", new Item(new Item.Settings()));
    public static final Item PMUF = registerItem("pink_muffin", new Item(new Item.Settings()));
    public static final Item PUMUF = registerItem("purple_muffin", new Item(new Item.Settings()));
    public static final Item REMUF = registerItem("red_muffin", new Item(new Item.Settings()));
    public static final Item WMUF = registerItem("white_muffin", new Item(new Item.Settings()));
    public static final Item YMUF = registerItem("yellow_muffin", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, new Identifier(FoodExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodExtras.LOGGER.info("Registering mod items for " + FoodExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KNIFE);
            entries.add(COCA);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(PIZZA);
            entries.add(PURE);
            entries.add(MILK);
            entries.add(WHITE);
            entries.add(RMUF);
            entries.add(CMUF);
            entries.add(BMUF);
            entries.add(BLMUF);
            entries.add(BRMUF);
            entries.add(CMUF);
            entries.add(GMUF);
            entries.add(GRMUF);
            entries.add(LBMUF);
            entries.add(LGMUF);
            entries.add(LMUF);
            entries.add(MMUF);
            entries.add(OMUF);
            entries.add(PMUF);
            entries.add(PUMUF);
            entries.add(REMUF);
            entries.add(WMUF);
            entries.add(YMUF);


        });

    }
}

package net.teunheeftgeenleven.foodextras.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.teunheeftgeenleven.foodextras.FoodExtras;
import  net.minecraft.registry.Registry;


public class ModItems {

    public static final Item KNIFE = registerItem("knife", new Item(new Item.Settings().maxCount(1).maxDamage(128)));
//    public static final Item PIZZA = registerItem( "whole_pizza", new Item(new Item.Settings()));
    public static final Item COCA = registerItem("cocoa_powder" , new Item(new Item.Settings()));
    public static final Item PURE = registerItem("pure_chocolate", new Item(new Item.Settings().food(ModFoodComponents.PURE).maxCount(16)));
    public static final Item MILK = registerItem("milk_chocolate", new MilkChocolatetItem(new Item.Settings().
            food(ModFoodComponents.MILK).maxCount(16)));
    public static final Item WHITE = registerItem("white_chocolate", new Item(new Item.Settings().food(ModFoodComponents.WHITE).maxCount(16)));
    public static final Item RMUF = registerItem("raw_muffin", new Item(new Item.Settings()));
    public static final Item CMUF = registerItem("cooked_muffin", new Item(new Item.Settings().food(ModFoodComponents.CMUF).maxCount(16)));
    public static final Item BMUF = registerItem("black_muffin", new Item(new Item.Settings().food(ModFoodComponents.BMUF).maxCount(16)));
    public static final Item BLMUF = registerItem("blue_muffin", new Item(new Item.Settings().food(ModFoodComponents.BLMUF).maxCount(16)));
    public static final Item BRMUF = registerItem("brown_muffin", new Item(new Item.Settings().food(ModFoodComponents.BRMUF).maxCount(16)));
    public static final Item CYMUF = registerItem("cyan_muffin", new Item(new Item.Settings().food(ModFoodComponents.CYMUF).maxCount(16)));
    public static final Item GMUF = registerItem("gray_muffin", new Item(new Item.Settings().food(ModFoodComponents.GMUF).maxCount(16)));
    public static final Item GRMUF = registerItem("green_muffin", new Item(new Item.Settings().food(ModFoodComponents.GRMUF).maxCount(16)));
    public static final Item LBMUF = registerItem("light_blue_muffin", new Item(new Item.Settings().food(ModFoodComponents.LBMUF).maxCount(16)));
    public static final Item LGMUF = registerItem("light_gray_muffin", new Item(new Item.Settings().food(ModFoodComponents.LGMUF).maxCount(16)));
    public static final Item LMUF = registerItem("lime_muffin", new Item(new Item.Settings().food(ModFoodComponents.LMUF).maxCount(16)));
    public static final Item MMUF = registerItem("magenta_muffin", new Item(new Item.Settings().food(ModFoodComponents.MMUF).maxCount(16)));
    public static final Item OMUF = registerItem("orange_muffin", new Item(new Item.Settings().food(ModFoodComponents.OMUF).maxCount(16)));
    public static final Item PMUF = registerItem("pink_muffin", new Item(new Item.Settings().food(ModFoodComponents.PMUF).maxCount(16)));
    public static final Item PUMUF = registerItem("purple_muffin", new Item(new Item.Settings().food(ModFoodComponents.PUMUF).maxCount(16)));
    public static final Item REMUF = registerItem("red_muffin", new Item(new Item.Settings().food(ModFoodComponents.REMUF).maxCount(16)));
    public static final Item WMUF = registerItem("white_muffin", new Item(new Item.Settings().food(ModFoodComponents.WMUF).maxCount(16)));
    public static final Item YMUF = registerItem("yellow_muffin", new Item(new Item.Settings().food(ModFoodComponents.YMUF).maxCount(16)));
    public static final Item BCRM = registerItem("black_cream", new Item(new Item.Settings()));
    public static final Item BLCRM = registerItem("blue_cream", new Item(new Item.Settings()));
    public static final Item BRCRM = registerItem("brown_cream", new Item(new Item.Settings()));
    public static final Item CYCRM = registerItem("cyan_cream", new Item(new Item.Settings()));
    public static final Item GCRM = registerItem("gray_cream", new Item(new Item.Settings()));
    public static final Item GRCRM = registerItem("green_cream", new Item(new Item.Settings()));
    public static final Item LBCRM = registerItem("light_blue_cream", new Item(new Item.Settings()));
    public static final Item LGCRM = registerItem("light_gray_cream", new Item(new Item.Settings()));
    public static final Item LCRM = registerItem("lime_cream", new Item(new Item.Settings()));
    public static final Item MCRM = registerItem("magenta_cream", new Item(new Item.Settings()));
    public static final Item OCRM = registerItem("orange_cream", new Item(new Item.Settings()));
    public static final Item PCRM = registerItem("pink_cream", new Item(new Item.Settings()));
    public static final Item PUCRM = registerItem("purple_cream", new Item(new Item.Settings()));
    public static final Item RECRM = registerItem("red_cream", new Item(new Item.Settings()));
    public static final Item WCRM = registerItem("white_cream", new Item(new Item.Settings()));
    public static final Item YCRM = registerItem("yellow_cream", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, new Identifier(FoodExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodExtras.LOGGER.info("Registering mod items for " + FoodExtras.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KNIFE);
            entries.add(COCA);
            entries.add(BCRM);
            entries.add(BLCRM);
            entries.add(BRCRM);
            entries.add(CYCRM);
            entries.add(GCRM);
            entries.add(GRCRM);
            entries.add(LBCRM);
            entries.add(LGCRM);
            entries.add(LCRM);
            entries.add(MCRM);
            entries.add(OCRM);
            entries.add(PCRM);
            entries.add(PUCRM);
            entries.add(RECRM);
            entries.add(WCRM);
            entries.add(YCRM);
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
            entries.add(CYMUF);


        });

    }
}

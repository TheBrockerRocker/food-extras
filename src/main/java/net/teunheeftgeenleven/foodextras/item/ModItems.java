package net.teunheeftgeenleven.foodextras.item;


import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.teunheeftgeenleven.foodextras.FoodExtras;
import  net.minecraft.registry.Registry;


public class ModItems {

    public static final Item KNIFE = registerItem("knife", new Item(new Item.Settings().maxCount(1).maxDamage(128)));
    public static final Item PIZZA = registerItem( "whole_pizza", new Item(new Item.Settings()));
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
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));
    public static final Item KETCHUP = registerItem("ketchup", new StewItem(new Item.Settings().maxCount(1)));
    public static final Item PEPERONI = registerItem("raw_peperoni", new Item(new Item.Settings().food(ModFoodComponents.PEPERONI)));
    public static final Item PSLICE = registerItem("pizza_slice", new Item(new Item.Settings().food(ModFoodComponents.PSLICE)));
    public static final Item RPIZ = registerItem("raw_pizza", new Item(new Item.Settings()));
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings()));
    public static final Item SEASHEETS = registerItem("seaweed_sheets", new Item(new Item.Settings()));
    public static final Item SALSTICK = registerItem("salmon_stick", new Item(new Item.Settings()));
    public static final Item SUROLL = registerItem("sushi_roll", new Item(new Item.Settings()));
    public static final Item SUPI = registerItem("sushi_piece", new Item(new Item.Settings()));
    public static final Item RDNUT = registerItem("raw_doughnut", new Item(new Item.Settings()));
    public static final Item PDNUT = registerItem("plain_doughnut", new Item(new Item.Settings()));
    public static final Item SDNUT = registerItem("sugared_doughnut", new Item(new Item.Settings()));
    public static final Item BSLICE = registerItem("bread_slice", new Item(new Item.Settings()));
    public static final Item TOAST = registerItem("toast", new Item(new Item.Settings()));
    public static final Item TB = registerItem("toast_with_bacon", new Item(new Item.Settings()));
    public static final Item TE = registerItem("toast_with_eggs", new Item(new Item.Settings()));
    public static final Item TC = registerItem("toast_with_cheese", new Item(new Item.Settings()));
    public static final Item TBE = registerItem("toast_with_bacon_and_eggs", new Item(new Item.Settings()));
    public static final Item TBC = registerItem("toast_with_bacon_and_cheese", new Item(new Item.Settings()));
    public static final Item TEC = registerItem("toast_with_eggs_and_cheese", new Item(new Item.Settings()));
    public static final Item TBEC = registerItem("toast_with_bacon_eggs_and_cheese", new Item(new Item.Settings()));
    public static final Item RMEPI = registerItem("raw_meat_pie", new Item(new Item.Settings()));
    public static final Item RMUPI = registerItem("raw_mushroom_pie", new Item(new Item.Settings()));
    public static final Item MEPI = registerItem("meat_pie",new Item(new Item.Settings()));
    public static final Item MUPI = registerItem("mushroom_pie",new Item(new Item.Settings()));
    public static final Item LEEK = registerItem("leek",new Item(new Item.Settings()));
    public static final Item ONION = registerItem("onion",new Item(new Item.Settings()));
    public static final Item CAPSICUM = registerItem("capsicum",new Item(new Item.Settings()));
    public static final Item ZUCCHINI = registerItem("zucchini",new Item(new Item.Settings()));
    public static final Item EGGPLANT = registerItem("eggplant",new Item(new Item.Settings()));
    public static final Item ASPARAGUS = registerItem("asparagus",new Item(new Item.Settings()));
    public static final Item CORN = registerItem("corn",new Item(new Item.Settings()));
    public static final Item BROCCOLI = registerItem("broccoli",new Item(new Item.Settings()));
    public static final Item CABBAGE = registerItem("cabbage",new Item(new Item.Settings()));
    public static final Item SPINACH = registerItem("spinach",new Item(new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato",new Item(new Item.Settings()));
    public static final Item HOT_PEPPER = registerItem("hot_pepper",new Item(new Item.Settings()));
    public static final Item CAULIFLOWER = registerItem("cauliflower",new Item(new Item.Settings()));
    public static final Item CELERY = registerItem("celery",new Item(new Item.Settings()));
    public static final Item RPIN = registerItem("rolling_pin", new Item(new Item.Settings()));
    public static final Item TORT = registerItem("tortilla", new Item(new Item.Settings()));
    public static final Item MINCE = registerItem("minced_meat", new Item(new Item.Settings()));
    public static final Item TACO = registerItem("taco", new Item(new Item.Settings()));
    public static final Item PEACH = registerItem("peach", new Item(new Item.Settings()));
    public static final Item BACON_AND_EGGS = registerItem("bacon_and_eggs", new Item(new Item.Settings()));
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings()));
    public static final Item BANANA_SMOOTIE = registerItem("banana_smoothie", new Item(new Item.Settings()));
    public static final Item BREAD_BUN = registerItem("bread_bun", new Item(new Item.Settings()));
    public static final Item BURGER = registerItem("burger", new Item(new Item.Settings()));
    public static final Item CHERRY = registerItem("cherry",new Item(new Item.Settings()));
    public static final Item CHOCOLATE_ICECREAM = registerItem("chocolate_icecream", new Item(new Item.Settings()));
    public static final Item COOKED_BURGER = registerItem("cooked_burger", new Item(new Item.Settings()));
    public static final Item COOKED_BACON = registerItem("cooked_bacon", new Item(new Item.Settings()));
    public static final Item COOKED_EGG = registerItem("cooked_egg", new Item(new Item.Settings()));
    public static final Item COOKED_FRIES = registerItem("cooked_fries", new Item(new Item.Settings()));
    public static final Item COOKED_PANCAKE = registerItem("cooked_pancake", new Item(new Item.Settings()));
    public static final Item COOKED_SAUSAGE = registerItem("cooked_sausage", new Item(new Item.Settings()));
    public static final Item CRACKED_EGG = registerItem("cracked_egg", new Item(new Item.Settings()));
    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()));
    public static final Item GOLD_KIWI = registerItem("gold_kiwi", new Item(new Item.Settings()));
    public static final Item HOTDOG = registerItem("hotdog", new Item(new Item.Settings()));
    public static final Item ICECREAM_CONE = registerItem("icecream_cone", new Item(new Item.Settings()));
    public static final Item ICECREAM_AND_SYRUP_CANCAKE = registerItem("icecream_and_syrup_pancake", new Item(new Item.Settings()));
    public static final Item KETCHUP_HOTDOG = registerItem("ketchup_hotdog", new Item(new Item.Settings()));
    public static final Item KIWI = registerItem("kiwi", new Item(new Item.Settings()));
    public static final Item MUSTARD = registerItem("mustard", new Item(new Item.Settings()));
    public static final Item MUSTARD_HOTDOG = registerItem("mustard_hotdog", new Item(new Item.Settings()));
    public static final Item KETCHUP_AND_MUSTARD_HOTDOG = registerItem("ketchup_and_mustrad_hotdog", new Item(new Item.Settings()));
    public static final Item ORANGE = registerItem("orange", new Item(new Item.Settings()));
    public static final Item ORANGE_JUICE = registerItem("orange_juice", new Item(new Item.Settings()));
    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings()));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new Item.Settings()));
    public static final Item RAW_BURGER = registerItem("raw_burger", new Item(new Item.Settings()));
    public static final Item RAW_BACON = registerItem("raw_bacon", new Item(new Item.Settings()));
    public static final Item RAW_FRIES = registerItem("raw_fries", new Item(new Item.Settings()));
    public static final Item RAW_PANCAKE = registerItem("raw_pancake", new Item(new Item.Settings()));
    public static final Item RAW_SAUSAGE = registerItem("raw_sausage", new Item(new Item.Settings()));
    public static final Item SPAGHETTI_BOLOGNESE = registerItem("spaghetti_bolognese", new Item(new Item.Settings()));
    public static final Item SPAGHETTI_BOLOGNESE_WITH_MEATBALLS = registerItem("spaghetti_bologhese_with_meatballs", new Item(new Item.Settings()));
    public static final Item STRACCIATELLA_ICECREAM = registerItem("stracciatella_icecream", new Item(new Item.Settings()));
    public static final Item STRAWBERRY_ICECREAM = registerItem("strawberry_icecream", new Item(new Item.Settings()));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings()));
    public static final Item SYRUP_PANCAKE = registerItem("syrup_pacncake", new Item(new Item.Settings()));
    public static final Item VANILLA_ICECREAM = registerItem("vanilla_icecream", new Item(new Item.Settings()));
    public static final Item WAFFLE = registerItem("waffel", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, new Identifier(FoodExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodExtras.LOGGER.info("Registering mod items for " + FoodExtras.MOD_ID);



    }
}

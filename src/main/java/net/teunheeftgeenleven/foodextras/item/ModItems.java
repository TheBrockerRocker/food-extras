package net.teunheeftgeenleven.foodextras.item;


import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.teunheeftgeenleven.foodextras.FoodExtras;
import  net.minecraft.registry.Registry;
import net.teunheeftgeenleven.foodextras.block.ModBlocks;


public class ModItems {
    //tools
    public static final Item KNIFE = registerItem("knife", new Item(new Item.Settings().maxCount(1).maxDamage(128)));
    public static final Item RPIN = registerItem("rolling_pin", new Item(new Item.Settings()));
    //pizza
    public static final Item PIZZA = registerItem( "whole_pizza", new Item(new Item.Settings()));
    //ingredients
    public static final Item COCA = registerItem("cocoa_powder" , new Item(new Item.Settings()));
    public static final Item WCRM = registerItem("cream", new Item(new Item.Settings()));
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));
    public static final Item KETCHUP = registerItem("ketchup", new Item(new Item.Settings().maxCount(1).food(ModFoodComponents.KETCHUP)));
    public static final Item PEPERONI = registerItem("raw_peperoni", new Item(new Item.Settings().food(ModFoodComponents.PEPERONI)));
    public static final Item RPIZ = registerItem("raw_pizza", new Item(new Item.Settings()));
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings()));
    public static final Item SEASHEETS = registerItem("seaweed_sheets", new Item(new Item.Settings()));
    public static final Item SALSTICK = registerItem("salmon_stick", new Item(new Item.Settings()));
    public static final Item SUROLL = registerItem("sushi_roll", new Item(new Item.Settings()));
    public static final Item RDNUT = registerItem("raw_doughnut", new Item(new Item.Settings()));
    public static final Item RMEPI = registerItem("raw_meat_pie", new Item(new Item.Settings()));
    public static final Item RMUPI = registerItem("raw_mushroom_pie", new Item(new Item.Settings()));
    public static final Item TORT = registerItem("tortilla", new Item(new Item.Settings()));
    public static final Item MINCE = registerItem("minced_meat", new Item(new Item.Settings().food(ModFoodComponents.CUBE)));
    public static final Item CRACKED_EGG = registerItem("cracked_egg", new Item(new Item.Settings()));
    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()));    public static final Item RAW_BURGER = registerItem("raw_burger", new Item(new Item.Settings()));
    public static final Item RAW_BACON = registerItem("raw_bacon", new Item(new Item.Settings()));
    public static final Item RAW_FRIES = registerItem("raw_fries", new Item(new Item.Settings()));
    public static final Item RAW_PANCAKE = registerItem("raw_pancake", new Item(new Item.Settings()));
    public static final Item RAW_SAUSAGE = registerItem("raw_sausage", new Item(new Item.Settings()));
    public static final Item MUSTARD = registerItem("mustard", new Item(new Item.Settings().food(ModFoodComponents.MUSTARD)));
    //cholate
    public static final Item PURE = registerItem("pure_chocolate", new Item(new Item.Settings().food(ModFoodComponents.PURE).maxCount(16)));
    public static final Item MILK = registerItem("milk_chocolate", new MilkChocolatetItem(new Item.Settings().
            food(ModFoodComponents.MILK).maxCount(16)));
    public static final Item WHITE = registerItem("white_chocolate", new Item(new Item.Settings().food(ModFoodComponents.WHITE).maxCount(16)));
    //muffins
    public static final Item RMUF = registerItem("raw_muffin", new Item(new Item.Settings()));
    public static final Item CMUF = registerItem("cooked_muffin", new Item(new Item.Settings().food(ModFoodComponents.CMUF).maxCount(16)));
    public static final Item MUFFIN = registerItem("muffin", new Item(new Item.Settings().food(ModFoodComponents.MUFFIN).maxCount(16)));
    //pizza
    public static final Item PSLICE = registerItem("pizza_slice", new Item(new Item.Settings().food(ModFoodComponents.PSLICE)));
    //sushi
    public static final Item SUPI = registerItem("sushi_piece", new Item(new Item.Settings().food(ModFoodComponents.SUSHI)));
    //donut
    public static final Item PDNUT = registerItem("plain_doughnut", new Item(new Item.Settings().food(ModFoodComponents.DOGHNUT)));
    public static final Item SDNUT = registerItem("sugared_doughnut", new Item(new Item.Settings().food(ModFoodComponents.DOGHNUT)));
    //bread
    public static final Item BSLICE = registerItem("bread_slice", new Item(new Item.Settings().food(ModFoodComponents.BREAD)));
    public static final Item TOAST = registerItem("toast", new Item(new Item.Settings().food(ModFoodComponents.TOAST)));
    public static final Item TB = registerItem("toast_with_bacon", new Item(new Item.Settings().food(ModFoodComponents.T2_TOAST)));
    public static final Item TE = registerItem("toast_with_eggs", new Item(new Item.Settings().food(ModFoodComponents.T2_TOAST)));
    public static final Item TC = registerItem("toast_with_cheese", new Item(new Item.Settings().food(ModFoodComponents.T2_TOAST)));
    public static final Item TBE = registerItem("toast_with_bacon_and_eggs", new Item(new Item.Settings().food(ModFoodComponents.T3_TOAST)));
    public static final Item TBC = registerItem("toast_with_bacon_and_cheese", new Item(new Item.Settings().food(ModFoodComponents.T3_TOAST)));
    public static final Item TEC = registerItem("toast_with_eggs_and_cheese", new Item(new Item.Settings().food(ModFoodComponents.T3_TOAST)));
    public static final Item TBEC = registerItem("toast_with_bacon_eggs_and_cheese", new Item(new Item.Settings().food(ModFoodComponents.T3_TOAST)));
    //pies
    public static final Item MEPI = registerItem("meat_pie",new Item(new Item.Settings().food(ModFoodComponents.CUBE)));
    public static final Item MUPI = registerItem("mushroom_pie",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    //vegie
    public static final Item LEEK = registerItem("leek",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item ONION = registerItem("onion",new AliasedBlockItem(ModBlocks.ONION_CROP,new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item CAPSICUM = registerItem("capsicum",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item ZUCCHINI = registerItem("zucchini",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item EGGPLANT = registerItem("eggplant",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item CORN = registerItem("corn",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item BROCCOLI = registerItem("broccoli",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item CABBAGE = registerItem("cabbage",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item SPINACH = registerItem("spinach",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item TOMATO = registerItem("tomato",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item HOT_PEPPER = registerItem("hot_pepper",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    public static final Item CAULIFLOWER = registerItem("cauliflower",new Item(new Item.Settings().food(ModFoodComponents.VEGGIE)));
    //taco
    public static final Item TACO = registerItem("taco", new Item(new Item.Settings().food(ModFoodComponents.TACO)));
    //fruit
    public static final Item PEACH = registerItem("peach", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item CHERRY = registerItem("cherry",new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item GOLD_KIWI = registerItem("gold_kiwi", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item KIWI = registerItem("kiwi", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item ORANGE = registerItem("orange", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.FRUIT)));
    //smoothie
    public static final Item BANANA_SMOOTIE = registerItem("banana_smoothie", new Item(new Item.Settings().food(ModFoodComponents.SMOOTIE)));
    //burger
    public static final Item BREAD_BUN = registerItem("bread_bun", new Item(new Item.Settings()));
    public static final Item BURGER = registerItem("burger", new Item(new Item.Settings()));
    public static final Item COOKED_BURGER = registerItem("cooked_burger", new Item(new Item.Settings().food(ModFoodComponents.BURGER)));
    //icecream
    public static final Item CHOCOLATE_ICECREAM = registerItem("chocolate_icecream", new Item(new Item.Settings().food(ModFoodComponents.CHOCO)));
    public static final Item ICECREAM_CONE = registerItem("icecream_cone", new Item(new Item.Settings().food(ModFoodComponents.CONE)));
    public static final Item STRACCIATELLA_ICECREAM = registerItem("stracciatella_icecream", new Item(new Item.Settings().food(ModFoodComponents.STRACCIATELLA)));
    public static final Item STRAWBERRY_ICECREAM = registerItem("strawberry_icecream", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item VANILLA_ICECREAM = registerItem("vanilla_icecream", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    //pancakes
    public static final Item COOKED_PANCAKE = registerItem("cooked_pancake", new Item(new Item.Settings().food(ModFoodComponents.PANCAKE)));
    public static final Item ICECREAM_AND_SYRUP_PANCAKE = registerItem("icecream_and_syrup_pancake", new Item(new Item.Settings().food(ModFoodComponents.I_AND_S_CAKE)));
    public static final Item SYRUP_PANCAKE = registerItem("syrup_pacncake", new Item(new Item.Settings().food(ModFoodComponents.PANCAKE)));
    //Hotdogs
    public static final Item HOTDOG = registerItem("hotdog", new Item(new Item.Settings().food(ModFoodComponents.HOTDOG)));
    public static final Item KETCHUP_HOTDOG = registerItem("ketchup_hotdog", new Item(new Item.Settings().food(ModFoodComponents.HOTDOG)));
    public static final Item MUSTARD_HOTDOG = registerItem("mustard_hotdog", new Item(new Item.Settings().food(ModFoodComponents.HOTDOG)));
    public static final Item KETCHUP_AND_MUSTARD_HOTDOG = registerItem("ketchup_and_mustrad_hotdog", new Item(new Item.Settings()));
    // spageti
    public static final Item SPAGHETTI_BOLOGNESE = registerItem("spaghetti_bolognese", new Item(new Item.Settings().food(ModFoodComponents.SPAGHETTI)));
    public static final Item SPAGHETTI_BOLOGNESE_WITH_MEATBALLS = registerItem("spaghetti_bologhese_with_meatballs", new Item(new Item.Settings().food(ModFoodComponents.SPAGHETTI_MEAT)));
    //seeds
    public static final Item CAULIFLOUR_SEEDS = registerItem("cauliflour_seeds", new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP,new Item.Settings()));
    public static final Item LEEK_SEEDS = registerItem("leek_seeds", new AliasedBlockItem(ModBlocks.LEEK_CROP,new Item.Settings()));
    public static final Item CAPSICUM_SEEDS = registerItem("capsicum_seeds", new AliasedBlockItem(ModBlocks.CAPSICUM_CROP,new Item.Settings()));
    public static final Item ZUCCHINI_SEEDS = registerItem("zucchini_seeds", new AliasedBlockItem(ModBlocks.ZUCCHINI_CROP,new Item.Settings()));
    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds", new AliasedBlockItem(ModBlocks.EGGPLANT_CROP,new Item.Settings()));
    public static final Item CORN_SEEDS = registerItem("corn_seeds", new AliasedBlockItem(ModBlocks.CORN_CROP,new Item.Settings()));
    public static final Item BROCCOLIE_SEEDS = registerItem("broccolie_seeds", new AliasedBlockItem(ModBlocks.BROCCOLIE_CROP,new Item.Settings()));
    public static final Item CABBAGE_SEEDS = registerItem("cabbage_seeds", new AliasedBlockItem(ModBlocks.CABBAGE_CROP,new Item.Settings()));
    public static final Item SPINACH_SEEDS = registerItem("spinach_seeds", new AliasedBlockItem(ModBlocks.SPINACH_CROP,new Item.Settings()));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP,new Item.Settings()));
    public static final Item HOT_PEPPER_SEEDS = registerItem("hot_pepper_seeds", new AliasedBlockItem(ModBlocks.HOT_PEPPER_CROP,new Item.Settings()));
    //stirfry
    public static final Item RICE_BOWL = registerItem("rice_bowl", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T0)));
    public static final Item STIR_FRY_T1 = registerItem("stir_fry_t1", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));
    public static final Item STIR_FRY_T2 = registerItem("stir_fry_t2", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item STIR_FRY_T3 = registerItem("stir_fry_t3", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item STIR_FRY_T4 = registerItem("stir_fry_t4", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T4)));
    public static final Item STIR_FRY_T5 = registerItem("stir_fry_t5", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T5)));
    //misc
    public static final Item BACON_AND_EGGS = registerItem("bacon_and_eggs", new Item(new Item.Settings().food(ModFoodComponents.B_AND_E)));
    public static final Item COOKED_BACON = registerItem("cooked_bacon", new Item(new Item.Settings().food(ModFoodComponents.BACON)));
    public static final Item COOKED_EGG = registerItem("cooked_egg", new Item(new Item.Settings().food(ModFoodComponents.EGG)));
    public static final Item COOKED_FRIES = registerItem("cooked_fries", new Item(new Item.Settings().food(ModFoodComponents.FRIES)));
    public static final Item COOKED_SAUSAGE = registerItem("cooked_sausage", new Item(new Item.Settings().food(ModFoodComponents.SAUSAGE)));
    public static final Item WAFFLE = registerItem("waffel", new Item(new Item.Settings().food(ModFoodComponents.SYRUP)));
    public static final Item ORANGE_JUICE = registerItem("orange_juice", new Item(new Item.Settings().food(ModFoodComponents.JUICE)));


    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, Identifier.of(FoodExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodExtras.LOGGER.info("Registering mod items for " + FoodExtras.MOD_ID);
    }
}

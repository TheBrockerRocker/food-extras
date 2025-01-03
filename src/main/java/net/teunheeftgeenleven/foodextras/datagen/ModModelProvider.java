package net.teunheeftgeenleven.foodextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.teunheeftgeenleven.foodextras.block.ModBlocks;
import net.teunheeftgeenleven.foodextras.block.custom.CauliflowerCropBlock;
import net.teunheeftgeenleven.foodextras.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.ASPARAGUS_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.BROCCOLIE_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.CABBAGE_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.CAPSICUM_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.CELERY_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.EGGPLANT_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.HOT_PEPPER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.LEEK_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.ONION_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.SPINACH_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.ZUCCHINI_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PIZZA, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCA, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.CMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.GMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.LBMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.LGMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.LMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.MMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.OMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.PMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.REMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.WMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.YMUF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LBCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LGCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RECRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.YCRM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEPERONI, Models.GENERATED);
        itemModelGenerator.register(ModItems.PSLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RPIZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEASHEETS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPI, Models.GENERATED);
        itemModelGenerator.register(ModItems.RDNUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PDNUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SDNUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BSLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TB, Models.GENERATED);
        itemModelGenerator.register(ModItems.TE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TBE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TBC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TBEC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RMEPI, Models.GENERATED);
        itemModelGenerator.register(ModItems.RMUPI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEPI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUPI, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEEK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAPSICUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZUCCHINI, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASPARAGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROCCOLI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPINACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_PEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CELERY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RPIN, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TORT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TACO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACON_AND_EGGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA_SMOOTIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BREAD_BUN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_FRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_PANCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRACKED_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_KIWI, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOTDOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICECREAM_CONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICECREAM_AND_SYRUP_CANCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_HOTDOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIWI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSTARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSTARD_HOTDOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_FRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PANCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPAGHETTI_BOLOGNESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPAGHETTI_BOLOGNESE_WITH_MEATBALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRACCIATELLA_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SYRUP_PANCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VANILLA_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAFFLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASPARAGUS_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROCCOLIE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAPSICUM_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CELERY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_PEPPER_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEEK_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPINACH_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZUCCHINI_SEEDS, Models.GENERATED);
    }
}

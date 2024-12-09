package net.teunheeftgeenleven.foodextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.teunheeftgeenleven.foodextras.block.ModBlocks;
import net.teunheeftgeenleven.foodextras.block.custom.*;
import net.teunheeftgeenleven.foodextras.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {



        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, CauliflowerCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOUR_SEEDS, builder2));

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.ASPARAGUS_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(AsparagusCropBlock.AGE, AsparagusCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.ASPARAGUS_CROP, this.cropDrops(ModBlocks.ASPARAGUS_CROP, ModItems.ASPARAGUS, ModItems.ASPARAGUS_SEEDS, builder3));

        BlockStatePropertyLootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.BROCCOLIE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(BroccolieCropBlock.AGE, BroccolieCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.BROCCOLIE_CROP, this.cropDrops(ModBlocks.BROCCOLIE_CROP, ModItems.BROCCOLI, ModItems.BROCCOLIE_SEEDS, builder4));

        BlockStatePropertyLootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.CABBAGE_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CabbageCropBlock.AGE, CabbageCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CABBAGE_CROP, this.cropDrops(ModBlocks.CABBAGE_CROP, ModItems.CABBAGE, ModItems.CABBAGE_SEEDS, builder5));

        BlockStatePropertyLootCondition.Builder builder6 = BlockStatePropertyLootCondition.builder(ModBlocks.CAPSICUM_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CapsicumCropBlock.AGE, CapsicumCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CAPSICUM_CROP, this.cropDrops(ModBlocks.CAPSICUM_CROP, ModItems.CAPSICUM, ModItems.CAPSICUM_SEEDS, builder6));

        BlockStatePropertyLootCondition.Builder builder7 = BlockStatePropertyLootCondition.builder(ModBlocks.CELERY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CeleryCropBlock.AGE, CeleryCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CELERY_CROP, this.cropDrops(ModBlocks.CELERY_CROP, ModItems.CELERY, ModItems.CELERY_SEEDS, builder7));

        BlockStatePropertyLootCondition.Builder builder8 = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CornCropBlock.AGE, CornCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CORN_CROP, this.cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_SEEDS, builder8));

        BlockStatePropertyLootCondition.Builder builder9 = BlockStatePropertyLootCondition.builder(ModBlocks.EGGPLANT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(EggplantCropBlock.AGE, EggplantCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.EGGPLANT_CROP, this.cropDrops(ModBlocks.EGGPLANT_CROP, ModItems.EGGPLANT, ModItems.EGGPLANT_SEEDS, builder9));

        BlockStatePropertyLootCondition.Builder builder10 = BlockStatePropertyLootCondition.builder(ModBlocks.HOT_PEPPER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(HotPepperCropBlock.AGE, HotPepperCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.HOT_PEPPER_CROP, this.cropDrops(ModBlocks.HOT_PEPPER_CROP, ModItems.HOT_PEPPER, ModItems.HOT_PEPPER_SEEDS, builder10));

        BlockStatePropertyLootCondition.Builder builder11 = BlockStatePropertyLootCondition.builder(ModBlocks.LEEK_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(LeekCropBlock.AGE, LeekCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.LEEK_CROP, this.cropDrops(ModBlocks.LEEK_CROP, ModItems.LEEK, ModItems.LEEK_SEEDS, builder11));

        BlockStatePropertyLootCondition.Builder builder12 = BlockStatePropertyLootCondition.builder(ModBlocks.ONION_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(OnionCropBlock.AGE, OnionCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.ONION_CROP, this.cropDrops(ModBlocks.ONION_CROP, ModItems.ONION, ModItems.ONION, builder12));

        BlockStatePropertyLootCondition.Builder builder13 = BlockStatePropertyLootCondition.builder(ModBlocks.SPINACH_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SpinachCropBlock.AGE, SpinachCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.SPINACH_CROP, this.cropDrops(ModBlocks.SPINACH_CROP, ModItems.SPINACH, ModItems.SPINACH_SEEDS, builder13));

        BlockStatePropertyLootCondition.Builder builder14 = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.TOMATO_CROP, this.cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder14));

        BlockStatePropertyLootCondition.Builder builder15 = BlockStatePropertyLootCondition.builder(ModBlocks.ZUCCHINI_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ZucchiniCropBlock.AGE, ZucchiniCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.ZUCCHINI_CROP, this.cropDrops(ModBlocks.ZUCCHINI_CROP, ModItems.ZUCCHINI, ModItems.ZUCCHINI_SEEDS, builder15));
    }
}

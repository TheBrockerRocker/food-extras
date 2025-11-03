package net.teunheeftgeenleven.foodextras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.teunheeftgeenleven.foodextras.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> MUF = List.of(ModItems.RMUF);
        offerSmelting(exporter, MUF , RecipeCategory.FOOD , ModItems.CMUF, 0.2f, 400, "muffins");


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.KNIFE)
                        .input('|', Items.STICK).input('i', Items.IRON_INGOT)
                        .pattern("i")
                        .pattern("|")
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COCA)
                .input(Items.COCOA_BEANS).input(ModItems.KNIFE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WCRM)
                .input(Items.EGG).input(Items.SUGAR).input(Items.MILK_BUCKET)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RMUF)
                .input(Items.MILK_BUCKET).input(Items.EGG).input(Items.WHEAT)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter);

    }
}

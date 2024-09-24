package net.teunheeftgeenleven.foodextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.teunheeftgeenleven.foodextras.FoodExtras;

public class ModItemGroups {
    public static final ItemGroup STIR_FRY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(FoodExtras.MOD_ID, "stir_fry_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(StirFry.L_C_E_B_S)).displayName(Text.translatable("itemgroup.foodextras.stir_fry_items")).
                    entries((displayContext, entries) -> {
        entries.add(StirFry.L);
        entries.add(StirFry.C);
        entries.add(StirFry.E);
        entries.add(StirFry.B);
        entries.add(StirFry.S);
        entries.add(StirFry.L_C);
        entries.add(StirFry.L_E);
        entries.add(StirFry.L_B);
        entries.add(StirFry.L_S);
        entries.add(StirFry.C_E);
        entries.add(StirFry.C_B);
        entries.add(StirFry.C_S);
        entries.add(StirFry.E_B);
        entries.add(StirFry.E_S);
        entries.add(StirFry.B_S);
        entries.add(StirFry.L_C_E);
        entries.add(StirFry.L_C_B);
        entries.add(StirFry.L_C_S);
        entries.add(StirFry.L_E_B);
        entries.add(StirFry.L_E_S);
        entries.add(StirFry.C_E_B);
        entries.add(StirFry.C_E_S);
        entries.add(StirFry.C_B_S);
        entries.add(StirFry.E_B_S);
        entries.add(StirFry.L_C_E_B);
        entries.add(StirFry.L_C_E_S);
        entries.add(StirFry.L_C_B_S);
        entries.add(StirFry.L_E_B_S);
        entries.add(StirFry.C_E_B_S);
        entries.add(StirFry.L_C_E_B_S);
        entries.add(StirFry.RICE_BOWL);
    }) .build());
    public static final ItemGroup CUPCAKE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(FoodExtras.MOD_ID, "cupcake_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.CMUF)).displayName(Text.translatable("itemgroup.foodextras.cupcake_items")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.RMUF);
                        entries.add(ModItems.CMUF);
                        entries.add(ModItems.BMUF);
                        entries.add(ModItems.BLMUF);
                        entries.add(ModItems.BRMUF);
                        entries.add(ModItems.GMUF);
                        entries.add(ModItems.GRMUF);
                        entries.add(ModItems.LBMUF);
                        entries.add(ModItems.LGMUF);
                        entries.add(ModItems.LMUF);
                        entries.add(ModItems.MMUF);
                        entries.add(ModItems.OMUF);
                        entries.add(ModItems.PMUF);
                        entries.add(ModItems.PUMUF);
                        entries.add(ModItems.REMUF);
                        entries.add(ModItems.WMUF);
                        entries.add(ModItems.YMUF);
                        entries.add(ModItems.CYMUF);
                        entries.add(ModItems.BCRM);
                        entries.add(ModItems.BLCRM);
                        entries.add(ModItems.BRCRM);
                        entries.add(ModItems.CYCRM);
                        entries.add(ModItems.GCRM);
                        entries.add(ModItems.GRCRM);
                        entries.add(ModItems.LBCRM);
                        entries.add(ModItems.LGCRM);
                        entries.add(ModItems.LCRM);
                        entries.add(ModItems.MCRM);
                        entries.add(ModItems.OCRM);
                        entries.add(ModItems.PCRM);
                        entries.add(ModItems.PUCRM);
                        entries.add(ModItems.RECRM);
                        entries.add(ModItems.WCRM);
                        entries.add(ModItems.YCRM);
                    }).build());
    public static final ItemGroup PIZZA_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(FoodExtras.MOD_ID, "pizza_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.PSLICE)).displayName(Text.translatable("itemgroup.foodextras.pizza_items")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.KETCHUP);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.PEPERONI);
                        entries.add(ModItems.RPIZ);
                        entries.add(ModItems.DOUGH);
                        entries.add(ModItems.PIZZA);
                        entries.add(ModItems.PSLICE);
                    }).build());
    public static final ItemGroup CHOCOLATE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(FoodExtras.MOD_ID, "chocolate_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.PURE)).displayName(Text.translatable("itemgroup.foodextras.chocolate_items")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.COCA);
                        entries.add(ModItems.PURE);
                        entries.add(ModItems.MILK);
                        entries.add(ModItems.WHITE);
                    }).build());
    public static final ItemGroup REST = Registry.register(Registries.ITEM_GROUP, Identifier.of(FoodExtras.MOD_ID, "rest"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.KNIFE)).displayName(Text.translatable("itemgroup.foodextras.rest")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.KNIFE);
                    }).build());


    public static void registerItemGroups() {
        FoodExtras.LOGGER.info("Registering Item Groups For "+ FoodExtras.MOD_ID);
    }
}

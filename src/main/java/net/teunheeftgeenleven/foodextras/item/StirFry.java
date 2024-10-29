package net.teunheeftgeenleven.foodextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.teunheeftgeenleven.foodextras.FoodExtras;

public class StirFry{

    public static final Item L = registerItem("l", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));
    public static final Item C = registerItem("c", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));
    public static final Item E = registerItem("e", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));
    public static final Item B = registerItem("b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));
    public static final Item S = registerItem("s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));
    public static final Item L_C = registerItem("l_c", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item L_E = registerItem("l_e", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item L_B = registerItem("l_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item L_S = registerItem("l_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item C_E = registerItem("c_e", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item C_B = registerItem("c_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item C_S = registerItem("c_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item E_B = registerItem("e_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item E_S = registerItem("e_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item B_S = registerItem("b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T2)));
    public static final Item L_C_E = registerItem("l_c_e", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item L_C_B = registerItem("l_c_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item L_C_S = registerItem("l_c_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item L_E_B = registerItem("l_e_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item L_E_S = registerItem("l_e_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item C_E_B = registerItem("c_e_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item C_E_S = registerItem("c_e_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item C_B_S = registerItem("c_b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item E_B_S = registerItem("e_b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T3)));
    public static final Item L_C_E_B = registerItem("l_c_e_b", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T4)));
    public static final Item L_C_E_S = registerItem("l_c_e_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T4)));
    public static final Item L_C_B_S = registerItem("l_c_b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T4)));
    public static final Item L_E_B_S = registerItem("l_e_b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T4)));
    public static final Item C_E_B_S = registerItem("c_e_b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T4)));
    public static final Item L_C_E_B_S = registerItem("l_c_e_b_s", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T5)));
    public static final Item RICE_BOWL = registerItem("rice_bowl", new Item(new Item.Settings().food(ModFoodComponents.STIR_FRY_T1)));





    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, new Identifier(FoodExtras.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FoodExtras.LOGGER.info("Registering mod items for " + FoodExtras.MOD_ID);
    }
}
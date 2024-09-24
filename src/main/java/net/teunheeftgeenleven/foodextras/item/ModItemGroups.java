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



    public static void registerItemGroups() {
        FoodExtras.LOGGER.info("Registering Item Groups For "+ FoodExtras.MOD_ID);
    }
}

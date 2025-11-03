package net.teunheeftgeenleven.foodextras.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public  static final FoodComponent PURE = new FoodComponent.Builder().nutrition(2).snack().saturationModifier(5.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100), 0.10f).build();
    public  static final FoodComponent MILK = new FoodComponent.Builder().nutrition(2).snack()
            .saturationModifier(5.0f).build();
    public static final FoodComponent WHITE = new FoodComponent.Builder().nutrition(2).snack().saturationModifier(5.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100), 0.10f).build();
    public static final FoodComponent CMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public static final FoodComponent MUFFIN = new FoodComponent.Builder().nutrition(4).saturationModifier(2.5f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(2).saturationModifier(1.0f).build();
    public static final FoodComponent PEPERONI = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public static final FoodComponent PSLICE = new FoodComponent.Builder().nutrition(6).saturationModifier(6.0f).build();
    public static final FoodComponent STIR_FRY_T0 = new FoodComponent.Builder().nutrition(2).saturationModifier(1.0f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent STIR_FRY_T1 = new FoodComponent.Builder().nutrition(2).saturationModifier(1.5f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent STIR_FRY_T2 = new FoodComponent.Builder().nutrition(3).saturationModifier(2.3f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent STIR_FRY_T3 = new FoodComponent.Builder().nutrition(5).saturationModifier(3.5f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent STIR_FRY_T4 = new FoodComponent.Builder().nutrition(8).saturationModifier(5.3f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent STIR_FRY_T5 = new FoodComponent.Builder().nutrition(12).saturationModifier(8.0f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent SUSHI = new FoodComponent.Builder().nutrition(5).saturationModifier(4.0f).build();
    public static final FoodComponent DOGHNUT = new FoodComponent.Builder().nutrition(5).saturationModifier(4.0f).build();
    public static final FoodComponent BREAD = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().nutrition(2).saturationModifier(1.0f).build();
    public static final FoodComponent T2_TOAST = new FoodComponent.Builder().nutrition(3).saturationModifier(1.5f).build();
    public static final FoodComponent T3_TOAST = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public static final FoodComponent VEGGIE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent CUBE = new FoodComponent.Builder().nutrition(3).saturationModifier(2.5f).build();
    public static final FoodComponent TACO = new FoodComponent.Builder().nutrition(5).saturationModifier(3.5f).build();
    public static final FoodComponent FRUIT = new FoodComponent.Builder().nutrition(1).saturationModifier(3.0f).build();
    public static final FoodComponent B_AND_E = new FoodComponent.Builder().nutrition(3).saturationModifier(3.0f).build();
    public static final FoodComponent SMOOTIE = new FoodComponent.Builder().nutrition(2).saturationModifier(4.5f).build();
    public static final FoodComponent BURGER = new FoodComponent.Builder().nutrition(4).saturationModifier(4.5f).build();
    public static final FoodComponent CHOCO = new FoodComponent.Builder().nutrition(2).saturationModifier(2.5f).build();
    public static final FoodComponent BACON = new FoodComponent.Builder().nutrition(2).saturationModifier(2.5f).build();
    public static final FoodComponent EGG = new FoodComponent.Builder().nutrition(2).saturationModifier(2.5f).build();
    public static final FoodComponent FRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(2.5f).build();
    public static final FoodComponent PANCAKE = new FoodComponent.Builder().nutrition(2).saturationModifier(2.5f).build();
    public static final FoodComponent SAUSAGE = new FoodComponent.Builder().nutrition(2).saturationModifier(2.5f).build();
    public static final FoodComponent HOTDOG = new FoodComponent.Builder().nutrition(2).saturationModifier(3.0f).build();
    public static final FoodComponent CONE = new FoodComponent.Builder().nutrition(4).saturationModifier(2.5f).build();
    public static final FoodComponent I_AND_S_CAKE = new FoodComponent.Builder().nutrition(6).saturationModifier(4.5f).build();
    public static final FoodComponent JUICE = new FoodComponent.Builder().nutrition(1).saturationModifier(5.0f).build();
    public static final FoodComponent SPAGHETTI = new FoodComponent.Builder().nutrition(3).saturationModifier(2.5f).build();
    public static final FoodComponent SPAGHETTI_MEAT = new FoodComponent.Builder().nutrition(4).saturationModifier(3.5f).build();
    public static final FoodComponent STRACCIATELLA = new FoodComponent.Builder().nutrition(3).saturationModifier(4.5f).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(4.5f).build();
    public static final FoodComponent SYRUP = new FoodComponent.Builder().nutrition(0).saturationModifier(6.5f).build();
    public static final FoodComponent KETCHUP = createStew(2).build();
    public static final FoodComponent MUSTARD = createStew(2).build();



    private static FoodComponent.Builder createStew(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.6F);
    }

}

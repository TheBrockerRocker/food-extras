package net.teunheeftgeenleven.foodextras.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public  static final FoodComponent PURE = new FoodComponent.Builder().nutrition(2).snack().saturationModifier(5.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100), 0.10f).build();
    public  static final FoodComponent MILK = new FoodComponent.Builder().nutrition(2).snack()
            .saturationModifier(5.0f).build();
    public  static final FoodComponent WHITE = new FoodComponent.Builder().nutrition(2).snack().saturationModifier(5.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100), 0.10f).build();
    public  static final FoodComponent CMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent BMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent BLMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent BRMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent CYMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent GMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent GRMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent LBMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent LGMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent LMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent MMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent OMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent PMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent PUMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent REMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();
    public  static final FoodComponent WMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(2.0f).build();
    public  static final FoodComponent YMUF = new FoodComponent.Builder().nutrition(4).saturationModifier(3.0f).build();

}

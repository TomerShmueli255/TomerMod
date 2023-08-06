package net.tomer.tutorialmod.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomer.tutorialmod.TutorialMod;
import net.tomer.tutorialmod.base.ModArmorMaterial;
import net.tomer.tutorialmod.block.ModBlocks;

import javax.tools.Tool;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));


    public static final RegistryObject<SwordItem> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ToolTiers.ZIRCON, 5, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ShovelItem> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ToolTiers.ZIRCON, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<PickaxeItem> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ToolTiers.ZIRCON, 2, 2.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<AxeItem> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(ToolTiers.ZIRCON, 3, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<HoeItem> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(ToolTiers.ZIRCON, 0, 0, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<ArmorItem> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static class ToolTiers {
        public static final Tier ZIRCON = new ForgeTier(
                3,
                800,
                1.5f,
                3,
                350,
                null,
                () -> Ingredient.of(ModItems.ZIRCON.get()));
    }





    public static class ArmorTiers {
        public static final ArmorMaterial ZIRCON = new ModArmorMaterial(
                "zircon",
                500,
                new int[] { 20, 40, 50, 10 },
                300,
                SoundEvents.ARMOR_EQUIP_IRON,
                1.0f,
                1.0f,
                () -> Ingredient.of(ModItems.ZIRCON.get())
        );
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

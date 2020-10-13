package Keioshiri.Konstantin.FantasyCube.util;

import Keioshiri.Konstantin.FantasyCube.FantasyCubeMod;
import Keioshiri.Konstantin.FantasyCube.armor.ModArmorMaterial;
import Keioshiri.Konstantin.FantasyCube.blocks.BlockItemBase;
import Keioshiri.Konstantin.FantasyCube.blocks.TitanBlock;
import Keioshiri.Konstantin.FantasyCube.items.ItemBase;
import Keioshiri.Konstantin.FantasyCube.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;




public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FantasyCubeMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,FantasyCubeMod.MOD_ID);

        public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        }
        // Предметы
            public static final RegistryObject<Item> TITAN = ITEMS.register("titan", ItemBase::new);
            public static final RegistryObject<Item> TITAN_ORE = ITEMS.register("titan_ore", ItemBase::new);

        // Инструменты
            public static final RegistryObject<SwordItem> TITAN_SWORD = ITEMS.register("titan_sword", () ->
                new SwordItem(ModItemTier.TITAN, 5, -3.0F, new Item.Properties().group(FantasyCubeMod.TAB)));

            public static final RegistryObject<PickaxeItem> TITAN_PICKAXE = ITEMS.register("titan_pickaxe", () ->
                new PickaxeItem(ModItemTier.TITAN, 0, -2.8F, new Item.Properties().group(FantasyCubeMod.TAB)));

            //  Броня предметом

            public static final RegistryObject<ArmorItem> TITAN_HELMET = ITEMS.register("titan_armor_head", () ->
                    new ArmorItem(ModArmorMaterial.TITAN, EquipmentSlotType.HEAD, new Item.Properties().group(FantasyCubeMod.TAB)));

            public static final RegistryObject<ArmorItem> TITAN_CHESTPLATE = ITEMS.register("titan_armor_chestplate", () ->
                    new ArmorItem(ModArmorMaterial.TITAN, EquipmentSlotType.CHEST, new Item.Properties().group(FantasyCubeMod.TAB)));

            public static final RegistryObject<ArmorItem> TITAN_LEGGINGS = ITEMS.register("titan_armor_leggings", () ->
                    new ArmorItem(ModArmorMaterial.TITAN, EquipmentSlotType.LEGS, new Item.Properties().group(FantasyCubeMod.TAB)));

            public static final RegistryObject<ArmorItem> TITAN_BOOTS = ITEMS.register("titan_armor_boots", () ->
                    new ArmorItem(ModArmorMaterial.TITAN, EquipmentSlotType.FEET, new Item.Properties().group(FantasyCubeMod.TAB)));
        // Блоки
            public static final RegistryObject<Block> TITAN_BLOCK = BLOCKS.register("titan_block", TitanBlock::new);
            public static final RegistryObject<Block> TITAN_ORE_BLOCK = BLOCKS.register("titan_ore_block", TitanBlock::new);

        //Блоки предметом
            public static final RegistryObject<Item> TITAN_BLOCK_ITEM =  ITEMS.register("titan_block", () -> new BlockItemBase(TITAN_BLOCK.get()));
            public static final RegistryObject<Item> TITAN_ORE_BLOCK_ITEM = ITEMS.register("titan_ore_block", () -> new BlockItemBase(TITAN_ORE_BLOCK.get()));
}

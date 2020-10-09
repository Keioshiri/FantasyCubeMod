package Keioshiri.Konstantin.FantasyCube.util;

import Keioshiri.Konstantin.FantasyCube.FantasyCubeMod;
import Keioshiri.Konstantin.FantasyCube.blocks.BlockItemBase;
import Keioshiri.Konstantin.FantasyCube.blocks.TitanBlock;
import Keioshiri.Konstantin.FantasyCube.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

        // Блоки
            public static final RegistryObject<Block> TITAN_BLOCK = BLOCKS.register("titan_block", TitanBlock::new);

        //Блоки предметом
            public static final RegistryObject<Item> TITAN_BLOCK_ITEM =  ITEMS.register("titan_block", () -> new BlockItemBase(TITAN_BLOCK.get()));
}

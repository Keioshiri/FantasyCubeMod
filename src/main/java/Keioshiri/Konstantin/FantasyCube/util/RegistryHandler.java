package Keioshiri.Konstantin.FantasyCube.util;

import Keioshiri.Konstantin.FantasyCube.FantasyCubeMod;
import Keioshiri.Konstantin.FantasyCube.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FantasyCubeMod.MOD_ID);

        public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        }
        // Предметы
            public static final RegistryObject<Item> TITAN = ITEMS.register("titan", ItemBase::new);

}

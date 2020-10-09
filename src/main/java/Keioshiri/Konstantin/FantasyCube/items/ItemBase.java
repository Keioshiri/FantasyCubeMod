package Keioshiri.Konstantin.FantasyCube.items;


import Keioshiri.Konstantin.FantasyCube.FantasyCubeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(FantasyCubeMod.TAB));
    }
}

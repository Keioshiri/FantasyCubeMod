package Keioshiri.Konstantin.FantasyCube.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitanBlock extends Block {
    public TitanBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(18.2f, 10.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3) // 1 Дерево 2 камень 3 железо 4 алмаз
                .harvestTool(ToolType.PICKAXE)

        );
    }
}

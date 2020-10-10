package Keioshiri.Konstantin.FantasyCube.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitanOreBlock extends Block {
    public TitanOreBlock() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(18.2f, 10.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3) // 1 Дерево 2 камень 3 железо 4 алмаз
                .harvestTool(ToolType.PICKAXE)

        );
    }
}

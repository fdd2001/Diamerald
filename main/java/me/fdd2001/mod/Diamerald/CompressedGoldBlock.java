package me.fdd2001.mod.Diamerald;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CompressedGoldBlock extends Block{

	public CompressedGoldBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(DiameraldMod.tabDiamerald);
		setHardness(3F);
		setResistance(7.0F);
		setHarvestLevel("pickaxe", 2);
	}
}

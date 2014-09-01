package me.fdd2001.mod.Diamerald;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ColoredWood extends Block{

	protected ColoredWood(int id,Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(DiameraldMod.tabDiamerald);
		setHardness(2.0F);
		setResistance(7.0F);
		setStepSound(Block.soundTypeWood);
	}
	
}

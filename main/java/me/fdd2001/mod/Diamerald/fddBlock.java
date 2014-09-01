package me.fdd2001.mod.Diamerald;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class fddBlock extends Block{

	protected fddBlock(int id,Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(DiameraldMod.tabDiamerald);
		setHardness(2.0F);
		setResistance(7.0F);
		setStepSound(Block.soundTypeStone);
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9) {
		world.setBlock(x, y, z, Blocks.diamond_ore);
		world.playSoundAtEntity(entityPlayer, (DiameraldMod.MODID + ":orb"), 1F, 0F);
		return false;
	}
	
}

package me.fdd2001.mod.Diamerald;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class RadioBlock extends Block{

	protected RadioBlock(int id,Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(DiameraldMod.tabDiamerald);
		setHardness(2.0F);
		setResistance(7.0F);
		setStepSound(Block.soundTypeStone);
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9) {
		Random rnd = new Random();
		int random = rnd.nextInt(4);
		if (random == 0) {
			world.setBlock(x, y, z, Blocks.diamond_ore);
		}
		else if (random == 1) {
			world.setBlock(x, y, z, Blocks.redstone_ore);
		}
		else if (random == 2) {
			world.setBlock(x, y, z, Blocks.iron_ore);
		}
		else if (random == 3) {
			world.setBlock(x, y, z, Blocks.gold_ore);
		}
		else if (random == 4) {
			world.setBlock(x, y, z, Blocks.dirt);
		}
		world.playSoundAtEntity(entityPlayer, (DiameraldMod.MODID + ":orb"), 1F, 1F);
		return false;
	}
	
}

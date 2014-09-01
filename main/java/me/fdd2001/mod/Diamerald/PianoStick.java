package me.fdd2001.mod.Diamerald;

import scala.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PianoStick extends Item {
	public PianoStick () {
		
	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int par7, float par8, float par9, float par10) {
		Random rdm = new Random();
		int rndint = rdm.nextInt(10);
		float pitch = rndint;
		par3World.playSoundAtEntity(par2EntityPlayer, DiameraldMod.MODID + ":piano", 1F, pitch);
		return true;
	}
}
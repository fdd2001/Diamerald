package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CreeperWand extends Item {
	public CreeperWand () {
		this.setMaxDamage(40);
	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int par7, float par8, float par9, float par10) {
	  if(!par3World.isRemote) {
		  Item item = par1ItemStack.getItem();
		  par3World.createExplosion( null, x, y, z, 1F, true);
		  
		  Item itm = par1ItemStack.getItem();
		  int dur = itm.getDamage(par1ItemStack);
		  dur = dur + 1;
		  itm.setDamage(par1ItemStack, dur);
		  return true;
	  } 
	  else return false;
	}
}
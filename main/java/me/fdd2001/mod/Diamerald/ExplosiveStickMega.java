package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ExplosiveStickMega extends Item {
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int par7, float par8, float par9, float par10) {
	  if(!par3World.isRemote) {
		  par3World.createExplosion(null, x, y, z, 70F, true);
		  par3World.createExplosion(null, x, y-10, z, 70F, true);
		  par3World.createExplosion(null, x, y-20, z, 70F, true);
		  Item itm = par1ItemStack.getItem();
		  int dur = itm.getDamage(par1ItemStack);
		  dur = dur + 1;
		  itm.setDamage(par1ItemStack, dur);
		  return true;
	  } 
	  else return false;
	}
}
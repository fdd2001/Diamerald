package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BurntFood extends ItemFood{

	public BurntFood(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setCreativeTab(DiameraldMod.tabDiamerald);
	}
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.confusion.id,500,1));
		player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id,500,1));
		player.addPotionEffect(new PotionEffect(Potion.hunger.id,500,2));
		player.addPotionEffect(new PotionEffect(Potion.poison.id,500,1));
	}
}

package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CookedRedstone extends ItemFood{

	public CookedRedstone(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setCreativeTab(DiameraldMod.tabDiamerald);
	}
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addExperienceLevel(1);
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id,500,2)); //Effect, Duration, Amp
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id,500,2));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,500,2));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id,500,2));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,500,1));
	}

}

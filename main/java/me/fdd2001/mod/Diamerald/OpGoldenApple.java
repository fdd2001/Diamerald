package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class OpGoldenApple extends ItemFood{

	public OpGoldenApple(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setCreativeTab(DiameraldMod.tabDiamerald);
	}
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addExperienceLevel(10);
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id,5000,5)); //Effect, Duration, Amp
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id,5000,5));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,5000,4));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id,5000,3));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,5000,1));
	}

}

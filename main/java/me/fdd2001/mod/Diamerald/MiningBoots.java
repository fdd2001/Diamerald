package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MiningBoots extends ItemArmor{

	public MiningBoots(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(DiameraldMod.tabDiamerald);

		if (placement == 0) {
			this.setTextureName(DiameraldMod.MODID + ":" + "mining_helmet");
		}
		else if (placement == 1) {
			this.setTextureName(DiameraldMod.MODID + ":" + "mining_chestplate");
		}
		else if (placement == 2) {
			this.setTextureName(DiameraldMod.MODID + ":" + "mining_leggings");
		}
		else if (placement == 3) {
			this.setTextureName(DiameraldMod.MODID + ":" + "mining_boots");
		}
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == DiameraldMod.miningBoots) {
			return DiameraldMod.MODID + ":" + "textures/models/armor/mining_layer_1.png";
		}
		else {
			return null;
		}
	}
	@Override
	public void onArmorTick(World world,EntityPlayer player,ItemStack stack) {
		if (player.getCurrentArmor(0) != null) {
			ItemStack boots = player.getCurrentArmor(0);
			if (boots.getItem() == DiameraldMod.miningBoots) {
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(),100,2));
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(),100));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(),100,2));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),100));
			}
		}
	}

}

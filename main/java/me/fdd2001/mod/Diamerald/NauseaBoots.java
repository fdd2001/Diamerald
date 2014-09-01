package me.fdd2001.mod.Diamerald;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class NauseaBoots extends ItemArmor{

	public NauseaBoots(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(DiameraldMod.tabDiamerald);

		if (placement == 0) {
			this.setTextureName(DiameraldMod.MODID + ":" + "nausea_helmet");
		}
		else if (placement == 1) {
			this.setTextureName(DiameraldMod.MODID + ":" + "nausea_chestplate");
		}
		else if (placement == 2) {
			this.setTextureName(DiameraldMod.MODID + ":" + "nausea_leggings");
		}
		else if (placement == 3) {
			this.setTextureName(DiameraldMod.MODID + ":" + "nausea_boots");
		}
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == DiameraldMod.nauseaBoots) {
			return DiameraldMod.MODID + ":" + "textures/models/armor/nausea_layer_1.png";
		}
		else {
			return null;
		}
	}
	@Override
	public void onArmorTick(World world,EntityPlayer player,ItemStack stack) {
		if (player.getCurrentArmor(0) != null) {
			ItemStack boots = player.getCurrentArmor(0);
			if (boots.getItem() == DiameraldMod.nauseaBoots) {
				player.addPotionEffect(new PotionEffect(Potion.confusion.getId(),100));
			}
		}
	}

}

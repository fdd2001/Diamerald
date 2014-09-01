package me.fdd2001.mod.Diamerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class UltimateArmor extends ItemArmor{

	public UltimateArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(DiameraldMod.tabDiamerald);
		
		if (placement == 0) {
			this.setTextureName(DiameraldMod.MODID + ":" + "op_helmet");
		}
		else if (placement == 1) {
			this.setTextureName(DiameraldMod.MODID + ":" + "op_chestplate");
		}
		else if (placement == 2) {
			this.setTextureName(DiameraldMod.MODID + ":" + "op_leggings");
		}
		else if (placement == 3) {
			this.setTextureName(DiameraldMod.MODID + ":" + "op_boots");
		}
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == DiameraldMod.ultimateHelmet || stack.getItem() == DiameraldMod.ultimateChestplate || stack.getItem() == DiameraldMod.ultimateBoots) {
			return DiameraldMod.MODID + ":" + "textures/models/armor/op_layer_1.png";
		}
		if (stack.getItem() == DiameraldMod.ultimateLeggings) {
			return DiameraldMod.MODID + ":" + "textures/models/armor/op_layer_2.png";
		}
		else {
			return null;
		}
	}
}

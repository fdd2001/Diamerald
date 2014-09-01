package me.fdd2001.mod.Diamerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DiameraldArmor extends ItemArmor{

	public DiameraldArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(DiameraldMod.tabDiamerald);
		
		if (placement == 0) {
			this.setTextureName(DiameraldMod.MODID + ":" + "diamerald_helmet");
		}
		else if (placement == 1) {
			this.setTextureName(DiameraldMod.MODID + ":" + "diamerald_chestplate");
		}
		else if (placement == 2) {
			this.setTextureName(DiameraldMod.MODID + ":" + "diamerald_leggings");
		}
		else if (placement == 3) {
			this.setTextureName(DiameraldMod.MODID + ":" + "diamerald_boots");
		}
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == DiameraldMod.diameraldHelmet || stack.getItem() == DiameraldMod.diameraldChestplate || stack.getItem() == DiameraldMod.diameraldBoots) {
			return DiameraldMod.MODID + ":" + "textures/models/armor/diamerald_layer_1.png";
		}
		if (stack.getItem() == DiameraldMod.diameraldLeggings) {
			return DiameraldMod.MODID + ":" + "textures/models/armor/diamerald_layer_2.png";
		}
		else {
			return null;
		}
	}
}

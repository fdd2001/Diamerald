package me.fdd2001.mod.Diamerald;

import net.minecraft.item.ItemFood;

public class Food extends ItemFood{

	public Food(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setCreativeTab(DiameraldMod.tabDiamerald);
	}

}

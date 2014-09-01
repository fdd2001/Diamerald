package me.fdd2001.mod.Diamerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabDiamerald extends CreativeTabs {

	public tabDiamerald(int arg0, String arg1) {
		super(arg0, arg1);
		
	}

	@Override
	public Item getTabIconItem() {
		return DiameraldMod.diamerald;
	}

}

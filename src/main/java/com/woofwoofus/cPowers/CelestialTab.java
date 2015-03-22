package com.woofwoofus.cPowers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.woofwoofus.cPowers.init.CelestialItems;

public class CelestialTab extends CreativeTabs {

	public CelestialTab(String label) {
		super(label);
		this.setBackgroundImageName("celestial.png");
	}

	@Override
	public Item getTabIconItem() {
		return CelestialItems.c_orb;
	}

}

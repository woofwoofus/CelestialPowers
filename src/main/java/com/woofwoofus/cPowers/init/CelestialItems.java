package com.woofwoofus.cPowers.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.woofwoofus.cPowers.CelestialPowers;
import com.woofwoofus.cPowers.Reference;
import com.woofwoofus.cPowers.items.ItemCelestialOrb;

public class CelestialItems {
	public static Item c_orb;

	public static void init() {
		c_orb = new ItemCelestialOrb().setUnlocalizedName("c_orb").setCreativeTab(
				CelestialPowers.tabCelestial);
	}

	public static void register() {
		GameRegistry.registerItem(c_orb, c_orb.getUnlocalizedName()
				.substring(5));
	}

	public static void registerRenders() {
		registerRender(c_orb);
	}

	public static void registerRender(Item item) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MOD_ID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}

}

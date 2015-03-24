package com.woofwoofus.cPowers.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.woofwoofus.cPowers.CelestialPowers;
import com.woofwoofus.cPowers.Reference;
import com.woofwoofus.cPowers.blocks.BlockcPowers;
import com.woofwoofus.cPowers.blocks.BlockLunarFurnace;

public class CelestialBlocks {

	public static Block c_block;
	public static Block Lunar_Furnace;

	public static void init() {
		c_block = new BlockcPowers(Material.iron).setUnlocalizedName("c_block")
				.setCreativeTab(CelestialPowers.tabCelestial);
		Lunar_Furnace = new BlockLunarFurnace().setUnlocalizedName(
				"Lunar_Furnace").setCreativeTab(CelestialPowers.tabCelestial);
	}

	public static void register() {
		GameRegistry.registerBlock(c_block, c_block.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerBlock(Lunar_Furnace, Lunar_Furnace
				.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(c_block);
		registerRender(Lunar_Furnace);
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
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

package com.woofwoofus.cPowers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.woofwoofus.cPowers.init.CelestialBlocks;
import com.woofwoofus.cPowers.init.CelestialItems;
import com.woofwoofus.cPowers.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class CelestialPowers {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CelestialTab tabCelestial = new CelestialTab("tabCelestial");
	
	@Mod.Instance(Reference.MOD_ID)
	public static CelestialPowers instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		CelestialBlocks.init();
		CelestialBlocks.register();
		CelestialItems.init();
		CelestialItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		GameRegistry.addRecipe(new ItemStack(CelestialItems.c_orb), new Object[]{"IPI",
			                                                                     "PGP",
			                                                                     "IPI",
			                                                                     'I',Items.iron_ingot,
			                                                                     'P',Blocks.glass_pane,
			                                                                     'G',Items.gold_ingot});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}

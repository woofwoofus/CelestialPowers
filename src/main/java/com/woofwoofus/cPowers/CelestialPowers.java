package com.woofwoofus.cPowers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}

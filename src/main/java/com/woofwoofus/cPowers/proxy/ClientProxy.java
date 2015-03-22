package com.woofwoofus.cPowers.proxy;

import com.woofwoofus.cPowers.init.CelestialBlocks;
import com.woofwoofus.cPowers.init.CelestialItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		CelestialBlocks.registerRenders();
		CelestialItems.registerRenders();
	}
}

package net.swutm.cookedapplea;

import net.fabricmc.api.ModInitializer;
import net.swutm.cookedapplea.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class cookedapplea implements ModInitializer {
	public static final String MOD_ID = "cookedapplea";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

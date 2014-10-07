package com.unprogrammatore.testmod.utility;

import net.minecraftforge.common.config.Configuration;

import com.unprogrammatore.testmod.values.ConfigValues;
import com.unprogrammatore.testmod.values.ModInfo;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigLoader {
	
	public static Configuration cfg;
	
	public static void init(File f) {
		cfg = new Configuration(f);
		try {
			cfg.load();
		}
		catch(Exception E) {
			// TODO Add log
		}
		load();
		if(cfg.hasChanged())
			cfg.save();
	}
	
	private static void load() {
		ConfigValues.howManyTimes = cfg.getInt("howManyTimes", "testcategory", 3, 0, 100, "How many times...");
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals(ModInfo.MOD_ID)) {
            load();
            if(cfg.hasChanged())
    			cfg.save();
		}
	}
	
}
package com.unprogrammatore.testmod.utility;

import net.minecraftforge.common.config.Configuration;

import com.unprogrammatore.testmod.values.ConfigValues;

import java.io.File;

public class ConfigLoader {
	public static ConfigValues load(File f) {
		Configuration cfg = new Configuration(f);
		ConfigValues toret = new ConfigValues();
		try {
			cfg.load();

			toret.howManyTimes = cfg.getInt("howManyTimes", "TestCategory", 3, 0, 100, "How many times...");
		}
		catch(Exception E) {
			// Adding log
		}
		finally {
			cfg.save();
		}
		return toret;
	}
}
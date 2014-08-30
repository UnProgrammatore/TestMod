package com.unprogrammatore.testmod.utility;

import net.minecraftforge.common.config.Configuration;

import com.unprogrammatore.testmod.values.ConfigValues;

import java.io.File;

public class ConfigLoader {
	public static void load(File f) {
		Configuration cfg = new Configuration(f);
		try {
			cfg.load();

			ConfigValues.howManyTimes = cfg.getInt("howManyTimes", "TestCategory", 3, 0, 100, "How many times...");
		}
		catch(Exception E) {
			// Add log
		}
		finally {
			cfg.save();
		}
	}
}
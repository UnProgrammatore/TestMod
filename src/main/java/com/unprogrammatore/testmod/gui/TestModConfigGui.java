package com.unprogrammatore.testmod.gui;

import com.unprogrammatore.testmod.utility.ConfigLoader;
import com.unprogrammatore.testmod.values.ModInfo;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;

public class TestModConfigGui extends GuiConfig {
	public TestModConfigGui(GuiScreen parent) {
		super(parent, new ConfigElement(ConfigLoader.cfg.getCategory("testcategory")).getChildElements(), "TestMod", false, false, ModInfo.MOD_NAME);
	}
}

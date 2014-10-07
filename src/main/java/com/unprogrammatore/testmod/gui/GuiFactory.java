package com.unprogrammatore.testmod.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// CURRENTLY UNUSED

	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return TestModConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		//  CURRENTLY UNUSED
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
		//  CURRENTLY UNUSED
		return null;
	}

}

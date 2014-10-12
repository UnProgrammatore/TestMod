package com.unprogrammatore.testmod.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item diamondDagger;
	
	public static void init() {
		diamondDagger = new ItemDiamondDagger();
		GameRegistry.registerItem(diamondDagger, "diamondDagger");
	}
}

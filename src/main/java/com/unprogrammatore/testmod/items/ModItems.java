package com.unprogrammatore.testmod.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final Item diamondDagger = new ItemDiamondDagger();
	
	public static void init() {
		GameRegistry.registerItem(diamondDagger, "diamondDagger");
	}
}

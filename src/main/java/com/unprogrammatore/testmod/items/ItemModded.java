package com.unprogrammatore.testmod.items;

import com.unprogrammatore.testmod.utility.Logger;
import com.unprogrammatore.testmod.values.ModInfo;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemModded extends Item {
	
	public ItemModded() {
		setMaxStackSize(1);
	}
	
	@Override
	public String getUnlocalizedName() {
		String unlocalizedName = super.getUnlocalizedName();
		return "item." + ModInfo.MOD_ID.toLowerCase()  + ":" + unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack is) {
		return getUnlocalizedName();
	}
	
}

package com.unprogrammatore.testmod.items;

import com.unprogrammatore.testmod.utility.Logger;
import com.unprogrammatore.testmod.values.ModInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
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
	
	@Override
	public Item setUnlocalizedName(String name) {
		GameRegistry.registerItem(this, name);
		return super.setUnlocalizedName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iReg) {
		String unlocalizedName = getUnlocalizedName();
		this.itemIcon = iReg.registerIcon(unlocalizedName.replaceAll("item\\.", ""));
	}
	
}

package com.unprogrammatore.testmod;

import com.unprogrammatore.testmod.items.ModItems;
import com.unprogrammatore.testmod.proxy.*;
import com.unprogrammatore.testmod.values.*;
import com.unprogrammatore.testmod.utility.*;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

import java.io.File;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION, guiFactory = ModInfo.GUI_FACTORY)
public class TestMod {
	
	@Mod.Instance(ModInfo.MOD_ID)
	public static TestMod inst;

	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		File configFile = event.getSuggestedConfigurationFile();
		ConfigLoader.init(configFile);

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		FMLCommonHandler.instance().bus().register(new ConfigLoader());
		ModItems.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		int i;
		for(i = 0; i < ConfigValues.howManyTimes; i++) {
			System.out.print("knock ");
		}
		System.out.println("Penny!");
		Logger.info("Just printed out something");
	}
}
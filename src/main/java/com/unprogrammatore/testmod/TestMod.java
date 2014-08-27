package com.unprogrammatore.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "TestMod", name = "Test Mod", version="1.7.10-1.0")
public class TestMod {
	
	@Mod.Instance("TestMod")
	public static TestMod inst;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("anacleto");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event){

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
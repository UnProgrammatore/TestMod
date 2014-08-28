package com.unprogrammatore.testmod;

import com.unprogrammatore.testmod.proxy.*;
import com.unprogrammatore.testmod.values.*;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION)
public class TestMod {
	
	@Mod.Instance("TestMod")
	public static TestMod inst;

	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event){

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
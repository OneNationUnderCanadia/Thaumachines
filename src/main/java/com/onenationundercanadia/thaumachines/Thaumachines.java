package com.onenationundercanadia.thaumachines;

import com.onenationundercanadia.thaumachines.handler.ConfigurationHandler;
import com.onenationundercanadia.thaumachines.init.ModBlocks;
import com.onenationundercanadia.thaumachines.init.ModItems;
import com.onenationundercanadia.thaumachines.init.Recipes;
import com.onenationundercanadia.thaumachines.proxy.IProxy;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import com.onenationundercanadia.thaumachines.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by OneNationUnderCanadia on 12/4/2014.
 */

@Mod(modid= Refrence.MOD_ID, name=Refrence.MOD_NAME, version=Refrence.VERSION, guiFactory = Refrence.GUI_FACTORY_CLASS)
public class Thaumachines {

    @Mod.Instance(Refrence.MOD_ID)
    public static Thaumachines instance;

    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre-initialization complete!");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        Recipes.init();
        LogHelper.info("Initialization complete!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post-initialization complete!");

    }

}

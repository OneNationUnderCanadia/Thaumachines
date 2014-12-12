package com.onenationundercanadia.thaumachines;

import com.onenationundercanadia.thaumachines.handler.ConfigurationHandler;
import com.onenationundercanadia.thaumachines.init.ModBlocks;
import com.onenationundercanadia.thaumachines.init.ModItems;
import com.onenationundercanadia.thaumachines.init.Recipes;
import com.onenationundercanadia.thaumachines.proxy.IProxy;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import com.onenationundercanadia.thaumachines.research.ResearchThaumachines;
import com.onenationundercanadia.thaumachines.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by OneNationUnderCanadia on 12/4/2014.
 * Main class, serves to initialize everything
 */

@Mod(modid= Refrence.MOD_ID, name=Refrence.MOD_NAME, version=Refrence.VERSION)
public class Thaumachines {

    // Creates a way to refrence your mod, prevents interference from other mods
    @Mod.Instance(Refrence.MOD_ID)
    public static Thaumachines instance;

    // Creates a proxy so that the server and client can better interact (CURRENTLY UNUSED)
    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    // First phase of initialization
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        // Loads config file
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        // Registers config file
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        // Registers all items and blocks
        ModItems.init();
        ModBlocks.init();

        // Puts a message into the log stating that PreInit is complete
        LogHelper.info("Pre-initialization complete!");

    }

    //Main init stage
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        // Registers recipes
        Recipes.init();

        // Puts a message into the log stating that Init is complete
        LogHelper.info("Initialization complete!");

    }

    // Final init stage
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        // Registers tabs into the Thaumonomicon
        ResearchThaumachines.registerTab();
        // Registers Thaumcraft Research
        ResearchThaumachines.putResearchInTab();

        // Puts a message into the log stating that PostInit is complete
        LogHelper.info("Post-initialization complete!");

    }

}

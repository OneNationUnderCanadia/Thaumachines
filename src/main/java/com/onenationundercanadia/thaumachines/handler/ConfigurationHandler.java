package com.onenationundercanadia.thaumachines.handler;

import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configfile) {

        if(configuration == null) {
            // Create configuration object from given config file
            configuration = new Configuration(configfile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

        if(event.modID.equalsIgnoreCase(Refrence.MOD_ID)) {
            // Resync configs
            loadConfiguration();
        }

    }

    private static void loadConfiguration() {

        testValue = configuration.getBoolean("testValue", Configuration.CATEGORY_GENERAL, false, "This is an example " +
                "config option");

        if(configuration.hasChanged()) {
            configuration.save();
        }

    }

}

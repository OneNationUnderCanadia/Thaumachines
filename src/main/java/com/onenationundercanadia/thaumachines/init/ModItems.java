package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.item.ItemReceptacleCore;
import com.onenationundercanadia.thaumachines.item.ItemThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// Class to register all items
@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ModItems {

    // Create all items as objects
    public static final ItemThaumachines receptacleCore = new ItemReceptacleCore();

    // Registers all items
    public static void init(){

        GameRegistry.registerItem(receptacleCore, "receptacleCore");

    }

}

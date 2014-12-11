package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.item.ItemReceptacleCore;
import com.onenationundercanadia.thaumachines.item.ItemThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ModItems {

    public static final ItemThaumachines receptacleCore = new ItemReceptacleCore();

    public static void init(){

        GameRegistry.registerItem(receptacleCore, "receptacleCore");

    }

}

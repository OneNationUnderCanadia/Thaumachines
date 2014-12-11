package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.item.ItemTestitem;
import com.onenationundercanadia.thaumachines.item.ItemThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ModItems {

    public static final ItemThaumachines testItem = new ItemTestitem();

    public static void init(){

        GameRegistry.registerItem(testItem, "testItem");

    }

}

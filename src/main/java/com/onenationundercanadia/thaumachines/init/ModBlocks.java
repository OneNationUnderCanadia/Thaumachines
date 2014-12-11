package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.block.BlockArcanePurifier;
import com.onenationundercanadia.thaumachines.block.BlockWandReceptacle;
import com.onenationundercanadia.thaumachines.block.BlockThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ModBlocks {

    public static final BlockThaumachines wandReceptacle = new BlockWandReceptacle();
    public static final BlockThaumachines arcanePurifier = new BlockArcanePurifier();

    public static void init() {

        GameRegistry.registerBlock(wandReceptacle, "wandReceptacle");
        GameRegistry.registerBlock(arcanePurifier, "arcanePurifier");

    }

}

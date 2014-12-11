package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.block.BlockTestBlock;
import com.onenationundercanadia.thaumachines.block.BlockThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Refrence.MOD_ID)
public class ModBlocks {

    public static final BlockThaumachines testBlock = new BlockTestBlock();

    public static void init() {

        GameRegistry.registerBlock(testBlock, "testBlock");

    }

}

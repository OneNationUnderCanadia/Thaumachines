package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.block.BlockArcanePurifier;
import com.onenationundercanadia.thaumachines.block.BlockWandReceptacle;
import com.onenationundercanadia.thaumachines.item.ItemReceptacleCore;

public class Recipes {

    public static void init() {

        BlockWandReceptacle.recipe();
        BlockArcanePurifier.recipe();
        ItemReceptacleCore.recipe();

    }

}

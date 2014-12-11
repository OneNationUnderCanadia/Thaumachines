package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.block.BlockWandReceptacle;
import com.onenationundercanadia.thaumachines.item.ItemReceptacleCore;

public class Recipes {

    public static void init() {

        ItemReceptacleCore.recipeShaped();

        BlockWandReceptacle.recipeShapeless();

    }

}

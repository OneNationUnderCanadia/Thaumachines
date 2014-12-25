package com.onenationundercanadia.thaumachines.init;

import com.onenationundercanadia.thaumachines.block.BlockArcanePurifier;
import com.onenationundercanadia.thaumachines.block.BlockWandReceptacle;
import com.onenationundercanadia.thaumachines.item.ItemReceptacleCore;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// Class to register all recipes
public class Recipes {

    // TODO: Add recipes as objects from this class

    // Registers all recipes
    public static void init() {

        BlockWandReceptacle.receptacleRecipe.registerRecipe();
        //BlockArcanePurifier.purifierRecipe.registerRecipe();
        ItemReceptacleCore.receptacleCoreRecipe.registerRecipe();

    }

}

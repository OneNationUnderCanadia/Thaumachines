package com.onenationundercanadia.thaumachines.block;

import com.onenationundercanadia.thaumachines.init.ModBlocks;
import com.onenationundercanadia.thaumachines.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

/**
 * Created by BJARK on 12/9/2014.
 */
public class BlockWandReceptacle extends BlockThaumachines {

    public BlockWandReceptacle() {

        super();
        this.setBlockName("wandReceptacle");

    }

    public static void recipeShapeless() {

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.wandReceptacle), "ff", "ff", 'f', new ItemStack(ModItems.receptacleCore));

    }

}

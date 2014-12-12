package com.onenationundercanadia.thaumachines.block;

import com.onenationundercanadia.thaumachines.init.ModBlocks;
import com.onenationundercanadia.thaumachines.init.ModItems;
import com.onenationundercanadia.thaumachines.utility.recipes.ThaumachinesArcaneRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

/**
 * Created by BJARK on 12/9/2014.
 */
public class BlockWandReceptacle extends BlockThaumachines {

    public static final AspectList RECEPTACLE_ASPECTS = new AspectList().add(Aspect.FIRE, 10).add(Aspect.AIR, 2).add(Aspect.ORDER, 10);

    public static ThaumachinesArcaneRecipe receptacleRecipe;

    public BlockWandReceptacle() {

        super();
        this.setBlockName("wandReceptacle");

    }

    public static void recipe() {

        receptacleRecipe = new ThaumachinesArcaneRecipe("wandReceptacle", "receptacle", new ItemStack(ModBlocks.wandReceptacle), RECEPTACLE_ASPECTS, " g ", "gcg", " g ", 'g', new ItemStack(Items.gold_ingot), 'c', new ItemStack(ModItems.receptacleCore));

    }

}

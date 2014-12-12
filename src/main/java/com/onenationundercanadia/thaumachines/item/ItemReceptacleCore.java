package com.onenationundercanadia.thaumachines.item;

import com.onenationundercanadia.thaumachines.init.ModItems;
import com.onenationundercanadia.thaumachines.refrence.RefrenceNames;
import com.onenationundercanadia.thaumachines.utility.recipes.ThaumachinesArcaneRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// Class for the Receptacle Core
public class ItemReceptacleCore extends ItemThaumachines {

    // Aspects to craft
    public static final AspectList RECEPTACLE_CORE_ASPECTS = new AspectList().add(Aspect.ORDER, 2).add(Aspect.AIR, 2);

    // Recipe object
    public static ThaumachinesArcaneRecipe receptacleCoreRecipe = new ThaumachinesArcaneRecipe("receptacleCore", "receptacles", new ItemStack(ModItems.receptacleCore), RECEPTACLE_CORE_ASPECTS, "isi", "s s", "isi", 's', new ItemStack(Items.stick), 'i', new ItemStack(Items.iron_ingot));;

    // Constructor
    public ItemReceptacleCore(){

        super();
        this.setUnlocalizedName(RefrenceNames.Items.RECEPTACLE_CORE);

    }

}

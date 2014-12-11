package com.onenationundercanadia.thaumachines.item;

import com.onenationundercanadia.thaumachines.init.ModItems;
import com.onenationundercanadia.thaumachines.refrence.RefrenceNames;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemReceptacleCore extends ItemThaumachines {

    public ItemReceptacleCore(){

        super();
        this.setUnlocalizedName(RefrenceNames.Items.RECEPTACLE_CORE);

    }

    public static void recipeShaped() {

        GameRegistry.addRecipe(new ItemStack(ModItems.receptacleCore), " f ", "fdf", " f ", 'f', new ItemStack(Items.stick), 'd', new ItemStack(Items.diamond));

    }

}

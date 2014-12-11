package com.onenationundercanadia.thaumachines.block;

import com.onenationundercanadia.thaumachines.init.ModBlocks;
import com.onenationundercanadia.thaumcraft.api.aspects.Aspect;
import com.onenationundercanadia.thaumcraft.api.aspects.AspectList;
import com.onenationundercanadia.thaumcraft.api.crafting.ShapedArcaneRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockArcanePurifier extends BlockThaumachines {

    public BlockArcanePurifier() {

        super();
        this.setBlockName("arcanePurifier");

    }

    public static void recipe() {

        //GameRegistry.addRecipe(new ShapedArcaneRecipe("arcanePurifier", new ItemStack(ModBlocks.arcanePurifier), requiredAspects(), ));

    }

    private static AspectList requiredAspects() {

        AspectList purifierAspects = new AspectList();

        purifierAspects.add(Aspect.ORDER, 20);
        purifierAspects.add(Aspect.FIRE, 10);

        return purifierAspects;

    }

}

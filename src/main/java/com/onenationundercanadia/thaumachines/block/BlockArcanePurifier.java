package com.onenationundercanadia.thaumachines.block;

import com.onenationundercanadia.thaumachines.refrence.RefrenceNames;
import com.onenationundercanadia.thaumachines.tileentity.TileEntityArcanePurifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class BlockArcanePurifier extends BlockThaumachines {

    public BlockArcanePurifier() {

        super();
        this.setBlockName(RefrenceNames.Blocks.ARCANE_PURIFIER);

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

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if (!world.isRemote) {

            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile != null) {

                TileEntityArcanePurifier arcanePurifier = (TileEntityArcanePurifier) tile;
                if(player.isSneaking()) {



                }
            }
        }

        return true;
    }

}

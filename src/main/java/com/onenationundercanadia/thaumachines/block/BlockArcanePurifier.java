package com.onenationundercanadia.thaumachines.block;

import com.onenationundercanadia.thaumachines.init.ModBlocks;
import com.onenationundercanadia.thaumachines.refrence.RefrenceNames;
import com.onenationundercanadia.thaumachines.refrence.RefrenceResourceLocations;
import com.onenationundercanadia.thaumachines.tileentity.TileEntityArcanePurifier;
import com.onenationundercanadia.thaumachines.utility.recipes.ThaumachinesArcaneRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.ShapedArcaneRecipe;

// File for the Arcane Purifier
public class BlockArcanePurifier extends BlockThaumachines {

    // List of aspects necessary to craft it
    public static final AspectList PURIFIER_ASPECTS = new AspectList().add(Aspect.FIRE, 10).add(Aspect.ORDER, 20).add(Aspect.ENTROPY, 10);

    // Recipe that can be accessed from elsewhere in the mod
    public static ThaumachinesArcaneRecipe purifierRecipe;

    // Constructor
    public BlockArcanePurifier() {

        super();
        this.setBlockName(RefrenceNames.Blocks.ARCANE_PURIFIER);
        this.setBlockTextureName(RefrenceResourceLocations.ARCANE_PURIFIER_SIDES);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }

    // Initializes recipe
    public static void recipe() {

        purifierRecipe = new ThaumachinesArcaneRecipe("arcanePurifier", "purifier", new ItemStack(ModBlocks.arcanePurifier), PURIFIER_ASPECTS, "bbb", "brb", "bbb", 'b', new ItemStack(Blocks.nether_brick), 'r', new ItemStack(ModBlocks.wandReceptacle));

    }

    // todo
    // Actions when block is clicked
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if (!world.isRemote) {

            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile != null) {

                TileEntityArcanePurifier arcanePurifier = (TileEntityArcanePurifier) tile;
                if(!player.isSneaking()) {



                }
            }
        }

        return true;
    }

}

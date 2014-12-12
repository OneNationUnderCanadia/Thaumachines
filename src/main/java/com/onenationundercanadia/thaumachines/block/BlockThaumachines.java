package com.onenationundercanadia.thaumachines.block;

import com.onenationundercanadia.thaumachines.creativetab.CreativeTabThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

// Class for all blocks to extend so they will have the proper methods
public class BlockThaumachines extends Block {

    // Constructor that specifies what the block is made of
    public BlockThaumachines(Material material){

        super(material);
        this.setCreativeTab(CreativeTabThaumachines.THAUMACHINES_TAB);

    }

    // Default constructor
    public BlockThaumachines(){

        super(Material.rock);
        this.setCreativeTab(CreativeTabThaumachines.THAUMACHINES_TAB);

    }

    // Gets the full name of the block ("tile.thaumachines:BLOCK_NAME.name")
    @Override
    public String getUnlocalizedName() {

        return String.format("tile.%s%s", Refrence.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    // Helps getUnlocalizedName
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

    // Registers block textures
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }

}

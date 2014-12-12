package com.onenationundercanadia.thaumachines.item;

import com.onenationundercanadia.thaumachines.creativetab.CreativeTabThaumachines;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// Class for all Items to extend
public class ItemThaumachines extends Item {

    // Constructor
    public ItemThaumachines() {

        super();
        this.setCreativeTab(CreativeTabThaumachines.THAUMACHINES_TAB);

    }

    // Method to get the full name ("item.thaumachines:ITEM_NAME.name")
    @Override
    public String getUnlocalizedName(){

        return String.format("item.%s%s", Refrence.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super
                .getUnlocalizedName()));

    }

    // Method to get the full name ("item.thaumachines:ITEM_NAME.name")
    @Override
    public String getUnlocalizedName(ItemStack itemStack){

        return String.format("item.%s%s", Refrence.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super
                .getUnlocalizedName()));

    }

    // Registers the item's texture(s)
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){

        itemIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }

    // Helps getUnlocalizedName
    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

}

package com.onenationundercanadia.thaumachines.tileentity;

import net.minecraft.item.ItemStack;

/**
 * Created by BJARK on 12/11/2014.
 */
public class TileEntityArcanePurifier extends TileEntityThaumachines {

    public static final int INVENTORY_SIZE = 4;
    public static final int FUEL_INVENTORY_INDEX = 0;
    public static final int INPUT_INVENTORY_INDEX = 1;
    public static final int DUST_INVENTORY_INDEX = 2;
    public static final int OUTPUT_INVENTORY_INDEX = 3;

    public int deviceCookTime;
    public int fuelBurnTime;
    public int itemCookTime;

    public ItemStack outputItemStack;

    private ItemStack[] inventory;

    public TileEntityArcanePurifier()
    {
        inventory = new ItemStack[INVENTORY_SIZE];
    }

}

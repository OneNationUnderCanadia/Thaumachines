package com.onenationundercanadia.thaumachines.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by BJARK on 12/11/2014.
 */
public abstract class ContainerThaumachines extends Container {

    protected final int PLAYER_INVENTORY_ROWS = 3;
    protected final int PLAYER_INVENTORY_COLUMNS = 9;

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {

        return true;

    }

}

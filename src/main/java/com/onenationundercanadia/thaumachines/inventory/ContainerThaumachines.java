package com.onenationundercanadia.thaumachines.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// Abstract for all Containers to extend
public abstract class ContainerThaumachines extends Container {

    // Initializes variables
    protected final int PLAYER_INVENTORY_ROWS = 3;
    protected final int PLAYER_INVENTORY_COLUMNS = 9;

    // Determines if the player can directly interact with the inventory
    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {

        return true;

    }

}

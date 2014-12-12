package com.onenationundercanadia.thaumachines.inventory;

import com.onenationundercanadia.thaumachines.tileentity.TileEntityArcanePurifier;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// TODO: Properly apply Arcane Purifier as a Container
public class ContainerArcanePurifier extends ContainerThaumachines {

    // Initializes variables
    private TileEntityArcanePurifier tileEntityArcanePurifier;
    private ContainerArcanePurifier containerArcanePurifier;
    private int lastDeviceCookTime;
    private int lastFuelBurnTime;
    private int lastItemCookTime;

    // Constructor
    public ContainerArcanePurifier(InventoryPlayer inventoryPlayer, TileEntityArcanePurifier tileEntityArcanePurifier) {

        this.tileEntityArcanePurifier = tileEntityArcanePurifier;

        this.addSlotToContainer(new Slot((IInventory) tileEntityArcanePurifier, TileEntityArcanePurifier.FUEL_INVENTORY_INDEX, 44, 74));
        this.addSlotToContainer(new Slot((IInventory) tileEntityArcanePurifier, TileEntityArcanePurifier.INPUT_INVENTORY_INDEX, 44, 18));
        this.addSlotToContainer(new Slot((IInventory) tileEntityArcanePurifier, TileEntityArcanePurifier.DUST_INVENTORY_INDEX, 44, 39));
        this.addSlotToContainer(new Slot((IInventory) tileEntityArcanePurifier, TileEntityArcanePurifier.OUTPUT_INVENTORY_INDEX, 120, 39) {

            @Override
            public void onPickupFromSlot(EntityPlayer entityPlayer, ItemStack itemStack) {

                super.onPickupFromSlot(entityPlayer, itemStack);
                FMLCommonHandler.instance().firePlayerCraftingEvent(entityPlayer, itemStack, inventory);

            }

            @Override
            public boolean isItemValid(ItemStack itemStack) {

                return false;

            }

        });

    }

}

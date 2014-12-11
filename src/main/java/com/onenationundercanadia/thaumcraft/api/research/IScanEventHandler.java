package com.onenationundercanadia.thaumcraft.api.research;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IScanEventHandler {
	com.onenationundercanadia.thaumcraft.api.research.ScanResult scanPhenomena(ItemStack stack, World world, EntityPlayer player);
}

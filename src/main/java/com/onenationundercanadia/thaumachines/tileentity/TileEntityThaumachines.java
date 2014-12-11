package com.onenationundercanadia.thaumachines.tileentity;

import com.onenationundercanadia.thaumachines.refrence.RefrenceNames;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityThaumachines extends TileEntity {

    protected ForgeDirection orientation;
    protected byte state;
    protected String customName;
    protected String owner;

    public TileEntityThaumachines() {

        orientation = ForgeDirection.SOUTH;
        state = 0;
        customName = "";
        owner = "";

    }

    public ForgeDirection getOrientation() {

        return orientation;

    }

    public void setOrientation(ForgeDirection orientation) {

        this.orientation = orientation;

    }

    public void setOrientation(int orientation) {

        this.orientation = ForgeDirection.getOrientation(orientation);

    }

    public short getState() {

        return state;

    }

    public void setState(byte state) {

        this.state = state;

    }

    public String getCustomName() {

        return customName;

    }

    public void setCustomName(String customName) {

        this.customName = customName;

    }

    public String getOwner() {

        return owner;

    }

    public void setOwner(String owner) {

        this.owner = owner;

    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {

        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey(RefrenceNames.NBT.DIRECTION)) {

            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(RefrenceNames.NBT.DIRECTION));
        }

        if (nbtTagCompound.hasKey(RefrenceNames.NBT.STATE)) {

            this.state = nbtTagCompound.getByte(RefrenceNames.NBT.STATE);

        }

        if (nbtTagCompound.hasKey(RefrenceNames.NBT.CUSTOM_NAME)) {

            this.customName = nbtTagCompound.getString(RefrenceNames.NBT.CUSTOM_NAME);

        }

        if (nbtTagCompound.hasKey(RefrenceNames.NBT.OWNER)) {

            this.owner = nbtTagCompound.getString(RefrenceNames.NBT.OWNER);

        }

    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {

        super.writeToNBT(nbtTagCompound);
        nbtTagCompound.setByte(RefrenceNames.NBT.DIRECTION, (byte) orientation.ordinal());
        nbtTagCompound.setByte(RefrenceNames.NBT.STATE, state);

        if (this.hasCustomName()) {

            nbtTagCompound.setString(RefrenceNames.NBT.CUSTOM_NAME, customName);

        }

        if (this.hasOwner()) {

            nbtTagCompound.setString(RefrenceNames.NBT.OWNER, owner);

        }

    }

    public boolean hasCustomName() {

        return customName != null && customName.length() > 0;

    }

    public boolean hasOwner() {

        return owner != null && owner.length() > 0;

    }

}

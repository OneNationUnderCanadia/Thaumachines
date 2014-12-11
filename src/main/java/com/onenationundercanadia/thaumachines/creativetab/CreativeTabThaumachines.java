package com.onenationundercanadia.thaumachines.creativetab;

import com.onenationundercanadia.thaumachines.init.ModItems;
import com.onenationundercanadia.thaumachines.refrence.Refrence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabThaumachines {

    public static final CreativeTabs THAUMACHINES_TAB = new CreativeTabs(Refrence.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {

            return ModItems.testItem;

        }

    };

}

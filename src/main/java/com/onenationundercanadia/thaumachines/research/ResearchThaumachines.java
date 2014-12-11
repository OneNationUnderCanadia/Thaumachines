package com.onenationundercanadia.thaumachines.research;

import com.onenationundercanadia.thaumcraft.api.research.ResearchCategories;
import net.minecraft.util.ResourceLocation;

/**
 * Created by BJARK on 12/11/2014.
 */
public class ResearchThaumachines {

    public static ResearchCategories thaumachinesTab;

    public static void registerTab() {

        thaumachinesTab.registerCategory("thaumachines", ResourceLocation);

    }

}

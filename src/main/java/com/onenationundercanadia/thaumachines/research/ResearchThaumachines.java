package com.onenationundercanadia.thaumachines.research;

import com.onenationundercanadia.thaumachines.refrence.RefrenceResourceLocations;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import net.minecraft.util.ResourceLocation;

/**
 * Created by BJARK on 12/11/2014.
 */
public class ResearchThaumachines {

    public static ResearchCategories thaumachinesTab;

    public static ResearchItem receptacles = new ResearchItem("receptacles", "Thaumachines", RefrenceResourceLocations.receptacleAspects(), 5, 5, 1, RefrenceResourceLocations.RECEPTACLE_CORE);
    public static ResearchItem purifier = new ResearchItem("purifier", "Thaumachines", RefrenceResourceLocations.receptacleAspects(), 2, 2, 1, RefrenceResourceLocations.RECEPTACLE_CORE);

    public static void registerTab() {

        thaumachinesTab.registerCategory("Thaumachines", RefrenceResourceLocations.R_ENCHANTING, RefrenceResourceLocations.PARTICLE_FIELD);

    }

    public static void putResearchInTab() {

        receptacles.setParents("", "");

        thaumachinesTab.addResearch(receptacles);
        thaumachinesTab.addResearch(purifier);

    }

}

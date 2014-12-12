package com.onenationundercanadia.thaumachines.research;

import com.onenationundercanadia.thaumachines.block.BlockArcanePurifier;
import com.onenationundercanadia.thaumachines.block.BlockWandReceptacle;
import com.onenationundercanadia.thaumachines.item.ItemReceptacleCore;
import com.onenationundercanadia.thaumachines.refrence.RefrenceResourceLocations;
import com.onenationundercanadia.thaumachines.utility.recipes.ThaumachinesArcaneRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.research.ResearchPage;

public class ResearchThaumachines {

    public static ResearchCategories thaumachinesTab;

    public static ResearchItem receptacles = new ResearchItem("receptacles", "Thaumachines", RefrenceResourceLocations.RESEARCH_RECEPTACLE_ASPECTS, 5, 5, 1, RefrenceResourceLocations.RECEPTACLE_CORE);
    public static ResearchItem purifier = new ResearchItem("purifier", "Thaumachines", RefrenceResourceLocations.RESEARCH_PURIFIER_ASPECTS, 2, 2, 1, RefrenceResourceLocations.RECEPTACLE_CORE);

    public static void registerTab() {

        thaumachinesTab.registerCategory("Thaumachines", RefrenceResourceLocations.R_ENCHANTING, RefrenceResourceLocations.PARTICLE_FIELD);

    }

    public static void putResearchInTab() {

        setParents();

        thaumachinesTab.addResearch(receptacles);
        thaumachinesTab.addResearch(purifier);

    }

    private static void setParents() {

        purifier.setParents("receptacles");

    }

    private static void setPages() {

        receptacles.setPages(new ResearchPage("0"), new ResearchPage(BlockArcanePurifier.purifierRecipe));
        receptacles.setPages(new ResearchPage("0"), new ResearchPage(BlockWandReceptacle.receptacleRecipe), new ResearchPage("1"), new ResearchPage(ItemReceptacleCore.receptacleCoreRecipe));

    }

}

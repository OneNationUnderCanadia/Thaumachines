package com.onenationundercanadia.thaumachines.refrence;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

/**
 * Created by BJARK on 12/11/2014.
 */
public class RefrenceResourceLocations {

    public static final ResourceLocation RECEPTACLE_CORE = new ResourceLocation("thaumachines:textures/items/receptacleCore.png");

    public static final ResourceLocation R_ENCHANTING = new ResourceLocation("thaumachines:textures/misc/r_enchanting.png");
    public static final ResourceLocation PARTICLE_FIELD = new ResourceLocation("thaumachines:textures/misc/particlefield.png");

    public static final AspectList RESEARCH_RECEPTACLE_ASPECTS = new AspectList().add(Aspect.ENERGY, 1).add(Aspect.FIRE, 1).add(Aspect.METAL, 1);
    public static final AspectList RESEARCH_PURIFIER_ASPECTS = new AspectList().add(Aspect.MECHANISM, 1).add(Aspect.ORDER, 1).add(Aspect.GREED, 1).add(Aspect.CRYSTAL, 1);

}

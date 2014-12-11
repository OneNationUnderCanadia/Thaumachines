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

    public static AspectList receptacleAspects() {

        AspectList RECEPTACLE_ASPECTS = new AspectList();
        RECEPTACLE_ASPECTS.add(Aspect.ENERGY, 1);
        RECEPTACLE_ASPECTS.add(Aspect.FIRE, 1);
        RECEPTACLE_ASPECTS.add(Aspect.CRAFT, 1);

        return RECEPTACLE_ASPECTS;

    }

}

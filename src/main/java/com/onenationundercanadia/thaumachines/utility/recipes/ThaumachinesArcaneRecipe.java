package com.onenationundercanadia.thaumachines.utility.recipes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;

/**
 * Created by OneNationUnderCanadia on 12/11/2014.
 */

// Implements interface IArcaneRecipe for all of Thaumachines
public class ThaumachinesArcaneRecipe implements IArcaneRecipe {

    private final Object[] stuff;
    public String name;
    public String research;
    public ItemStack output;
    public AspectList aspects;
    public Object[] recipies;

    public ThaumachinesArcaneRecipe(String name, String research, ItemStack output, AspectList aspects, Object... stuff) {

        this.name = name;
        this.research = research;
        this.output = output;
        this.aspects = aspects;
        this.stuff = stuff;

    }

    //@Override
    public void registerRecipe() {

        ShapedArcaneRecipe recipe = ThaumcraftApi.addArcaneCraftingRecipe(research, output, aspects, stuff);
        // ConfigResearch.recipes.put(name, recipe);

    }

    /**
     * Used to check if a recipe matches current crafting inventory
     *
     * @param var1
     * @param world
     * @param player
     */
    @Override
    public boolean matches(IInventory var1, World world, EntityPlayer player) {
        return false;
    }

    /**
     * Returns an Item that is the result of this recipe
     *
     * @param var1
     */
    @Override
    public ItemStack getCraftingResult(IInventory var1) {
        return null;
    }

    /**
     * Returns the size of the recipe area
     */
    @Override
    public int getRecipeSize() {
        return 0;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }

    @Override
    public AspectList getAspects() {
        return null;
    }

    @Override
    public AspectList getAspects(IInventory var1) {
        return null;
    }

    @Override
    public String getResearch() {
        return null;
    }
}

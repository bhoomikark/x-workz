// qqpackage - external
package com.xworkz.late.external.qqpackage;

import com.xworkz.late.internal.qqpackage.Recipe;

public class Cookbook {
    Recipe recipe;

    public Cookbook(Recipe recipe) {
        System.out.println("Parameterized constructor of Cookbook");
        this.recipe = recipe;
    }

    public void displayRecipe() {
        if (recipe != null) {
            recipe.cook();
        } else {
            System.out.println("No recipe to display");
        }
    }
}

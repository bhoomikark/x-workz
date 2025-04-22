// qqpackage - implementation
package com.xworkz.late.internal.qqpackage;

public class RecipeImpl implements Recipe {
    public RecipeImpl() {
        super();
        System.out.println("No-arg constructor of RecipeImpl");
    }

    @Override
    public void cook() {
        System.out.println("Overriding Recipe - Cooking a recipe");
    }
}

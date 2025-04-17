package com.xworkz.interfaceease.internal.fiftytwo;

public interface RecipeApp {
    void openApp();
    void searchRecipe();
    void closeApp();
    default void seeIngridients()
    {
        System.out.println("Check the ingredients");
    }

}

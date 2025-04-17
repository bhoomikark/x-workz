package com.xworkz.interfaceease.internal.fiftytwo;

public class CookBook implements RecipeApp {
    @Override
    public void openApp() {
        System.out.println("Opening CookBook app...");
    }

    @Override
    public void searchRecipe() {
        System.out.println("Searching for Pasta recipe...");
    }

    @Override
    public void closeApp() {
        System.out.println("CookBook app closed.");
    }
}

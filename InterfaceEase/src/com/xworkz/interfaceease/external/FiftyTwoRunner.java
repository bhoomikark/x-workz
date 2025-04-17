package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftytwo.*;

public class FiftyTwoRunner {
    public static void main(String[] args) {
        RecipeApp app = new CookBook();
        app.openApp();
        app.searchRecipe();
        app.closeApp();
        app.seeIngridients();
    }
}

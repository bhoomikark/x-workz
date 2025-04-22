// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.qqpackage.*;
import com.xworkz.late.external.qqpackage.*;

public class CookbookRunner {
    public static void main(String[] args) {
        Recipe recipe = new RecipeImpl();
        Cookbook cookbook = new Cookbook(recipe);
        cookbook.displayRecipe();
    }
}

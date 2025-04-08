package com.xworkz.lilyblossomstore.internal.culinary;

public class PizzaChef {
    public void bakePizza(Chef chef) {
        System.out.println("\nInside PizzaChef class - Observing a chef at work...");

        chef.cook();
        chef.chop();
        chef.season();
        chef.plateDish();
        chef.taste();

        if (chef instanceof PastryChef) {
            System.out.println("Casting Chef to PastryChef to access makeChocolate method...");
            PastryChef pastryChef = (PastryChef) chef;
            pastryChef.makeChocolate();
        }
    }
}

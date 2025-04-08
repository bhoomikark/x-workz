package com.xworkz.lilyblossomstore.internal.kitchen;

public class Biscuit {
    public void biscuitName(Food food) {
        System.out.println("\nInside Biscuit class - Checking food type...");

        food.cook();
        food.serve();
        food.eat();
        food.digest();
        food.store();

        if (food instanceof Cake) {
            System.out.println("Casting Food to Cake to access special decoration...");
            Cake cake = (Cake) food;
            cake.decorate();
        }
    }
}

package com.xworkz.lilyblossomstore.internal.kitchen;

public class Cake extends Food {
    public Cake() {
        super(); // Calls the constructor of Food

        System.out.println("Cake is a sweet dessert...");
    }

    @Override
    public void cook() {
        System.out.println("Child Class");
        System.out.println("Baking the cake...");
    }

    @Override
    public void serve() {
        System.out.println("Child Class");
        System.out.println("Serving the cake with frosting...");
    }

    @Override
    public void eat() {
        System.out.println("Child Class");
        System.out.println("Eating the delicious cake...");
    }

    @Override
    public void digest() {
        System.out.println("Child Class");
        System.out.println("Digesting the sugary cake...");
    }

    @Override
    public void store() {
        System.out.println("Child Class");
        System.out.println("Storing the cake in the fridge...");
    }
}

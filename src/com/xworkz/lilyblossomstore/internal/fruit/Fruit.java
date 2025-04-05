package com.xworkz.lilyblossomstore.internal.fruit;

public class Fruit {

    public Fruit() {

        System.out.println("Running Fruit Constructor in Fruit class");
    }

    public void grow() {
        System.out.println("Parent Class");
        System.out.println("Fruit is growing");
    }

    public void ripen() {
        System.out.println("Parent Class");
        System.out.println("Fruit is ripening");
    }

    public void eat() {
        System.out.println("Parent Class");
        System.out.println("Eating the fruit");
    }

    public void getTaste() {
        System.out.println("Parent Class");
        System.out.println("Checking the fruit taste");
    }

    public void getNutrition() {
        System.out.println("Parent Class");
        System.out.println("Getting fruit nutrition values");
    }
}

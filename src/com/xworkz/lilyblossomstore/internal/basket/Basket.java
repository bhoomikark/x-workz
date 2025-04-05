package com.xworkz.lilyblossomstore.internal.basket;

public class Basket {
    public Basket() {
        System.out.println("Parent Class");
        System.out.println("Running Basket Constructor in Basket class");
    }

    public void storeItems() {
        System.out.println("Parent Class");
        System.out.println("Basket is used to store items.");
    }

    public void carry() {
        System.out.println("Parent Class");
        System.out.println("Carrying the basket.");
    }

    public void clean() {
        System.out.println("Parent Class");
        System.out.println("Cleaning the basket.");
    }

    public void decorate() {
        System.out.println("Parent Class");
        System.out.println("Decorating the basket.");
    }

    public void coverWithLid() {
        System.out.println("Parent Class");
        System.out.println("Covering the basket with a lid.");
    }
}

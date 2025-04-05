package com.xworkz.lilyblossomstore.internal.bag;

public class Bag {
    public Bag() {
        System.out.println("Parent Class");
        System.out.println("Running Bag Constructor in Bag class");
    }

    public void open() {
        System.out.println("Parent Class");
        System.out.println("Opening the bag.");
    }

    public void close() {
        System.out.println("Parent Class");
        System.out.println("Closing the bag.");
    }

    public void carry() {
        System.out.println("Parent Class");
        System.out.println("Carrying the bag.");
    }

    public void storeItems() {
        System.out.println("Parent Class");
        System.out.println("Storing items in the bag.");
    }

    public void empty() {
        System.out.println("Parent Class");
        System.out.println("Emptying the bag.");
    }
}

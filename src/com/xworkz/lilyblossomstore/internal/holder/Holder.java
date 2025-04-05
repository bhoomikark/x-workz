package com.xworkz.lilyblossomstore.internal.holder;

public class Holder {
    public Holder() {

        System.out.println("Running Holder Constructor in Holder class");
    }

    public void hold() {
        System.out.println("Parent Class");
        System.out.println("Holding an item.");
    }

    public void remove() {
        System.out.println("Parent Class");
        System.out.println("Removing an item from the holder.");
    }

    public void clean() {
        System.out.println("Parent Class");
        System.out.println("Cleaning the holder.");
    }

    public void store() {
        System.out.println("Parent Class");
        System.out.println("Storing items in the holder.");
    }

    public void organize() {
        System.out.println("Parent Class");
        System.out.println("Organizing items in the holder.");
    }
}

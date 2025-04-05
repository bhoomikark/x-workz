package com.xworkz.lilyblossomstore.internal.bag;

public class Backpack extends Bag {

    public Backpack() {
        super();
        System.out.println("Child Class");
        System.out.println("No-argument constructor of Backpack");
    }

    @Override
    public void open() {
        System.out.println("Child Class");
        System.out.println("Opening the backpack.");
    }

    @Override
    public void close() {
        System.out.println("Child Class");
        System.out.println("Closing the backpack.");
    }

    @Override
    public void carry() {
        System.out.println("Child Class");
        System.out.println("Carrying the backpack on shoulders.");
    }

    @Override
    public void storeItems() {
        System.out.println("Child Class");
        System.out.println("Storing books and essentials in the backpack.");
    }

    @Override
    public void empty() {
        System.out.println("Child Class");
        System.out.println("Emptying the backpack.");
    }

    public void zipCompartments() {
        System.out.println("Child Class");
        System.out.println("Zipping all backpack compartments.");
    }
}

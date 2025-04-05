package com.xworkz.lilyblossomstore.internal.shoe;

public class Sneakers extends Shoe {
    public Sneakers() {
        super();
        System.out.println("No-argument constructor of Sneakers");
    }

    @Override
    public void wear() {
        System.out.println("Child class");
        System.out.println("Wearing stylish sneakers for comfort.");
    }

    @Override
    public void remove() {
        System.out.println("Child class");
        System.out.println("Removing sneakers after a long walk.");
    }

    @Override
    public void clean() {
        System.out.println("Child class");
        System.out.println("Cleaning sneakers with a soft brush.");
    }

    @Override
    public void polish() {
        System.out.println("Child class");
        System.out.println("Polishing sneakers with foam cleaner.");
    }

    @Override
    public void repair() {
        System.out.println("Child class");
        System.out.println("Repairing worn-out soles of sneakers.");
    }
}

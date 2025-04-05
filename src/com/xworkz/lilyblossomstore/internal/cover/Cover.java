package com.xworkz.lilyblossomstore.internal.cover;

public class Cover {
    public Cover() {

        System.out.println("Running Cover Constructor in Cover class");
    }

    public void protect() {
        System.out.println("Parent Class");
        System.out.println("Cover is protecting the item.");
    }

    public void remove() {
        System.out.println("Parent Class");
        System.out.println("Removing the cover.");
    }

    public void clean() {
        System.out.println("Parent Class");
        System.out.println("Cleaning the cover.");
    }

    public void fold() {
        System.out.println("Parent Class");
        System.out.println("Folding the cover.");
    }

    public void replace() {
        System.out.println("Parent Class");
        System.out.println("Replacing the cover.");
    }
}

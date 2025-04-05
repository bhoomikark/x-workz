package com.xworkz.lilyblossomstore.internal.forest;

public class Parrot extends Bird {
    public Parrot() {
        super();

        System.out.println("Parrot is a colorful and intelligent bird...");
    }

    @Override
    public void fly() {
        System.out.println("Child Class");
        System.out.println("Parrot flies with grace and speed...");
    }

    @Override
    public void sing() {
        System.out.println("Child Class");
        System.out.println("Parrot mimics human speech and melodies...");
    }

    @Override
    public void eat() {
        System.out.println("Child Class");
        System.out.println("Parrot enjoys fruits, nuts, and seeds...");
    }

    @Override
    public void buildNest() {
        System.out.println("Child Class");
        System.out.println("Parrot builds its nest in tree hollows...");
    }

    @Override
    public void migrate() {
        System.out.println("Child Class");
        System.out.println("Parrot usually does not migrate far...");
    }
}

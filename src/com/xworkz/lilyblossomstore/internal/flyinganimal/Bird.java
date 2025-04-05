package com.xworkz.lilyblossomstore.internal.flyinganimal;

public class Bird {
    public Bird() {

        System.out.println("Running Bird Constructor");
    }

    void fly() {
        System.out.println("Parent Class");
        System.out.println("Bird is flying.");
    }

    void chirp() {
        System.out.println("Parent Class");
        System.out.println("Bird is chirping.");
    }

    void layEggs() {
        System.out.println("Parent Class");
        System.out.println("Bird is laying eggs.");
    }

    void migrate() {
        System.out.println("Parent Class");
        System.out.println("Bird is migrating.");
    }

    void eat() {
        System.out.println("Parent Class");
        System.out.println("Bird is eating.");
    }
}

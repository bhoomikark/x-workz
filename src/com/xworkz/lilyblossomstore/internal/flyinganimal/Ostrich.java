package com.xworkz.lilyblossomstore.internal.flyinganimal;

public class Ostrich extends Bird {
    public Ostrich() {
        super();

        System.out.println("Ostrich is running fast instead of flying.");
    }

    @Override
    void fly() {
        System.out.println("Child Class");
        System.out.println("Ostriches cannot fly.");
    }

    @Override
    void chirp() {
        System.out.println("Child Class");
        System.out.println("Ostrich makes low booming sounds.");
    }

    @Override
    void layEggs() {
        System.out.println("Child Class");
        System.out.println("Ostrich lays the largest eggs.");
    }

    @Override
    void migrate() {
        System.out.println("Child Class");
        System.out.println("Ostriches do not migrate.");
    }

    @Override
    void eat() {
        System.out.println("Child Class");
        System.out.println("Ostrich eats plants and insects.");
    }
}

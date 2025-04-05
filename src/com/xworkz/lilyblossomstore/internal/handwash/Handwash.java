package com.xworkz.lilyblossomstore.internal.handwash;

public class Handwash {
    public Handwash() {

        System.out.println("Running Handwash Constructor in Handwash class");
    }

    public void pour() {
        System.out.println("Parent Class");
        System.out.println("Pouring handwash.");
    }

    public void use() {
        System.out.println("Parent Class");
        System.out.println("Using the handwash.");
    }

    public void rinse() {
        System.out.println("Parent Class");
        System.out.println("Rinsing hands after using handwash.");
    }

    public void cleanHands() {
        System.out.println("Parent Class");
        System.out.println("Cleaning hands thoroughly.");
    }
}

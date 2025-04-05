package com.xworkz.lilyblossomstore.internal.handwash;

public class HerbalHandwash extends Handwash {
    public HerbalHandwash() {
        super();
        System.out.println("Child Class");
        System.out.println("Running HerbalHandwash Constructor in HerbalHandwash class");
    }

    @Override
    public void pour() {
        System.out.println("Child Class");
        System.out.println("Pouring herbal handwash.");
    }

    @Override
    public void use() {
        System.out.println("Child Class");
        System.out.println("Using the herbal handwash.");
    }

    @Override
    public void rinse() {
        System.out.println("Child Class");
        System.out.println("Rinsing hands after using herbal handwash.");
    }

    @Override
    public void cleanHands() {
        System.out.println("Child Class");
        System.out.println("Cleaning hands with natural ingredients.");
    }
}

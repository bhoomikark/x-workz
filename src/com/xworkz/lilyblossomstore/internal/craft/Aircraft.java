package com.xworkz.lilyblossomstore.internal.craft;

public class Aircraft {
    public Aircraft() {
        System.out.println("Running aircraft constructor");
    }

    public void takeOff() {
        System.out.println("Parent Class");
        System.out.println("Aircraft is taking off.");
    }

    public void land() {
        System.out.println("Parent Class");
        System.out.println("Aircraft is landing.");
    }

    public void cruise() {
        System.out.println("Parent Class");
        System.out.println("Aircraft is cruising at altitude.");
    }

    public void deployLandingGear() {
        System.out.println("Parent Class");
        System.out.println("Landing gear deployed.");
    }

    public void adjustFlaps() {
        System.out.println("Parent Class");
        System.out.println("Aircraft flaps adjusted.");
    }
}

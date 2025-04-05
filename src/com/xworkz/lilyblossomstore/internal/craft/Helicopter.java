package com.xworkz.lilyblossomstore.internal.craft;

public class Helicopter extends Aircraft {
    public Helicopter() {
        super();

        System.out.println("Helicopter is hovering.");
    }

    @Override
    public void takeOff() {
        System.out.println("Child Class");
        System.out.println("Helicopter is taking off vertically.");
    }

    @Override
    public void land() {
        System.out.println("Child Class");
        System.out.println("Helicopter is landing smoothly.");
    }

    @Override
    public void cruise() {
        System.out.println("Child Class");
        System.out.println("Helicopter is cruising at low altitude.");
    }

    @Override
    public void deployLandingGear() {
        System.out.println("Child Class");
        System.out.println("Helicopter landing gear deployed.");
    }

    @Override
    public void adjustFlaps() {
        System.out.println("Child Class");
        System.out.println("Helicopter rotor blades adjusted.");
    }
}

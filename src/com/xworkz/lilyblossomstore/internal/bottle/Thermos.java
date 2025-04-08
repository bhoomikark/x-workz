package com.xworkz.lilyblossomstore.internal.bottle;

public class Thermos extends Bottle {
    public Thermos() {
        super();
        System.out.println("Running Thermos Constructor in Thermos class");
    }

    @Override
    public void fill() {
        System.out.println("Child Class");
        System.out.println("Filling the thermos");
    }

    @Override
    public void pour() {
        System.out.println("Child Class");
        System.out.println("Pouring from the thermos");
    }

    @Override
    public void closeCap() {
        System.out.println("Child Class");
        System.out.println("Closing the thermos cap");
    }

    @Override
    public void checkMaterial() {
        System.out.println("Child Class");
        System.out.println("Checking thermos material");
    }

    @Override
    public void checkCapacity() {
        System.out.println("Child Class");
        System.out.println("Checking thermos capacity");
    }
    public void insulationInfo() {
        System.out.println("Thermos keeps liquids hot/cold for 12 hours");
    }

}

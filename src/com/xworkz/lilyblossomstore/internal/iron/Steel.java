package com.xworkz.lilyblossomstore.internal.iron;

public class Steel extends Iron {
    public Steel() {
        super();
        System.out.println("No argument constructor of iron");
    }

    @Override
    public void getMeltingPoint() {
        System.out.println("Child Class");
        System.out.println("Running getMelting point method in steel class");
    }

    @Override
    public void getDensity() {
        System.out.println("Child Class");
        System.out.println("Running get density method in steel class");
    }

    @Override
    public void checkRustFormation() {
        System.out.println("Child Class");
        System.out.println("Running check rust formation in steel class");
    }

    @Override
    public void conductElectricity() {
        System.out.println("Child Class");
        System.out.println("Running conduct electricity in steel class");
    }

    @Override
    public void magneticProperties() {
        System.out.println("Child Class");
        System.out.println("Running Magnetic properties method in steel class");
    }
}

package com.xworkz.lilyblossomstore.internal.government;

public class PoliceDepartment extends Government {
    public PoliceDepartment() {
        super();

        System.out.println("Running PoliceDepartment Constructor");
    }

    @Override
    public void makeLaws() {
        System.out.println("Child Class");
        System.out.println("Police enforce laws made by the government.");
    }

    @Override
    public void collectTaxes() {
        System.out.println("Child Class");
        System.out.println("Police assist in enforcing tax compliance.");
    }

    @Override
    public void provideSecurity() {
        System.out.println("Child Class");
        System.out.println("Police maintain law and order.");
    }

    @Override
    public void manageEconomy() {
        System.out.println("Child Class");
        System.out.println("Police indirectly support economy by ensuring safety.");
    }

    @Override
    public void publicServices() {
        System.out.println("Child Class");
        System.out.println("Police offer emergency and legal services.");
    }
}

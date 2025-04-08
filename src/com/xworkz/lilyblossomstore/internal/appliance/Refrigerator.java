package com.xworkz.lilyblossomstore.internal.appliance;

public class Refrigerator extends Appliance {
    public Refrigerator() {
        super();
        System.out.println("Creating a Refrigerator object...");
    }

    @Override
    public void turnOn() {
        System.out.println("Child Class");
        System.out.println("Refrigerator is now cooling.");
    }

    @Override
    public void turnOff() {
        System.out.println("Child Class");
        System.out.println("Refrigerator is turned off.");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Child Class");
        System.out.println("Adjusting temperature of the Refrigerator.");
    }

    @Override
    public void checkWarranty() {
        System.out.println("Child Class");
        System.out.println("Refrigerator warranty is valid for 2 years.");
    }

    @Override
    public void displayBrand() {
        System.out.println("Child Class");
        System.out.println("Brand: Samsung Refrigerator.");
    }
    public void checkRating()
    {
        System.out.println("Child Class");
        System.out.println("5 star");
    }
}

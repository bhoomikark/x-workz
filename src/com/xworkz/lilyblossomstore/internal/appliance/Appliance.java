package com.xworkz.lilyblossomstore.internal.appliance;

public class Appliance {
    public Appliance() {
        System.out.println("Running Appliance Constructor in Appliance class");
    }

    public void turnOn() {
        System.out.println("Parent Class");
        System.out.println("Turning on the appliance...");
    }

    public void turnOff() {
        System.out.println("Parent Class");
        System.out.println("Turning off the appliance...");
    }

    public void adjustSettings() {
        System.out.println("Parent Class");
        System.out.println("Adjusting appliance settings...");
    }

    public void checkWarranty() {
        System.out.println("Parent Class");
        System.out.println("Checking appliance warranty...");
    }

    public void displayBrand() {
        System.out.println("Parent Class");
        System.out.println("Displaying appliance brand...");
    }
}

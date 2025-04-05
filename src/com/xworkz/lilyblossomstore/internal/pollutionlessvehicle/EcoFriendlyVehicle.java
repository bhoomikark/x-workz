package com.xworkz.lilyblossomstore.internal.pollutionlessvehicle;

public class EcoFriendlyVehicle {
    public EcoFriendlyVehicle() {
        System.out.println("Running ecofriendly constructor");
    }

    public void chargeBattery() {
        System.out.println("Parent class");
        System.out.println("EcoFriendlyVehicle battery is charging.");
    }

    public void checkEmission() {
        System.out.println("Parent class");
        System.out.println("EcoFriendlyVehicle has zero emissions.");
    }

    public void start() {
        System.out.println("Parent class");
        System.out.println("EcoFriendlyVehicle started.");
    }

    public void stop() {
        System.out.println("Parent class");
        System.out.println("EcoFriendlyVehicle stopped.");
    }

    public void ecoMode() {
        System.out.println("Parent class");
        System.out.println("Eco mode activated.");
    }
}

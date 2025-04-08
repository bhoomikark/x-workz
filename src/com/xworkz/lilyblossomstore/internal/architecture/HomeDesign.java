package com.xworkz.lilyblossomstore.internal.architecture;

public class HomeDesign {
    public void design(Home home) {
        System.out.println("\nInside HomeDesign - Checking Home Details...");

        home.provideShelter();
        home.hasFloors();
        home.hasWindows();
        home.supportsElectricity();
        home.hasSecurity();

        if (home instanceof Skyscraper) {
            System.out.println("Casting Home to Skyscraper to access hasElevators method...");
            Skyscraper skyscraper = (Skyscraper) home;
            skyscraper.hasElevators();
        }
    }
}

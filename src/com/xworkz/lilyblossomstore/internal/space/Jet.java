package com.xworkz.lilyblossomstore.internal.space;

public class Jet {
    public void typeOfJet(Spacecraft spacecraft) {
        System.out.println("\nInside Jet class - Analyzing spacecraft...");

        spacecraft.launch();
        spacecraft.land();
        spacecraft.orbit();
        spacecraft.communicate();
        spacecraft.collectData();

        if (spacecraft instanceof Rockett) {
            System.out.println("Casting Spacecraft to Rockett to deploy satellite...");
            Rockett rocket = (Rockett) spacecraft;
            rocket.deploySatellite();
        }
    }
}

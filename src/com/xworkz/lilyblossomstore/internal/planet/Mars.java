package com.xworkz.lilyblossomstore.internal.planet;

public class Mars {
    public void isAlive(Planet planet) {
        System.out.println("\nInside Mars class - Inspecting Planet behavior...");

        planet.rotate();
        planet.revolve();
        planet.hasAtmosphere();
        planet.containsWater();
        planet.supportsLife();

        if (planet instanceof Earth) {
            System.out.println("Casting Planet to Earth to access climateZone method...");
            Earth earth = (Earth) planet;
            earth.climateZone();
        }
    }
}

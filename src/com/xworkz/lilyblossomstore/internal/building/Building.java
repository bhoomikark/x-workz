package com.xworkz.lilyblossomstore.internal.building;

public class Building {

    public Building() {

        System.out.println("Running Building Constructor");
    }

    public void provideShelter() {
        System.out.println("Parent Class");
        System.out.println("Providing shelter...");
    }

    public void openDoors() {
        System.out.println("Parent Class");
        System.out.println("Opening building doors...");
    }

    public void lockWindows() {
        System.out.println("Parent Class");
        System.out.println("Locking windows...");
    }

    public void turnOnLights() {
        System.out.println("Parent Class");
        System.out.println("Turning on lights...");
    }

    public void cleanBuilding() {
        System.out.println("Parent Class");
        System.out.println("Cleaning the building...");
    }
}

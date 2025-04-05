package com.xworkz.lilyblossomstore.internal.building;

public class House extends Building {
    public House() {
        super();

        System.out.println("Creating a House object...");
    }

    @Override
    public void provideShelter() {
        System.out.println("Child Class");
        System.out.println("Providing shelter in the house...");
    }

    @Override
    public void openDoors() {
        System.out.println("Child Class");
        System.out.println("Opening doors of the house...");
    }

    @Override
    public void lockWindows() {
        System.out.println("Child Class");
        System.out.println("Locking windows in the house...");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Child Class");
        System.out.println("Turning on house lights...");
    }

    @Override
    public void cleanBuilding() {
        System.out.println("Child Class");
        System.out.println("Cleaning the house...");
    }
}

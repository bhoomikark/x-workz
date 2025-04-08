package com.xworkz.lilyblossomstore.internal.building;

public class BrickBuilding {
    public void construct(Building building) {
        System.out.println("\nRunning construct(Building building)");
        System.out.println("======================================");
        building.provideShelter();
        building.openDoors();
        building.lockWindows();
        building.turnOnLights();


        if (building instanceof House) {
            System.out.println("Casting to House...");
            House house = (House) building;
            house.decorateHouse();
        }
    }
}

package com.xworkz.swiggit.internal;

public class DreamHouse {
    private String hallPlacement;
    private String kitchen;
    private int noOfRooms;

    public DreamHouse(String hallPlacement, String kitchen, int noOfRooms) {
        this.hallPlacement = hallPlacement;
        this.kitchen = kitchen;
        this.noOfRooms = noOfRooms;
        System.out.println("35. Running DreamHouse Constructor");
    }

    @Override
    public String toString() {
        return "Hall Placement: " + hallPlacement + ", Kitchen Type: " + kitchen +
                ", Number of Rooms: " + noOfRooms;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 111;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DreamHouse) {
            DreamHouse dream = (DreamHouse) obj;
            if (this.kitchen.equals(dream.kitchen)) {
                System.out.println("Both are same");
                return true;
            }
        }
        return false;
    }
}

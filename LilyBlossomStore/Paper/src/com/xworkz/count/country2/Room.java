package com.xworkz.count.country2;

public class Room {
    String type;
    int size;
    boolean occupied;
    double rent;

    public Room(String type, int size, boolean occupied, double rent) {
        this.type = type;
        this.size = size;
        this.occupied = occupied;
        this.rent = rent;
    }

    void display() {
        System.out.println(" Room: Type=" + type + ", Size=" + size + "sq ft, Occupied=" + occupied + ", Rent=" + rent);
    }
}

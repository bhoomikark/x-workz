package com.xworkz.hierarchical.internal.water;

public class Boat extends Water {
    public int capacity = 6;
    public void ride() {
        System.out.println("Boat Capacity: " + capacity + " people");
    }
}
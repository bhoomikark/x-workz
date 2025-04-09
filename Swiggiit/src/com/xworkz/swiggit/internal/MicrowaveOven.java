package com.xworkz.swiggit.internal;

public class MicrowaveOven {
    public String brand;
    public double capacity;
    public boolean hasGrill;

    public MicrowaveOven(String brand, double capacity, boolean hasGrill) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasGrill = hasGrill;
        System.out.println("93. Running Microwave Oven Constructor");
    }

    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "L, Grill: " + hasGrill;
    }
}

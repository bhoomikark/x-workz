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
@Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "L, Grill: " + hasGrill;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 456;
    }
}

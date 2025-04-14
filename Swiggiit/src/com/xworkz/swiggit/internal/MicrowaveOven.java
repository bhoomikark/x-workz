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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof MicrowaveOven) {
                System.out.println("MicrowaveOven is reference of Object");
                MicrowaveOven m1 = this;
                MicrowaveOven m2 = (MicrowaveOven) obj;
                if (m1.brand.equals(m2.brand) && m1.capacity == m2.capacity && m1.hasGrill == m2.hasGrill) {
                    System.out.println("Both MicrowaveOvens are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

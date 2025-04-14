package com.xworkz.swiggit.internal;

public class Desert {
    private String desertType;
    private int desertNo;
    private String toppings;

    public Desert(String desertType, int desertNo, String toppings) {
        this.desertType = desertType;
        this.desertNo = desertNo;
        this.toppings = toppings;
        System.out.println("31. Running Desert Constructor");
    }

    @Override
    public String toString() {
        return "Desert Type: " + desertType + ", Desert No: " + desertNo +
                ", Toppings: " + toppings;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 888;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Desert) {
                Desert other = (Desert) obj;
                return this.desertType.equals(other.desertType);
            }
        }
        return false;
    }
}

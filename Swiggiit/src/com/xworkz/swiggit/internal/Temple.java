package com.xworkz.swiggit.internal;

public class Temple {
    private String templeName;
    private double templeDistance;
    private String godName;

    public Temple(String templeName, double templeDistance, String godName) {
        this.templeName = templeName;
        this.templeDistance = templeDistance;
        this.godName = godName;
        System.out.println("76. Running Temple Constructor");
    }
@Override
    public String toString() {
        return "Temple Name: " + templeName + ", Distance: " + templeDistance + " km, God: " + godName;
    }
    @Override
    public int hashCode() {
        return 115;
    }
}

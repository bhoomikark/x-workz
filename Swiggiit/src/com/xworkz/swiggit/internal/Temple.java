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
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Temple) {
            Temple temple1 = this;
            Temple temple2 = (Temple) obj;


            if (temple1.templeName.equals(temple2.templeName) && temple1.templeDistance == temple2.templeDistance) {
                return true;
            }
        }
        return false;
    }
}

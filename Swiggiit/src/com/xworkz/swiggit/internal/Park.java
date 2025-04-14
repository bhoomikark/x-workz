package com.xworkz.swiggit.internal;

public class Park {
    private int numberOfParksInYourArea;
    private String toysAvailable;
    private boolean isThatSpacious;

    public Park(int numberOfParksInYourArea, String toysAvailable, boolean isThatSpacious) {
        this.numberOfParksInYourArea = numberOfParksInYourArea;
        this.toysAvailable = toysAvailable;
        this.isThatSpacious = isThatSpacious;
        System.out.println("25. Running Park Constructor");
    }

    @Override
    public String toString() {
        return "Number of Parks in Your Area: " + numberOfParksInYourArea + ", Toys Available: " + toysAvailable +
                ", Is That Spacious: " + isThatSpacious;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 777;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Park) {
                System.out.println("Park is reference of Object");
                Park p1 = this;
                Park p2 = (Park) obj;
                if (p1.numberOfParksInYourArea == p2.numberOfParksInYourArea &&
                        p1.toysAvailable.equals(p2.toysAvailable) &&
                        p1.isThatSpacious == p2.isThatSpacious) {
                    System.out.println("Both Park objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

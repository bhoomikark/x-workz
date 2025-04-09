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
}

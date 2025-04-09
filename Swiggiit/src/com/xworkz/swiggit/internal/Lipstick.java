package com.xworkz.swiggit.internal;

public class Lipstick {
    private String lipstickBrand;
    private String ownerName;
    private int noOfShadesAvailable;

    public Lipstick(String lipstickBrand, String ownerName, int noOfShadesAvailable) {
        this.lipstickBrand = lipstickBrand;
        this.ownerName = ownerName;
        this.noOfShadesAvailable = noOfShadesAvailable;
        System.out.println("57. Running Lipstick Constructor");
    }

    @Override
    public String toString() {
        return "Lipstick Brand: " + lipstickBrand + ", Owner Name: " + ownerName + ", Number of Shades: " + noOfShadesAvailable;
    }
}

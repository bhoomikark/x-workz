package com.xworkz.swiggit.internal;

public class SweetHouse {
    private String typeOfSweetsAvailable;
    private int noOfSweets;
    private String famousSweet;

    public SweetHouse(String typeOfSweetsAvailable, int noOfSweets, String famousSweet) {
        this.typeOfSweetsAvailable = typeOfSweetsAvailable;
        this.noOfSweets = noOfSweets;
        this.famousSweet = famousSweet;
        System.out.println("60. Running SweetHouse Constructor");
    }

    @Override
    public String toString() {
        return "Types of Sweets: " + typeOfSweetsAvailable + ", No of Sweets: " + noOfSweets + ", Famous Sweet: " + famousSweet;
    }
}

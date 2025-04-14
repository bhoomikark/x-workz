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
    @Override
    public int hashCode() {
        return 109;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof SweetHouse) {
                System.out.println("SweetHouse is reference of object");
                SweetHouse sweetHouse1 = this;
                SweetHouse sweetHouse2 = (SweetHouse) obj;


                if (sweetHouse1.typeOfSweetsAvailable.equals(sweetHouse2.typeOfSweetsAvailable) &&
                        sweetHouse1.noOfSweets == sweetHouse2.noOfSweets) {
                    System.out.println("Both SweetHouse objects are the same (based on Type of Sweets and Number of Sweets)");
                    return true;
                }
            }
        }
        return false;
    }
}

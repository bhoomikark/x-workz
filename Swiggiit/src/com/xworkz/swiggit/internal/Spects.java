package com.xworkz.swiggit.internal;

public class Spects {
    private String spectsType;
    private String spectsMaterial;
    private int noOfSpectsYouHaveBought;

    public Spects(String spectsType, String spectsMaterial, int noOfSpectsYouHaveBought) {
        this.spectsType = spectsType;
        this.spectsMaterial = spectsMaterial;
        this.noOfSpectsYouHaveBought = noOfSpectsYouHaveBought;
        System.out.println("41. Running Spects Constructor");
    }

    @Override
    public String toString() {
        return "Spects Type: " + spectsType + ", Material: " + spectsMaterial +
                ", No. of Spects Bought: " + noOfSpectsYouHaveBought;
    }
    @Override
    public int hashCode() {
        return 106;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Spects) {
                System.out.println("Spects is reference of object");
                Spects s1 = this;
                Spects s2 = (Spects) obj;
                if (s1.spectsType.equals(s2.spectsType) &&
                        s1.spectsMaterial.equals(s2.spectsMaterial)) {
                    System.out.println("Both Spects are same (based on Type and Material)");
                    return true;
                }
            }
        }
        return false;
    }
}

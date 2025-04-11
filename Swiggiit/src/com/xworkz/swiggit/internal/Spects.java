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
}

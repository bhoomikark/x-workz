package com.xworkz.swiggit.internal;

public class Powder {
    private String powderBrand;
    private String powderType;
    private int noOfPowder;

    public Powder(String powderBrand, String powderType, int noOfPowder) {
        this.powderBrand = powderBrand;
        this.powderType = powderType;
        this.noOfPowder = noOfPowder;
        System.out.println("73. Running Powder Constructor");
    }

    public String toString() {
        return "Brand: " + powderBrand + ", Type: " + powderType + ", Count: " + noOfPowder;
    }
}

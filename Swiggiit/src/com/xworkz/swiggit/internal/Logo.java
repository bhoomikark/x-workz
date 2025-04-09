package com.xworkz.swiggit.internal;

public class Logo {
    private int logoNo;
    private boolean isThisLogoABrand;
    private String logoCreation;

    public Logo(int logoNo, boolean isThisLogoABrand, String logoCreation) {
        this.logoNo = logoNo;
        this.isThisLogoABrand = isThisLogoABrand;
        this.logoCreation = logoCreation;
        System.out.println("55. Running Logo Constructor");
    }

    @Override
    public String toString() {
        return "Logo No: " + logoNo + ", Is Brand Logo: " + isThisLogoABrand +
                ", Created Using: " + logoCreation;
    }
}

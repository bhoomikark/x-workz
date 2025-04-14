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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Logo) {
                System.out.println("Logo is reference of object");
                Logo logo1 = this;
                Logo logo2 = (Logo) obj;
                if (logo1.logoNo == logo2.logoNo &&
                        logo1.isThisLogoABrand == logo2.isThisLogoABrand &&
                        logo1.logoCreation.equals(logo2.logoCreation)) {
                    System.out.println("Both logos are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

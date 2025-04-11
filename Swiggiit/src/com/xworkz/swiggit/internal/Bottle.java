package com.xworkz.swiggit.internal;

public class Bottle {
    private String bottleType;
    private boolean isBislery;
    private String bottleColor;

    public Bottle(String bottleType, boolean isBislery, String bottleColor) {
        this.bottleType = bottleType;
        this.isBislery = isBislery;
        this.bottleColor = bottleColor;
        System.out.println("10. Running Bottle Constructor");
    }

    @Override
    public String toString() {
        return "Bottle Type: " + bottleType + ", Is Bislery: " + isBislery +
                ", Bottle Color: " + bottleColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 777;
    }
}

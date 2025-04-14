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
    public String getBottleType() {
        return bottleType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Bottle) {
                System.out.println("Bottle is reference of object");
                Bottle bottle1 = this;
                Bottle bottle2 = (Bottle) obj;
                if (bottle1.bottleType.equals(bottle2.bottleType)) {
                    System.out.println("Both bottles are same");
                    return true;
                }
            }
        }
        return false;
    }
}

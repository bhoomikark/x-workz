package com.xworkz.swiggit.internal;

public class HandWash {
    private String handWashBrand;
    private boolean isMadeOfChemical;
    private String shapeOfHandWash;

    public HandWash(String handWashBrand, boolean isMadeOfChemical, String shapeOfHandWash) {
        this.handWashBrand = handWashBrand;
        this.isMadeOfChemical = isMadeOfChemical;
        this.shapeOfHandWash = shapeOfHandWash;
        System.out.println("13. Running HandWash Constructor");
    }

    @Override
    public String toString() {
        return "HandWash Brand: " + handWashBrand + ", Is Made of Chemical: " + isMadeOfChemical +
                ", Shape of HandWash: " + shapeOfHandWash;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 987;
    }
}

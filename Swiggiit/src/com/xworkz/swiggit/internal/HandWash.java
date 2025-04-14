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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof HandWash) {
                HandWash otherHandWash = (HandWash) obj;
                if (this.handWashBrand.equals(otherHandWash.handWashBrand) &&
                        this.isMadeOfChemical == otherHandWash.isMadeOfChemical &&
                        this.shapeOfHandWash.equals(otherHandWash.shapeOfHandWash)) {
                    System.out.println("Both Handwash objects are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

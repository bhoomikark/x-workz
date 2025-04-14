package com.xworkz.swiggit.internal;

public class HairOil {
    private String oilBrand;
    private double cost;
    private int ml;

    public HairOil(String oilBrand, double cost, int ml) {
        this.oilBrand = oilBrand;
        this.cost = cost;
        this.ml = ml;
        System.out.println("15. Running HairOil Constructor");
    }

    @Override
    public String toString() {
        return "Oil Brand: " + oilBrand + ", Cost: ₹" + cost + ", Volume: " + ml + "ml";
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 222;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof HairOil) {
                HairOil otherOil = (HairOil) obj;
                if (this.oilBrand.equals(otherOil.oilBrand) &&
                        this.cost == otherOil.cost &&
                        this.ml == otherOil.ml) {
                    System.out.println("Both hair oils are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

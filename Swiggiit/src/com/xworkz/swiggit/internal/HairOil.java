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
}

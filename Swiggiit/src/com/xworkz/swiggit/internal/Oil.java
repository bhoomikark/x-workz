package com.xworkz.swiggit.internal;

public class Oil {
    public String oilType;
    public String oilBrand;
    public boolean isEdible;

    public Oil(String oilType, String oilBrand, boolean isEdible) {
        this.oilType = oilType;
        this.oilBrand = oilBrand;
        this.isEdible = isEdible;
        System.out.println("90. Running Oil Constructor");
    }

    public String toString() {
        return "Oil Type: " + oilType + ", Brand: " + oilBrand + ", Edible: " + isEdible;
    }
}

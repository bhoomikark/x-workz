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
@Override
    public String toString() {
        return "Oil Type: " + oilType + ", Brand: " + oilBrand + ", Edible: " + isEdible;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 777;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Oil) {
                System.out.println("Oil is reference of Object");
                Oil o1 = this;
                Oil o2 = (Oil) obj;
                if (o1.oilType.equals(o2.oilType) &&
                        o1.oilBrand.equals(o2.oilBrand) &&
                        o1.isEdible == o2.isEdible) {
                    System.out.println("Both Oil objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

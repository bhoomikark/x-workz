package com.xworkz.swiggit.internal;

public class Hairband {
    private String hairbandBrand;
    private String hairbandColor;
    private String hairbandType;

    public Hairband(String hairbandBrand, String hairbandColor, String hairbandType) {
        this.hairbandBrand = hairbandBrand;
        this.hairbandColor = hairbandColor;
        this.hairbandType = hairbandType;
        System.out.println("38. Running Hairband Constructor");
    }

    @Override
    public String toString() {
        return "Hairband Brand: " + hairbandBrand + ", Hairband Color: " + hairbandColor +
                ", Hairband Type: " + hairbandType;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 321;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Hairband) {
                Hairband otherHairband = (Hairband) obj;
                if (this.hairbandBrand.equals(otherHairband.hairbandBrand) &&
                        this.hairbandColor.equals(otherHairband.hairbandColor) &&
                        this.hairbandType.equals(otherHairband.hairbandType)) {
                    System.out.println("Both hairbands are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

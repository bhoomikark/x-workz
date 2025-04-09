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
}

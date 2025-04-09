package com.xworkz.swiggit.internal;

public class Whitener {
    private String whitenerBrand;
    private String formType; // like pen or bottle
    private boolean isRefillable;

    public Whitener(String whitenerBrand, String formType, boolean isRefillable) {
        this.whitenerBrand = whitenerBrand;
        this.formType = formType;
        this.isRefillable = isRefillable;
        System.out.println("85. Running Whitener Constructor");
    }

    public String toString() {
        return "Brand: " + whitenerBrand + ", Form: " + formType + ", Refillable: " + isRefillable;
    }
}

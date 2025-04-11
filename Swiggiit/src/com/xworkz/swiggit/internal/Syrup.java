package com.xworkz.swiggit.internal;

public class Syrup {
    private String syrupBrand;
    private String isSyrupSweetOrSour;
    private String syrupColor;

    public Syrup(String syrupBrand, String isSyrupSweetOrSour, String syrupColor) {
        this.syrupBrand = syrupBrand;
        this.isSyrupSweetOrSour = isSyrupSweetOrSour;
        this.syrupColor = syrupColor;
        System.out.println("62. Running Syrup Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + syrupBrand + ", Taste: " + isSyrupSweetOrSour + ", Color: " + syrupColor;
    }
    @Override
    public int hashCode() {
        return 111;
    }
}

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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Syrup) {
                System.out.println("Syrup is reference of object");
                Syrup syrup1 = this;
                Syrup syrup2 = (Syrup) obj;


                if (syrup1.syrupBrand.equals(syrup2.syrupBrand) &&
                        syrup1.isSyrupSweetOrSour.equals(syrup2.isSyrupSweetOrSour)) {
                    System.out.println("Both Syrup objects are the same (based on Brand and Sweet/Sour)");
                    return true;
                }
            }
        }
        return false;
    }
}

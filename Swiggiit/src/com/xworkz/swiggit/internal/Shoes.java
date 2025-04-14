package com.xworkz.swiggit.internal;

public class Shoes {
    private String shoeBrand;
    private boolean isFormal;
    private String shoeColor;

    public Shoes(String shoeBrand, boolean isFormal, String shoeColor) {
        this.shoeBrand = shoeBrand;
        this.isFormal = isFormal;
        this.shoeColor = shoeColor;
        System.out.println("11. Running Shoes Constructor");
    }

    @Override
    public String toString() {
        return "Shoe Brand: " + shoeBrand + ", Is Formal: " + isFormal +
                ", Shoe Color: " + shoeColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 77;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoes) {
            Shoes otherShoes = (Shoes) obj;
            return this.shoeBrand.equals(otherShoes.shoeBrand) &&
                    this.isFormal == otherShoes.isFormal &&
                    this.shoeColor.equals(otherShoes.shoeColor);
        }
        return false;
    }
}

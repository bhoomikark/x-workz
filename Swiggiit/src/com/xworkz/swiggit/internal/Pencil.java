package com.xworkz.swiggit.internal;

public class Pencil {
    private String brand;
    private String pencilType;
    private boolean isSharpened;

    public Pencil(String brand, String pencilType, boolean isSharpened) {
        this.brand = brand;
        this.pencilType = pencilType;
        this.isSharpened = isSharpened;
        System.out.println("84. Running Pencil Constructor");
    }
@Override
    public String toString() {
        return "Brand: " + brand + ", Type: " + pencilType + ", Sharpened: " + isSharpened;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 888;
    }
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Pencil) {
                System.out.println("Pencil is reference of Object");
                Pencil p1 = this;
                Pencil p2 = (Pencil) obj;
                if (p1.brand.equals(p2.brand) &&
                        p1.pencilType.equals(p2.pencilType) &&
                        p1.isSharpened == p2.isSharpened) {
                    System.out.println("Both Pencil objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

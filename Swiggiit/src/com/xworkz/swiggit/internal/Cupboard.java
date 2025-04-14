package com.xworkz.swiggit.internal;

public class Cupboard {
    private String cupboardMaterial;
    private int noOfShelves;
    private String cupboardColor;

    public Cupboard(String cupboardMaterial, int noOfShelves, String cupboardColor) {
        this.cupboardMaterial = cupboardMaterial;
        this.noOfShelves = noOfShelves;
        this.cupboardColor = cupboardColor;
        System.out.println("61. Running Cupboard Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + cupboardMaterial + ", Shelves: " + noOfShelves + ", Color: " + cupboardColor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 555;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Cupboard) {
                System.out.println("Cupboard is reference of object");
                Cupboard cupboard1 = this;
                Cupboard cupboard2 = (Cupboard) obj;
                if (cupboard1.cupboardColor.equals(cupboard2.cupboardColor)) {
                    System.out.println("Both cupboards have the same color");
                    return true;
                }
            }
        }
        return false;
    }
}

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
}

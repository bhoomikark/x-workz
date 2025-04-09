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

    public String toString() {
        return "Brand: " + brand + ", Type: " + pencilType + ", Sharpened: " + isSharpened;
    }
}

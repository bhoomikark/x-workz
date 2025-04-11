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
}

package com.xworkz.swiggit.internal;

public class YogaMat {
    public String matMaterial;
    public String matColor;
    public boolean isEcoFriendly;

    public YogaMat(String matMaterial, String matColor, boolean isEcoFriendly) {
        this.matMaterial = matMaterial;
        this.matColor = matColor;
        this.isEcoFriendly = isEcoFriendly;
        System.out.println("96. Running Yoga Mat Constructor");
    }

    public String toString() {
        return "Material: " + matMaterial + ", Color: " + matColor + ", Eco-Friendly: " + isEcoFriendly;
    }
}

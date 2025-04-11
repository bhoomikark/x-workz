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
@Override
    public String toString() {
        return "Material: " + matMaterial + ", Color: " + matColor + ", Eco-Friendly: " + isEcoFriendly;
    }
    @Override
    public int hashCode() {
        return 134;
    }
}

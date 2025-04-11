package com.xworkz.swiggit.internal;

public class Screen {
    private String screenType;
    private String screenMaterial;
    private String screenShape;

    public Screen(String screenType, String screenMaterial, String screenShape) {
        this.screenType = screenType;
        this.screenMaterial = screenMaterial;
        this.screenShape = screenShape;
        System.out.println("50. Running Screen Constructor");
    }

    @Override
    public String toString() {
        return "Screen Type: " + screenType + ", Screen Material: " + screenMaterial +
                ", Screen Shape: " + screenShape;
    }

    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 999;
    }
}

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
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Screen) {
            Screen otherScreen = (Screen) obj;
            return this.screenType.equals(otherScreen.screenType) &&
                    this.screenMaterial.equals(otherScreen.screenMaterial) &&
                    this.screenShape.equals(otherScreen.screenShape);
        }
        return false;
    }
}

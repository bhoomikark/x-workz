package com.xworkz.swiggit.internal;

public class Umbrella {
    public String umbrellaType;
    public String umbrellaColor;
    public boolean isFoldable;

    public Umbrella(String umbrellaType, String umbrellaColor, boolean isFoldable) {
        this.umbrellaType = umbrellaType;
        this.umbrellaColor = umbrellaColor;
        this.isFoldable = isFoldable;
        System.out.println("91. Running Umbrella Constructor");
    }
@Override
    public String toString() {
        return "Type: " + umbrellaType + ", Color: " + umbrellaColor + ", Foldable: " + isFoldable;
    }
    @Override
    public int hashCode() {
        return 122;
    }
}

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
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Umbrella) {
            Umbrella umbrella1 = this;
            Umbrella umbrella2 = (Umbrella) obj;


            return umbrella1.umbrellaType.equals(umbrella2.umbrellaType) &&
                    umbrella1.umbrellaColor.equals(umbrella2.umbrellaColor);
        }
        return false;
    }
}

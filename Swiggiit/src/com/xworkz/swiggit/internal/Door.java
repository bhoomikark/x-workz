package com.xworkz.swiggit.internal;

public class Door {
    public String doorType;
    public String doorMaterial;
    public boolean isAutomatic;

    public Door(String doorType, String doorMaterial, boolean isAutomatic) {
        this.doorType = doorType;
        this.doorMaterial = doorMaterial;
        this.isAutomatic = isAutomatic;
        System.out.println("86. Running Door Constructor");
    }

    public String toString() {
        return "Door Type: " + doorType + ", Material: " + doorMaterial + ", Automatic: " + isAutomatic;
    }
}

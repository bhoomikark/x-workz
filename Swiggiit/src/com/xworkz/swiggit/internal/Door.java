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
@Override
    public String toString() {
        return "Door Type: " + doorType + ", Material: " + doorMaterial + ", Automatic: " + isAutomatic;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 55;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Door) {
            Door other = (Door) obj;
            return this.doorType.equals(other.doorType);
        }
        return false;
    }
}

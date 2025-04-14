package com.xworkz.swiggit.internal;

public class Pant {
    private String pantColor;
    private String pantType;
    private boolean isThatPantGymAttire;

    public Pant(String pantColor, String pantType, boolean isThatPantGymAttire) {
        this.pantColor = pantColor;
        this.pantType = pantType;
        this.isThatPantGymAttire = isThatPantGymAttire;
        System.out.println("28. Running Pant Constructor");
    }

    @Override
    public String toString() {
        return "Pant Color: " + pantColor + ", Pant Type: " + pantType +
                ", Is That Pant Gym Attire: " + isThatPantGymAttire;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 888;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Pant) {
                System.out.println("Pant is reference of Object");
                Pant p1 = this;
                Pant p2 = (Pant) obj;
                if (p1.pantColor.equals(p2.pantColor) &&
                        p1.pantType.equals(p2.pantType) &&
                        p1.isThatPantGymAttire == p2.isThatPantGymAttire) {
                    System.out.println("Both Pant objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

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
}

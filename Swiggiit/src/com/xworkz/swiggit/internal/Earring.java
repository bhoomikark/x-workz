package com.xworkz.swiggit.internal;

public class Earring {
    private String earringColor;
    private String earringShape;
    private String earringMadeUpOf;

    public Earring(String earringColor, String earringShape, String earringMadeUpOf) {
        this.earringColor = earringColor;
        this.earringShape = earringShape;
        this.earringMadeUpOf = earringMadeUpOf;
        System.out.println("36. Running Earrings Constructor");
    }

    @Override
    public String toString() {
        return "Earring Color: " + earringColor + ", Earring Shape: " + earringShape +
                ", Made Up Of: " + earringMadeUpOf;
    }
}

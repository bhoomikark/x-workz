package com.xworkz.swiggit.internal;

public class Blanket {
    private String blanketColor;
    private String blanketType;
    private int blanketNo;

    public Blanket(String blanketColor, String blanketType, int blanketNo) {
        this.blanketColor = blanketColor;
        this.blanketType = blanketType;
        this.blanketNo = blanketNo;
        System.out.println("33. Running Blanket Constructor");
    }

    @Override
    public String toString() {
        return "Blanket Color: " + blanketColor + ", Blanket Type: " + blanketType +
                ", Blanket No: " + blanketNo;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 444;
    }
    public String getBlanketColor() {
        return blanketColor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Blanket) {
                System.out.println("Blanket is reference of object");
                Blanket b1 = this;
                Blanket b2 = (Blanket) obj;
                if (b1.blanketColor.equals(b2.blanketColor)) {
                    System.out.println("Both blankets are of the same color");
                    return true;
                }
            }
        }
        return false;
    }
}

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
}

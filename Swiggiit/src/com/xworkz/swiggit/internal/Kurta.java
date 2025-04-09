package com.xworkz.swiggit.internal;

public class Kurta {
    private String kurtaDesign;
    private String kurtaType;
    private String kurtaColor;

    public Kurta(String kurtaDesign, String kurtaType, String kurtaColor) {
        this.kurtaDesign = kurtaDesign;
        this.kurtaType = kurtaType;
        this.kurtaColor = kurtaColor;
        System.out.println("37. Running Kurta Constructor");
    }

    @Override
    public String toString() {
        return "Kurta Design: " + kurtaDesign + ", Kurta Type: " + kurtaType +
                ", Kurta Color: " + kurtaColor;
    }
}

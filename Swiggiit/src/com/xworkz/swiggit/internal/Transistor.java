package com.xworkz.swiggit.internal;

public class Transistor {
    private String transistorType;
    private String transistorMaterial;
    private String transistorShape;

    public Transistor(String transistorType, String transistorMaterial, String transistorShape) {
        this.transistorType = transistorType;
        this.transistorMaterial = transistorMaterial;
        this.transistorShape = transistorShape;
        System.out.println("45. Running Transistor Constructor");
    }

    @Override
    public String toString() {
        return "Transistor Type: " + transistorType + ", Material: " + transistorMaterial + ", Shape: " + transistorShape;
    }
    @Override
    public int hashCode() {
        return 119;
    }
}

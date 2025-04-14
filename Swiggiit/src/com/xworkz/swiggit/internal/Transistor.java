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
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Transistor) {
            Transistor transistor1 = this;
            Transistor transistor2 = (Transistor) obj;


            if (transistor1.transistorType.equals(transistor2.transistorType) &&
                    transistor1.transistorMaterial.equals(transistor2.transistorMaterial) &&
                    transistor1.transistorShape.equals(transistor2.transistorShape)) {
                return true;
            }
        }
        return false;
    }
}

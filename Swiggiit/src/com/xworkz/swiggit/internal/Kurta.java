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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 999;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Kurta) {
                System.out.println("Kurta is reference of object");
                Kurta kurta1 = this;
                Kurta kurta2 = (Kurta) obj;
                if (kurta1.kurtaDesign.equals(kurta2.kurtaDesign) &&
                        kurta1.kurtaType.equals(kurta2.kurtaType) &&
                        kurta1.kurtaColor.equals(kurta2.kurtaColor)) {
                    System.out.println("Both kurtas are same");
                    return true;
                }
            }
        }
        return false;
    }
}

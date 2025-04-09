package com.xworkz.swiggit.internal;

public class PhoneCase {
    public String caseMaterial;
    public String caseColor;
    public boolean isFlipCover;

    public PhoneCase(String caseMaterial, String caseColor, boolean isFlipCover) {
        this.caseMaterial = caseMaterial;
        this.caseColor = caseColor;
        this.isFlipCover = isFlipCover;
        System.out.println("88. Running PhoneCase Constructor");
    }

    public String toString() {
        return "Material: " + caseMaterial + ", Color: " + caseColor + ", Flip Cover: " + isFlipCover;
    }
}

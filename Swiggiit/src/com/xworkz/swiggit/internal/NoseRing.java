package com.xworkz.swiggit.internal;

public class NoseRing {
    private boolean noseRingGoldOrNot;
    private String noseRingDesign;
    private String noseRingMaterial;

    public NoseRing(boolean noseRingGoldOrNot, String noseRingDesign, String noseRingMaterial) {
        this.noseRingGoldOrNot = noseRingGoldOrNot;
        this.noseRingDesign = noseRingDesign;
        this.noseRingMaterial = noseRingMaterial;
        System.out.println("46. Running NoseRing Constructor");
    }

    @Override
    public String toString() {
        return "Is Gold: " + noseRingGoldOrNot + ", Design: " + noseRingDesign + ", Material: " + noseRingMaterial;
    }
}

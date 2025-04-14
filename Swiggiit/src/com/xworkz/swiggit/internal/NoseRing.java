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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 333;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof NoseRing) {
                System.out.println("NoseRing is reference of Object");
                NoseRing n1 = this;
                NoseRing n2 = (NoseRing) obj;
                if (n1.noseRingGoldOrNot == n2.noseRingGoldOrNot &&
                        n1.noseRingDesign.equals(n2.noseRingDesign) &&
                        n1.noseRingMaterial.equals(n2.noseRingMaterial)) {
                    System.out.println("Both NoseRing objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

package com.xworkz.swiggit.internal;

public class PlantPot {
    public String potMaterial;
    public String plantType;
    public boolean isIndoor;

    public PlantPot(String potMaterial, String plantType, boolean isIndoor) {
        this.potMaterial = potMaterial;
        this.plantType = plantType;
        this.isIndoor = isIndoor;
        System.out.println("99. Running Plant Pot Constructor");
    }
@Override
    public String toString() {
        return "Material: " + potMaterial + ", Plant: " + plantType + ", Indoor: " + isIndoor;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 606;
    }
}

package com.xworkz.swiggit.internal;

public class Lantern {
    public String lanternType;
    public String lanternMaterial;
    public boolean isElectric;

    public Lantern(String lanternType, String lanternMaterial, boolean isElectric) {
        this.lanternType = lanternType;
        this.lanternMaterial = lanternMaterial;
        this.isElectric = isElectric;
        System.out.println("87. Running Lantern Constructor");
    }
@Override
    public String toString() {
        return "Lantern Type: " + lanternType + ", Material: " + lanternMaterial + ", Electric: " + isElectric;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 707;
    }
}

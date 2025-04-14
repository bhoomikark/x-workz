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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Lantern) {
                System.out.println("Lantern is reference of object");
                Lantern lantern1 = this;
                Lantern lantern2 = (Lantern) obj;
                if (lantern1.lanternType.equals(lantern2.lanternType) &&
                        lantern1.lanternMaterial.equals(lantern2.lanternMaterial) &&
                        lantern1.isElectric == lantern2.isElectric) {
                    System.out.println("Both lanterns are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

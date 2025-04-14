package com.xworkz.swiggit.internal;

public class Lipstick {
    private String lipstickBrand;
    private String ownerName;
    private int noOfShadesAvailable;

    public Lipstick(String lipstickBrand, String ownerName, int noOfShadesAvailable) {
        this.lipstickBrand = lipstickBrand;
        this.ownerName = ownerName;
        this.noOfShadesAvailable = noOfShadesAvailable;
        System.out.println("57. Running Lipstick Constructor");
    }

    @Override
    public String toString() {
        return "Lipstick Brand: " + lipstickBrand + ", Owner Name: " + ownerName + ", Number of Shades: " + noOfShadesAvailable;
    }

    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 525;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Lipstick) {
                System.out.println("Lipstick is reference of object");
                Lipstick lipstick1 = this;
                Lipstick lipstick2 = (Lipstick) obj;
                if (lipstick1.lipstickBrand.equals(lipstick2.lipstickBrand)
                        && lipstick1.ownerName.equals(lipstick2.ownerName)
                        && lipstick1.noOfShadesAvailable == lipstick2.noOfShadesAvailable) {
                    System.out.println("Both lipsticks are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

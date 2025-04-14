package com.xworkz.swiggit.internal;

public class Perfume {
    private String perfumeName;
    private String perfumeBrand;
    private String perfumeType;

    public Perfume(String perfumeName, String perfumeBrand, String perfumeType) {
        this.perfumeName = perfumeName;
        this.perfumeBrand = perfumeBrand;
        this.perfumeType = perfumeType;
        System.out.println("70. Running Perfume Constructor");
    }

    @Override
    public String toString() {
        return "Perfume Name: " + perfumeName +
                ", Brand: " + perfumeBrand +
                ", Type: " + perfumeType;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 77;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Perfume) {
                System.out.println("Perfume is reference of Object");
                Perfume p1 = this;
                Perfume p2 = (Perfume) obj;
                if (p1.perfumeName.equals(p2.perfumeName) &&
                        p1.perfumeBrand.equals(p2.perfumeBrand) &&
                        p1.perfumeType.equals(p2.perfumeType)) {
                    System.out.println("Both Perfume objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

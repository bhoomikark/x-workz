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
}

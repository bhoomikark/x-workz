package com.xworkz.swiggit.internal;

public class Cup {
    private String cupMaterial;
    private String cupShape;
    private String cupSize;

    public Cup(String cupMaterial, String cupShape, String cupSize) {
        this.cupMaterial = cupMaterial;
        this.cupShape = cupShape;
        this.cupSize = cupSize;
        System.out.println("29. Running Cups Constructor");
    }

    @Override
    public String toString() {
        return "Cup Material: " + cupMaterial + ", Cup Shape: " + cupShape +
                ", Cup Size: " + cupSize;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 666;
    }
}

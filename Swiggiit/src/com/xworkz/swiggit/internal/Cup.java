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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Cup) {
                System.out.println("Cup is reference of object");
                Cup cup1 = this;
                Cup cup2 = (Cup) obj;
                if (cup1.cupMaterial.equals(cup2.cupMaterial)) {
                    System.out.println("Both cups are made of the same material");
                    return true;
                }
            }
        }
        return false;
    }
}

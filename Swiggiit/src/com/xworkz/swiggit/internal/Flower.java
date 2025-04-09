package com.xworkz.swiggit.internal;

public class Flower {
    private String flowerName;
    private String flowerType;
    private String flowerFlorescence;

    public Flower(String flowerName, String flowerType, String flowerFlorescence) {
        this.flowerName = flowerName;
        this.flowerType = flowerType;
        this.flowerFlorescence = flowerFlorescence;
        System.out.println("20. Running Flower Constructor");
    }

    @Override
    public String toString() {
        return "Flower Name: " + flowerName + ", Flower Type: " + flowerType +
                ", Flower Florescence: " + flowerFlorescence;
    }
}

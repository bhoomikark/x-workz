package com.xworkz.swiggit.internal;

public class Bucket {
    private String bucketColor;
    private String bucketBrand;
    private String bucketShape;

    public Bucket(String bucketColor, String bucketBrand, String bucketShape) {
        this.bucketColor = bucketColor;
        this.bucketBrand = bucketBrand;
        this.bucketShape = bucketShape;
        System.out.println("14. Running Bucket Constructor");
    }

    @Override
    public String toString() {
        return "Bucket Color: " + bucketColor + ", Bucket Brand: " + bucketBrand +
                ", Bucket Shape: " + bucketShape;
    }
}

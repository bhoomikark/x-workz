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
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 999;
    }
    public String getBucketColor() {
        return bucketColor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Bucket) {
                System.out.println("Bucket is reference of object");
                Bucket bucket1 = this;
                Bucket bucket2 = (Bucket) obj;
                if (bucket1.bucketColor.equals(bucket2.bucketColor)) {
                    System.out.println("Both buckets are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

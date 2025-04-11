package com.xworkz.swiggit.internal;

public class SlidingWindow {
    private String slidingWindowShape;
    private String material;
    private int noOfWindowFittable;

    public SlidingWindow(String slidingWindowShape, String material, int noOfWindowFittable) {
        this.slidingWindowShape = slidingWindowShape;
        this.material = material;
        this.noOfWindowFittable = noOfWindowFittable;
        System.out.println("40. Running SlidingWindow Constructor");
    }

    @Override
    public String toString() {
        return "SlidingWindow Shape: " + slidingWindowShape + ", Material: " + material +
                ", No. of Window Fittable: " + noOfWindowFittable;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 404;
    }
}

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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof SlidingWindow) {
                System.out.println("SlidingWindow is reference of object");
                SlidingWindow sw1 = this;
                SlidingWindow sw2 = (SlidingWindow) obj;

                if (sw1.slidingWindowShape.equals(sw2.slidingWindowShape)
                        && sw1.material.equals(sw2.material)) {
                    System.out.println("Both SlidingWindows are same (based on shape and material)");
                    return true;
                }
            }
        }
        return false;
    }

}

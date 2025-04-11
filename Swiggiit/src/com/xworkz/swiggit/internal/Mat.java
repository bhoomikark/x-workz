package com.xworkz.swiggit.internal;

public class Mat {
    private String matColor;
    private int numberOfThreadsUsed;
    private String matShape;

    public Mat(String matColor, int numberOfThreadsUsed, String matShape) {
        this.matColor = matColor;
        this.numberOfThreadsUsed = numberOfThreadsUsed;
        this.matShape = matShape;
        System.out.println("26. Running Mat Constructor");
    }

    @Override
    public String toString() {
        return "Mat Color: " + matColor + ", Number of Threads Used: " + numberOfThreadsUsed +
                ", Mat Shape: " + matShape;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 707;
    }
}

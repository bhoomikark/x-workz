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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Mat) {
                System.out.println("Mat is reference of Object");
                Mat mat1 = this;
                Mat mat2 = (Mat) obj;
                if (mat1.matColor.equals(mat2.matColor) &&
                        mat1.numberOfThreadsUsed == mat2.numberOfThreadsUsed &&
                        mat1.matShape.equals(mat2.matShape)) {
                    System.out.println("Both Mat objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

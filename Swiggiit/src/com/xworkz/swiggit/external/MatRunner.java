package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Mat;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("Maroon", 1200, "Rectangle");
        System.out.println("Mat to string: " + mat.toString());
        System.out.println("Overridden HashCode: " + mat.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(mat));
        Mat mat1 = new Mat("Maroon", 1200, "Rectangle");
        Mat mat2 = new Mat("Blue", 1000, "Round");

        System.out.println("mat.equals(mat1)? " + mat.equals(mat1));
        System.out.println("mat.equals(mat2)? " + mat.equals(mat2));
    }
}

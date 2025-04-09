package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Mat;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("Maroon", 1200, "Rectangle");
        System.out.println("Mat to string: " + mat.toString());
    }
}

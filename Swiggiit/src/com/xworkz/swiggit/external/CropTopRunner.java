package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.CropTop;

public class CropTopRunner {
    public static void main(String[] args) {
        CropTop cropTop = new CropTop("Medium", "Cotton", "Peach");

        System.out.println("CropTop to string: " + cropTop.toString());
        System.out.println("CropTop HashCode: " + cropTop.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(cropTop));
    }
}

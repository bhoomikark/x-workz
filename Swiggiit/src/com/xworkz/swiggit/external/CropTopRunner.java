package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.CropTop;

public class CropTopRunner {
    public static void main(String[] args) {
        CropTop cropTop = new CropTop("Medium", "Cotton", "Peach");

        System.out.println("CropTop to string: " + cropTop.toString());
        System.out.println("CropTop HashCode: " + cropTop.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(cropTop));
        CropTop cropTop1 = new CropTop("Small", "Silk", "Peach");
        CropTop cropTop2 = new CropTop("Large", "Linen", "Blue");

        System.out.println("Are at same location or not: " + (cropTop1 == cropTop2));
        boolean value = cropTop2.equals(cropTop);
        System.out.println("Are both CropTops the same? " + value);
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.YogaMat;

public class YogaMatRunner {
    public static void main(String[] args) {
        YogaMat mat = new YogaMat("Foam", "Green", true);
        System.out.println(mat);
        System.out.println("Overridden HashCode: " + mat.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(mat));
        YogaMat mat1 = new YogaMat("Foam", "Green", true);
        YogaMat mat2 = new YogaMat("Foam", "Green", false);
        YogaMat mat3 = new YogaMat("Rubber", "Black", true);

        System.out.println("mat1.equals(mat2)? " + mat1.equals(mat2));
        System.out.println("mat1.equals(mat3)? " + mat1.equals(mat3));
    }
}

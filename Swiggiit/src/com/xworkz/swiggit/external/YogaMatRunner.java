package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.YogaMat;

public class YogaMatRunner {
    public static void main(String[] args) {
        YogaMat mat = new YogaMat("Foam", "Green", true);
        System.out.println(mat);
        System.out.println("Overridden HashCode: " + mat.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(mat));
    }
}

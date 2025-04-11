package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Desert;

public class DesertRunner {
    public static void main(String[] args) {
        Desert desert = new Desert("Ice Cream Sundae", 2, "Choco Chips & Nuts");
        System.out.println("Desert to string: " + desert.toString());
        System.out.println("Desert HashCode: " + desert.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(desert));
    }
}

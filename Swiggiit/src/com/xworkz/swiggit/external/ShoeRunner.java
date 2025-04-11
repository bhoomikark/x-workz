package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Shoes;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoes shoes = new Shoes("Bata", true, "Black");

        System.out.println("Shoe to string: " + shoes.toString());
        System.out.println("Overridden HashCode: " + shoes.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(shoes));
    }
}

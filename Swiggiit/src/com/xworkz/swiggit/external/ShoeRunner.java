package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Shoes;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoes shoes = new Shoes("Bata", true, "Black");

        System.out.println("Shoe to string: " + shoes.toString());
        System.out.println("Overridden HashCode: " + shoes.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(shoes));
        Shoes shoes1 = new Shoes("Bata", true, "Black");
        Shoes shoes2 = new Shoes("Nike", false, "White");

        System.out.println("shoes.equals(shoes1)? " + shoes.equals(shoes1));
        System.out.println("shoes.equals(shoes2)? " + shoes.equals(shoes2));
    }
}

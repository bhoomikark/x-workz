package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Desert;

public class DesertRunner {
    public static void main(String[] args) {
        Desert desert = new Desert("Ice Cream Sundae", 2, "Choco Chips & Nuts");
        System.out.println("Desert to string: " + desert.toString());
        System.out.println("Desert HashCode: " + desert.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(desert));
        Desert desert1 = new Desert("Ice Cream Sundae", 3, "Caramel");
        Desert desert2 = new Desert("Brownie", 1, "Walnuts");

        System.out.println("Are both deserts same location: " + (desert1 == desert2));
        boolean value = desert1.equals(desert);
        System.out.println("Are desert1 and desert equal? " + value);
    }
}

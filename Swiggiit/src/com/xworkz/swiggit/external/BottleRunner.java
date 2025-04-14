package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Plastic", true, "Transparent");

        System.out.println("Bottle to string: " + bottle.toString());
        System.out.println("Bottle HashCode: " + bottle.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(bottle));
        Bottle bottle1 = new Bottle("Glass", false, "Blue");
        Bottle bottle2 = new Bottle("Plastic", true, "Transparent");

        System.out.println("Are at same location or not: " + (bottle1 == bottle2));
        boolean value = bottle2.equals(bottle);
        System.out.println("Are both bottles same? " + value);
    }
}

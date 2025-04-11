package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Plastic", true, "Transparent");

        System.out.println("Bottle to string: " + bottle.toString());
        System.out.println("Bottle HashCode: " + bottle.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(bottle));
    }
}

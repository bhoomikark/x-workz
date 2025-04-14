package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WaterBottle;

public class WaterBottleRunner {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle("Transparent Blue", "Milton", "Insulated");
        System.out.println(bottle);
        System.out.println("Overridden HashCode: " + bottle.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(bottle));
        WaterBottle bottle1 = new WaterBottle("Transparent Blue", "Milton", "Insulated");
        WaterBottle bottle2 = new WaterBottle("Red", "Cello", "Plastic");

        System.out.println("bottle.equals(bottle1)? " + bottle.equals(bottle1));
        System.out.println("bottle.equals(bottle2)? " + bottle.equals(bottle2));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WaterBottle;

public class WaterBottleRunner {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle("Transparent Blue", "Milton", "Insulated");
        System.out.println(bottle);
        System.out.println("Overridden HashCode: " + bottle.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(bottle));
    }
}

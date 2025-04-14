package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Lantern;

public class LanternRunner {
    public static void main(String[] args) {
        Lantern lantern = new Lantern("Hurricane", "Metal", true);
        System.out.println(lantern);
        System.out.println("Overridden HashCode: " + lantern.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(lantern));
        Lantern lantern1 = new Lantern("Glass", "Steel", false);
        Lantern lantern2 = new Lantern("Hurricane", "Metal", true);

        System.out.println("Are at same location or not: " + (lantern1 == lantern2));
        boolean value = lantern2.equals(lantern);
        System.out.println("Are they equal: " + value);
    }
}

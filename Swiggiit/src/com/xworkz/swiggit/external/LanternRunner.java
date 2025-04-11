package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Lantern;

public class LanternRunner {
    public static void main(String[] args) {
        Lantern lantern = new Lantern("Hurricane", "Metal", true);
        System.out.println(lantern);
        System.out.println("Overridden HashCode: " + lantern.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(lantern));
    }
}

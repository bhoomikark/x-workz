package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow("Silk", "Sleepwell", "Floral");
        System.out.println("Pillow to string: " + pillow.toString());
        System.out.println("Overridden HashCode: " + pillow.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(pillow));
        Pillow pillow1 = new Pillow("Silk", "Sleepwell", "Floral");
        Pillow pillow2 = new Pillow("Cotton", "Bajaj", "Plain");

        System.out.println("pillow.equals(pillow1)? " + pillow.equals(pillow1));
        System.out.println("pillow.equals(pillow2)? " + pillow.equals(pillow2));
    }
}

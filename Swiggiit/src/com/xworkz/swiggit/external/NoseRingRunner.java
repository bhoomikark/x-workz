package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.NoseRing;

public class NoseRingRunner {
    public static void main(String[] args) {
        NoseRing noseRing = new NoseRing(true, "Floral", "Gold");
        System.out.println("NoseRing to string: " + noseRing.toString());
        System.out.println("Overridden HashCode: " + noseRing.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(noseRing));

        NoseRing noseRing1 = new NoseRing(true, "Floral", "Gold");
        NoseRing noseRing2 = new NoseRing(false, "Diamond", "Silver");

        System.out.println("noseRing.equals(noseRing1)? " + noseRing.equals(noseRing1));
        System.out.println("noseRing.equals(noseRing2)? " + noseRing.equals(noseRing2));
    }
}

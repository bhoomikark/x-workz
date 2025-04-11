package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.HandWash;

public class HandWashRunner {
    public static void main(String[] args) {
        HandWash handWash = new HandWash("Dettol", true, "Round");
        System.out.println("HandWash to string: " + handWash.toString());
        System.out.println("Overridden HashCode: " + handWash.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(handWash));
    }
}

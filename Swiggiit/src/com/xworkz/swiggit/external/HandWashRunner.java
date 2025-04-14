package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.HandWash;

public class HandWashRunner {
    public static void main(String[] args) {
        HandWash handWash = new HandWash("Dettol", true, "Round");
        System.out.println("HandWash to string: " + handWash.toString());
        System.out.println("Overridden HashCode: " + handWash.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(handWash));
        HandWash handWash1 = new HandWash("Dettol", true, "Round");
        HandWash handWash2 = new HandWash("Dettol", true, "Round");
        HandWash handWash3 = new HandWash("Santoor", false,"Square");
        System.out.println("Are HandWash1 and HandWash2 equal? " + handWash1.equals(handWash2));
        System.out.println("Are HandWash1 and HandWash3 equal? " + handWash1.equals(handWash3));
    }
}

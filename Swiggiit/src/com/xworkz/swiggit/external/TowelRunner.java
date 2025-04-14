package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("Cotton", 2, "Blue");
        System.out.println("Towel to string: " + towel.toString());
        System.out.println("Overridden HashCode: " + towel.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(towel));
        Towel towel1 = new Towel("Cotton", 2, "Blue");
        Towel towel2 = new Towel("Silk", 3, "Red");

        System.out.println("towel.equals(towel1)? " + towel.equals(towel1));
        System.out.println("towel.equals(towel2)? " + towel.equals(towel2));
    }
}

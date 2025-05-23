package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Staircase;

public class StaircaseRunner {
    public static void main(String[] args) {
        Staircase staircase = new Staircase(15, true, "Spiral");

        System.out.println("Staircase to string: " + staircase.toString());
        System.out.println("Overridden HashCode: " + staircase.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(staircase));
        Staircase staircase1 = new Staircase(15, false, "Spiral");
        System.out.println("staircase.equals(staircase1)? " + staircase.equals(staircase1));

    }
}

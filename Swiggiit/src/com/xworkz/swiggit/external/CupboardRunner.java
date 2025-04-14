package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Wood", 5, "Brown");
        System.out.println(cupboard);
        System.out.println("Cupboard HashCode: " + cupboard.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(cupboard));
        Cupboard cupboard1 = new Cupboard("Metal", 4, "Brown");
        Cupboard cupboard2 = new Cupboard("Plastic", 2, "Grey");

        System.out.println("Are at same location or not: " + (cupboard1 == cupboard2));
        boolean value = cupboard2.equals(cupboard);
        System.out.println("Are both cupboards the same? " + value);
    }
}

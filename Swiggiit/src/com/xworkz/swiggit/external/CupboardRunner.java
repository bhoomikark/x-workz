package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Wood", 5, "Brown");
        System.out.println(cupboard);
        System.out.println("Cupboard HashCode: " + cupboard.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(cupboard));
    }
}

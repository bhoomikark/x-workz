package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Guitar;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Acoustic", 6, false);
        System.out.println(guitar);
        System.out.println("Overridden HashCode: " + guitar.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(guitar));
        Guitar guitar2 = new Guitar("Electric", 6, true);
        Guitar guitar1 = new Guitar("Acoustic", 6, false);
        System.out.println("Are Guitar1 and Guitar3 equal? " + guitar1.equals(guitar2));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Tarzen;

public class TarzenRunner {
    public static void main(String[] args) {
        Tarzen tarzen = new Tarzen("Hit", false, 5);
        System.out.println("Tarzen to string: " + tarzen.toString());
        System.out.println("Overridden HashCode: " + tarzen.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(tarzen));
        Tarzen tarzen1 = new Tarzen("Hit", false, 5);
        Tarzen tarzen2 = new Tarzen("Flop", true, 3);


        System.out.println("tarzen.equals(tarzen1)? " + tarzen.equals(tarzen1));

        System.out.println("tarzen.equals(tarzen2)? " + tarzen.equals(tarzen2));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Tarzen;

public class TarzenRunner {
    public static void main(String[] args) {
        Tarzen tarzen = new Tarzen("Hit", false, 5);
        System.out.println("Tarzen to string: " + tarzen.toString());
        System.out.println("Overridden HashCode: " + tarzen.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(tarzen));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Transistor;

public class TransistorRunner {
    public static void main(String[] args) {
        Transistor transistor = new Transistor("NPN", "Silicon", "Cylindrical");
        System.out.println("Transistor to string: " + transistor.toString());
        System.out.println("Overridden HashCode: " + transistor.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(transistor));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Transistor;

public class TransistorRunner {
    public static void main(String[] args) {
        Transistor transistor = new Transistor("NPN", "Silicon", "Cylindrical");
        System.out.println("Transistor to string: " + transistor.toString());
        System.out.println("Overridden HashCode: " + transistor.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(transistor));
        Transistor transistor1 = new Transistor("NPN", "Silicon", "Cylindrical");
        Transistor transistor2 = new Transistor("PNP", "Germanium", "Rectangular");


        System.out.println("transistor.equals(transistor1)? " + transistor.equals(transistor1));
        System.out.println("transistor.equals(transistor2)? " + transistor.equals(transistor2));
    }
}

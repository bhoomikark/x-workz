package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Uber;

public class UberRunner {
    public static void main(String[] args) {
        Uber uber = new Uber(4, "Car", "KA01AB1234");
        System.out.println("Uber to string: " + uber.toString());
        System.out.println("Overridden HashCode: " + uber.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(uber));
        Uber uber1 = new Uber(4, "Car", "KA01AB1234");
        Uber uber2 = new Uber(3, "Auto", "KA01CD5678");


        System.out.println("uber.equals(uber1)? " + uber.equals(uber1));
        System.out.println("uber.equals(uber2)? " + uber.equals(uber2));
    }
    }


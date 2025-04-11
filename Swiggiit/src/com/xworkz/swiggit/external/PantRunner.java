package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Pant;

public class PantRunner {
    public static void main(String[] args) {
        Pant pant = new Pant("Black", "Jogger", true);
        System.out.println("Pant to string: " + pant.toString());
        System.out.println("Overridden HashCode: " + pant.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(pant));
    }
}

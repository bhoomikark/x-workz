package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Spects;

public class SpectsRunner {
    public static void main(String[] args) {
        Spects spects = new Spects("Reading", "Titanium", 2);
        System.out.println("Spects to string: " + spects.toString());
        System.out.println("Overridden HashCode: " + spects.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(spects));
        Spects spects1 = new Spects("Reading", "Titanium", 2);
        Spects spects2 = new Spects("Reading", "Titanium", 3);
        System.out.println("spects.equals(spects1)? " + spects.equals(spects1));
        System.out.println("spects.equals(spects2)? " + spects.equals(spects2));

    }
}

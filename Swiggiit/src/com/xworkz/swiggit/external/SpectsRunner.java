package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Spects;

public class SpectsRunner {
    public static void main(String[] args) {
        Spects spects = new Spects("Reading", "Titanium", 2);
        System.out.println("Spects to string: " + spects.toString());
    }
}

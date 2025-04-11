package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel=new Towel("Cotton",2,"Blue");
        System.out.println("Towel to string: "+towel.toString());
        System.out.println("Overridden HashCode: " + towel.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(towel));
    }
}

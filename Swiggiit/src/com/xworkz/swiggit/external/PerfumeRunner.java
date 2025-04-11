package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume = new Perfume("Euphoria", "Calvin Klein", "Floral");
        System.out.println(perfume);
        System.out.println("Overridden HashCode: " + perfume.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(perfume));
    }
}

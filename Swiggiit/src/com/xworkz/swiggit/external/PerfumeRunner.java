package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume = new Perfume("Euphoria", "Calvin Klein", "Floral");
        System.out.println(perfume);
        System.out.println("Overridden HashCode: " + perfume.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(perfume));
        Perfume perfume1 = new Perfume("Euphoria", "Calvin Klein", "Floral");
        Perfume perfume2 = new Perfume("Chanel No.5", "Chanel", "Woody");

        System.out.println("perfume.equals(perfume1)? " + perfume.equals(perfume1));
        System.out.println("perfume.equals(perfume2)? " + perfume.equals(perfume2));
    }
}

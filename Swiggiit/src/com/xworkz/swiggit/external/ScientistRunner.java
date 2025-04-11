package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Scientist;

public class ScientistRunner {
    public static void main(String[] args) {
        Scientist scientist = new Scientist("APJ Abdul Kalam", "India", "Missile Man of India");
        System.out.println(scientist);
        System.out.println("Overridden HashCode: " + scientist.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(scientist));
    }
}

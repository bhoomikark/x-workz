package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Scientist;

public class ScientistRunner {
    public static void main(String[] args) {
        Scientist scientist = new Scientist("APJ Abdul Kalam", "India", "Missile Man of India");
        System.out.println(scientist);
        System.out.println("Overridden HashCode: " + scientist.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(scientist));
        Scientist scientist1 = new Scientist("APJ Abdul Kalam", "India", "Missile Man of India");
        Scientist scientist2 = new Scientist("Stephen Hawking", "UK", "Theoretical Physicist");

        System.out.println("scientist.equals(scientist1)? " + scientist.equals(scientist1));
        System.out.println("scientist.equals(scientist2)? " + scientist.equals(scientist2));
    }
}

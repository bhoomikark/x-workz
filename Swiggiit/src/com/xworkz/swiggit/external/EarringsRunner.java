package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Earring;

public class EarringsRunner {
    public static void main(String[] args) {
        Earring earrings = new Earring("Silver", "Hoop", "Metal");
        System.out.println("Earrings to string: " + earrings.toString());
        System.out.println("Earrings HashCode: " + earrings.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(earrings));
        Earring earrings1 = new Earring("Silver", "Hoop", "Metal");
        Earring earrings2 = new Earring("Silver", "Stud", "Metal");
        boolean areEqual = earrings1.equals(earrings2);
        System.out.println("Are both Earrings equal? " + areEqual);

    }
}

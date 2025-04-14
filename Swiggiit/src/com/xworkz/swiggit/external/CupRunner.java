package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("Ceramic", "Round", "Medium");
        System.out.println("Cups to string: " + cup.toString());
        System.out.println("Cup HashCode: " + cup.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(cup));
        Cup cup1 = new Cup("Ceramic", "Oval", "Small");
        Cup cup2 = new Cup("Plastic", "Square", "Large");

        System.out.println("Are at same location or not: " + (cup1 == cup2));
        boolean value = cup2.equals(cup);
        System.out.println("Are both cups the same? " + value);

    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Whitener;

public class WhitenerRunner {
    public static void main(String[] args) {
        Whitener whitener = new Whitener("Camlin", "Pen", true);
        System.out.println(whitener);
        System.out.println("Overridden HashCode: " + whitener.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(whitener));
        Whitener whitener1 = new Whitener("Camlin", "Pen", true);
        Whitener whitener2 = new Whitener("Reynolds", "Bottle", false);

        System.out.println("whitener.equals(whitener1)? " + whitener.equals(whitener1));
        System.out.println("whitener.equals(whitener2)? " + whitener.equals(whitener2));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Kurta;

public class KurtaRunner {
    public static void main(String[] args) {
        Kurta kurta = new Kurta("Floral", "Straight Fit", "Peach");
        System.out.println("Kurta to string: " + kurta.toString());
        System.out.println("Overridden HashCode: " + kurta.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(kurta));
        Kurta kurta1 = new Kurta("Geometric", "A-Line", "Blue");
        Kurta kurta2 = new Kurta("Floral", "Straight Fit", "Peach");

        System.out.println("Are at same location or not: " + (kurta1 == kurta2));
        boolean value = kurta2.equals(kurta);
        System.out.println("Are they equal: " + value);
    }
}

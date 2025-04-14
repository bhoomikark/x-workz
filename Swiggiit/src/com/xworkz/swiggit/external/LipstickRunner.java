package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Maybelline", "L'Oreal", 20);
        System.out.println(lipstick);
        System.out.println("Overridden HashCode: " + lipstick.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(lipstick));
        Lipstick lipstick1 = new Lipstick("Lakme", "Hindustan", 15);
        Lipstick lipstick2 = new Lipstick("Maybelline", "L'Oreal", 20);

        System.out.println("Are lipstick1 and lipstick2 same object? " + (lipstick1 == lipstick2));
        boolean result = lipstick2.equals(lipstick);
        System.out.println("Are lipstick and lipstick2 equal? " + result);
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Maybelline", "L'Oreal", 20);
        System.out.println(lipstick);
        System.out.println("Overridden HashCode: " + lipstick.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(lipstick));
    }
}

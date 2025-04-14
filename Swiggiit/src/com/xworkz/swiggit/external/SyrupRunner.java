package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Syrup;

public class SyrupRunner {
    public static void main(String[] args) {
        Syrup syrup = new Syrup("Dabur", "Sweet", "Golden");
        System.out.println(syrup);
        System.out.println("Overridden HashCode: " + syrup.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(syrup));
        Syrup syrup1 = new Syrup("Dabur", "Sweet", "Golden");
        Syrup syrup2 = new Syrup("Patanjali", "Sour", "Green");

        System.out.println("syrup.equals(syrup1)? " + syrup.equals(syrup1));
        System.out.println("syrup.equals(syrup2)? " + syrup.equals(syrup2));
    }
}

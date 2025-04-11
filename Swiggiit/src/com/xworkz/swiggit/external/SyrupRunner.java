package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Syrup;

public class SyrupRunner {
    public static void main(String[] args) {
        Syrup syrup = new Syrup("Dabur", "Sweet", "Golden");
        System.out.println(syrup);
        System.out.println("Overridden HashCode: " + syrup.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(syrup));
    }
}

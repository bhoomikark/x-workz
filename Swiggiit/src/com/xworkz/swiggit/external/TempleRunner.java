package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new Temple("Chamundeshwari Temple", 12.5, "Durga");
        System.out.println(temple);
        System.out.println("Overridden HashCode: " + temple.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(temple));
    }
}

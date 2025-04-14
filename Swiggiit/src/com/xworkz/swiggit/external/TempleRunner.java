package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Temple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new Temple("Chamundeshwari Temple", 12.5, "Durga");
        System.out.println(temple);
        System.out.println("Overridden HashCode: " + temple.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(temple));
        Temple temple1 = new Temple("Chamundeshwari Temple", 12.5, "Durga");
        Temple temple2 = new Temple("Venkateshwara Temple", 15.0, "Venkateshwara");


        System.out.println("temple.equals(temple1)? " + temple.equals(temple1));
        System.out.println("temple.equals(temple2)? " + temple.equals(temple2));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Curtains;

public class CurtainsRunner {
    public static void main(String[] args) {
        Curtains curtains = new Curtains("Blackout", 799.50, "Maroon");
        System.out.println(curtains);
        System.out.println("Curtains HashCode: " + curtains.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(curtains));
    }
}

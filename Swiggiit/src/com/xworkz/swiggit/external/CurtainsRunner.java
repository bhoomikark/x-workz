package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Curtains;

public class CurtainsRunner {
    public static void main(String[] args) {
        Curtains curtains = new Curtains("Blackout", 799.50, "Maroon");
        System.out.println(curtains);
        System.out.println("Curtains HashCode: " + curtains.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(curtains));
        Curtains curtains1 = new Curtains("Blackout", 749.99, "Maroon");
        Curtains curtains2 = new Curtains("Sheer", 649.00, "Beige");

        System.out.println("Are curtains1 and curtains2 same location: " + (curtains1 == curtains2));
        boolean value = curtains1.equals(curtains);
        System.out.println("Are curtains1 and curtains equal? " + value);
    }
}

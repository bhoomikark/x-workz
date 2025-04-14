package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Powder;

public class PowderRunner {
    public static void main(String[] args) {
        Powder powder = new Powder("Ponds", "Talcum", 3);
        System.out.println(powder);
        System.out.println("Overridden HashCode: " + powder.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(powder));
        Powder powder1 = new Powder("Ponds", "Talcum", 3);
        Powder powder2 = new Powder("Dove", "Face Powder", 5);

        System.out.println("powder.equals(powder1)? " + powder.equals(powder1));
        System.out.println("powder.equals(powder2)? " + powder.equals(powder2));
    }
}

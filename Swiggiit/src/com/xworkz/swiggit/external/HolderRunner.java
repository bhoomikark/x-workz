package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Holder;

public class HolderRunner {
    public static void main(String[] args) {
        Holder holder = new Holder("Plastic", 4, "Black");

        System.out.println("Holder to string: " + holder.toString());
        System.out.println("Overridden HashCode: " + holder.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(holder));
        Holder holder1 = new Holder("Plastic", 4, "Black");
        Holder holder2 = new Holder("Plastic", 4, "Black");
        Holder holder3 = new Holder("Wood", 6, "Brown");
        System.out.println("Are Holder1 and Holder2 equal? " + holder1.equals(holder2));
        System.out.println("Are Holder1 and Holder3 equal? " + holder1.equals(holder3));
    }
}

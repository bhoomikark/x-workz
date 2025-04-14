package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WildcraftBags;

public class WildcraftBagsRunner {
    public static void main(String[] args) {
        WildcraftBags bag = new WildcraftBags("Premium", 2199.99, true);
        System.out.println(bag);
        System.out.println("Overridden HashCode: " + bag.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(bag));
        WildcraftBags bag1 = new WildcraftBags("Premium", 2199.99, true);
        WildcraftBags bag2 = new WildcraftBags("Premium", 2199.99, true);
        WildcraftBags bag3 = new WildcraftBags("Standard", 1499.99, false);

        System.out.println("bag1.equals(bag2)? " + bag1.equals(bag2));
        System.out.println("bag1.equals(bag3)? " + bag1.equals(bag3));

    }
}

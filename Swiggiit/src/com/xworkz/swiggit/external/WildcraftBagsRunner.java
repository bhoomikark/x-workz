package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WildcraftBags;

public class WildcraftBagsRunner {
    public static void main(String[] args) {
        WildcraftBags bag = new WildcraftBags("Premium", 2199.99, true);
        System.out.println(bag);
        System.out.println("Overridden HashCode: " + bag.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(bag));
    }
}

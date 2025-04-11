package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil = new Oil("Coconut", "Parachute", true);
        System.out.println(oil);
        System.out.println("Overridden HashCode: " + oil.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(oil));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil = new Oil("Coconut", "Parachute", true);
        System.out.println(oil);
        System.out.println("Overridden HashCode: " + oil.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(oil));
        Oil oil1 = new Oil("Coconut", "Parachute", true);
        Oil oil2 = new Oil("Olive", "Olitalia", false);

        System.out.println("oil.equals(oil1)? " + oil.equals(oil1));
        System.out.println("oil.equals(oil2)? " + oil.equals(oil2));
    }
}

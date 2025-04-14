package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Headphone;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("Boat", true, 1599.99);
        System.out.println(headphone);
        System.out.println("Overridden HashCode: " + headphone.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(headphone));
        Headphone headphone1 = new Headphone("Boat", true, 1599.99);
        Headphone headphone2 = new Headphone("Boat", true, 1599.99);
        Headphone headphone3 = new Headphone("Sony", false, 4999.99);
        System.out.println("Are Headphone1 and Headphone2 equal? " + headphone1.equals(headphone2));
        System.out.println("Are Headphone1 and Headphone3 equal? " + headphone1.equals(headphone3));
    }
}

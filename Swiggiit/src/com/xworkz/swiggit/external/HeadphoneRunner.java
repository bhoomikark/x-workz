package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Headphone;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("Boat", true, 1599.99);
        System.out.println(headphone);
        System.out.println("Overridden HashCode: " + headphone.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(headphone));
    }
}

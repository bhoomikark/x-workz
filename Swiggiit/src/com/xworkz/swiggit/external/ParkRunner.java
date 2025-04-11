package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Park;

public class ParkRunner {
    public static void main(String[] args) {
        Park park = new Park(3, "Slides, Swings, Merry-go-round", true);
        System.out.println("Park to string: " + park.toString());
        System.out.println("Overridden HashCode: " + park.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(park));
    }
    }


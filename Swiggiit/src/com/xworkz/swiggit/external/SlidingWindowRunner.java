package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.SlidingWindow;

public class SlidingWindowRunner {
    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow("Square", "Aluminium", 4);
        System.out.println("SlidingWindow to string: " + slidingWindow.toString());
        System.out.println("Overridden HashCode: " + slidingWindow.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(slidingWindow));
    }
    }


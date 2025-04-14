package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster poster = new Poster(3, "Motivational", "Dream Big");
        System.out.println("Poster to string: " + poster.toString());
        System.out.println("Overridden HashCode: " + poster.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(poster));
        Poster poster1 = new Poster(3, "Motivational", "Dream Big");
        Poster poster2 = new Poster(2, "Inspirational", "Stay Positive");

        System.out.println("poster.equals(poster1)? " + poster.equals(poster1));
        System.out.println("poster.equals(poster2)? " + poster.equals(poster2));
    }
}

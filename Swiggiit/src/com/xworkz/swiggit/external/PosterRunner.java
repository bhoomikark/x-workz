package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster poster = new Poster(3, "Motivational", "Dream Big");
        System.out.println("Poster to string: " + poster.toString());
    }
}

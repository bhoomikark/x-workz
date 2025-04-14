package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Sketchbook;

public class SketchbookRunner {
    public static void main(String[] args) {
        Sketchbook sketchbook = new Sketchbook(100, "A4", true);
        System.out.println(sketchbook);
        System.out.println("Overridden HashCode: " + sketchbook.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(sketchbook));
        Sketchbook sketchbook1 = new Sketchbook(100, "A4", false);
        Sketchbook sketchbook2 = new Sketchbook(80, "A5", true);

        System.out.println("sketchbook.equals(sketchbook1)? " + sketchbook.equals(sketchbook1));
        System.out.println("sketchbook.equals(sketchbook2)? " + sketchbook.equals(sketchbook2));
    }
    }


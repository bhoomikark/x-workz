package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Sketchbook;

public class SketchbookRunner {
    public static void main(String[] args) {
        Sketchbook sketchbook = new Sketchbook(100, "A4", true);
        System.out.println(sketchbook);
        System.out.println("Overridden HashCode: " + sketchbook.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(sketchbook));
    }
    }


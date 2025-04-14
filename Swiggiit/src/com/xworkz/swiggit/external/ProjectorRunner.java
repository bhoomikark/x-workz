package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new Projector("Rectangle", true, "Epson");
        System.out.println("Projector to string: " + projector.toString());
        System.out.println("Overridden HashCode: " + projector.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(projector));
        Projector projector1 = new Projector("Rectangle", true, "Epson");
        Projector projector2 = new Projector("Square", false, "BenQ");

        System.out.println("projector.equals(projector1)? " + projector.equals(projector1));
        System.out.println("projector.equals(projector2)? " + projector.equals(projector2));
    }
}

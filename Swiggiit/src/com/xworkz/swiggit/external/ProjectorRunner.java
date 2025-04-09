package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new Projector("Rectangle", true, "Epson");
        System.out.println("Projector to string: " + projector.toString());
    }
}

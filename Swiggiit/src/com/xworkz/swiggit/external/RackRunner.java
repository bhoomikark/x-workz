package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Rack;

public class RackRunner {
    public static void main(String[] args) {
        Rack rack = new Rack("Steel", 4, "Grey");
        System.out.println("Rack to string: " + rack.toString());
        System.out.println("Overridden HashCode: " + rack.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(rack));
        Rack rack1 = new Rack("Steel", 4, "Grey");
        Rack rack2 = new Rack("Wood", 3, "Brown");

        System.out.println("rack.equals(rack1)? " + rack.equals(rack1));
        System.out.println("rack.equals(rack2)? " + rack.equals(rack2));
    }
}

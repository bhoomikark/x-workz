package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Rack;

public class RackRunner {
    public static void main(String[] args) {
        Rack rack = new Rack("Steel", 4, "Grey");
        System.out.println("Rack to string: " + rack.toString());
        System.out.println("Overridden HashCode: " + rack.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(rack));
    }
}

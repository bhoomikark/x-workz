package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Handcraft;

public class HandcraftRunner {
    public static void main(String[] args) {
        Handcraft handcraft = new Handcraft(12, "Wall Hanging", "Jute and Beads");
        System.out.println("Handcraft to string: " + handcraft.toString());
        System.out.println("Overridden HashCode: " + handcraft.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(handcraft));
    }
}

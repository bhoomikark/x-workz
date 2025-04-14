package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Handcraft;

public class HandcraftRunner {
    public static void main(String[] args) {
        Handcraft handcraft = new Handcraft(12, "Wall Hanging", "Jute and Beads");
        System.out.println("Handcraft to string: " + handcraft.toString());
        System.out.println("Overridden HashCode: " + handcraft.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(handcraft));
        Handcraft handcraft1 = new Handcraft(12, "Wall Hanging", "Jute and Beads");
        Handcraft handcraft2 = new Handcraft(12, "Wall Hanging", "Jute and Beads");
        Handcraft handcraft3 = new Handcraft(5, "Table Mat", "Cotton");
        System.out.println("Are Handcraft1 and Handcraft2 equal? " + handcraft1.equals(handcraft2));
        System.out.println("Are Handcraft1 and Handcraft3 equal? " + handcraft1.equals(handcraft3));
    }
}

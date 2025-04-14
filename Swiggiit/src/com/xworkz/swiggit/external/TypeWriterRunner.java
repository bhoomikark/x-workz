package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.TypeWriter;

public class TypeWriterRunner {
    public static void main(String[] args) {
        TypeWriter typeWriter = new TypeWriter(1, true, "Manual Mechanical");
        System.out.println("TypeWriter to string: " + typeWriter.toString());
        System.out.println("Overridden HashCode: " + typeWriter.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(typeWriter));
        TypeWriter typeWriter1 = new TypeWriter(1, true, "Manual Mechanical");
        TypeWriter typeWriter2 = new TypeWriter(2, false, "Electric");

        System.out.println("typeWriter.equals(typeWriter1)? " + typeWriter.equals(typeWriter1));
        System.out.println("typeWriter.equals(typeWriter2)? " + typeWriter.equals(typeWriter2));
    }
}

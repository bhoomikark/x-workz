package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.TypeWriter;

public class TypeWriterRunner {
    public static void main(String[] args) {
        TypeWriter typeWriter = new TypeWriter(1, true, "Manual Mechanical");
        System.out.println("TypeWriter to string: " + typeWriter.toString());
        System.out.println("Overridden HashCode: " + typeWriter.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(typeWriter));
    }
}

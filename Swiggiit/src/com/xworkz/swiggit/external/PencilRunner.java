package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Pencil;

public class PencilRunner {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("Apsara", "HB", false);
        System.out.println(pencil);
        System.out.println("Overridden HashCode: " + pencil.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(pencil));
        Pencil pencil1 = new Pencil("Apsara", "HB", false);
        Pencil pencil2 = new Pencil("Camlin", "2B", true);

        System.out.println("pencil.equals(pencil1)? " + pencil.equals(pencil1));
        System.out.println("pencil.equals(pencil2)? " + pencil.equals(pencil2));
    }
}

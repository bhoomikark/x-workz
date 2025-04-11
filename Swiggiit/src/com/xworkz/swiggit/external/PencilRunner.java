package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Pencil;

public class PencilRunner {
    public static void main(String[] args) {
        Pencil pencil = new Pencil("Apsara", "HB", false);
        System.out.println(pencil);
        System.out.println("Overridden HashCode: " + pencil.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(pencil));
    }
}

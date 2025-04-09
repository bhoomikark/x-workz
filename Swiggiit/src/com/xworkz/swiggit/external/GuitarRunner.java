package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Guitar;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Acoustic", 6, false);
        System.out.println(guitar);
    }
}

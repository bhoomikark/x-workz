package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.MicrowaveOven;

public class MicrowaveOvenRunner {
    public static void main(String[] args) {
        MicrowaveOven oven = new MicrowaveOven("Samsung", 28.0, true);
        System.out.println(oven);
        System.out.println("Overridden HashCode: " + oven.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(oven));
    }
}

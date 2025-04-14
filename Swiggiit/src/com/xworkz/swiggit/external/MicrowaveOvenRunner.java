package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.MicrowaveOven;

public class MicrowaveOvenRunner {
    public static void main(String[] args) {
        MicrowaveOven oven = new MicrowaveOven("Samsung", 28.0, true);
        System.out.println(oven);
        System.out.println("Overridden HashCode: " + oven.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(oven));
        MicrowaveOven oven1 = new MicrowaveOven("Samsung", 28.0, true);
        MicrowaveOven oven2 = new MicrowaveOven("LG", 30.0, false);

        System.out.println("oven.equals(oven1)? " + oven.equals(oven1));
        System.out.println("oven.equals(oven2)? " + oven.equals(oven2));

    }
}

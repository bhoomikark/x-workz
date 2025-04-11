package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.HairOil;

public class HairOilRunner {
    public static void main(String[] args) {
        HairOil hairOil = new HairOil("Parachute", 95.50, 200);
        System.out.println("HairOil to string: " + hairOil.toString());
        System.out.println("Overridden HashCode: " + hairOil.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(hairOil));
    }
}

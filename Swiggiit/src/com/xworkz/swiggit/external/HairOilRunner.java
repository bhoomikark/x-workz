package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.HairOil;

public class HairOilRunner {
    public static void main(String[] args) {
        HairOil hairOil = new HairOil("Parachute", 95.50, 200);
        System.out.println("HairOil to string: " + hairOil.toString());
        System.out.println("Overridden HashCode: " + hairOil.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(hairOil));
        HairOil hairOil1 = new HairOil("Parachute", 95.50, 200);
        HairOil hairOil2 = new HairOil("Parachute", 95.50, 200);
        HairOil hairOil3 = new HairOil("Dabur", 120.00, 250);
        System.out.println("Are HairOil1 and HairOil2 equal? " + hairOil1.equals(hairOil2));
        System.out.println("Are HairOil1 and HairOil3 equal? " + hairOil1.equals(hairOil3));
    }
}

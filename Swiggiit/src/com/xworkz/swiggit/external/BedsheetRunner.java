package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bedsheet;

public class
BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet = new Bedsheet("White", 3, "Floral");

        System.out.println("Bedsheet to string: " + bedsheet.toString());
        System.out.println("Bedsheet HashCode: " + bedsheet.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(bedsheet));
        Bedsheet bedsheet1 = new Bedsheet("Blue", 2, "Geometric");
        Bedsheet bedsheet2 = new Bedsheet("White", 1, "Minimal");

        System.out.println("Are at same location or not: " + (bedsheet1 == bedsheet2));
        boolean value = bedsheet2.equals(bedsheet);
        System.out.println("Are both bedsheets same? " + value);
    }
}

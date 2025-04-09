package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bedsheet;

public class
BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet = new Bedsheet("White", 3, "Floral");

        System.out.println("Bedsheet to string: " + bedsheet.toString());
    }
}

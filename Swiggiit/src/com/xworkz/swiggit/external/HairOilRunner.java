package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.HairOil;

public class HairOilRunner {
    public static void main(String[] args) {
        HairOil hairOil = new HairOil("Parachute", 95.50, 200);
        System.out.println("HairOil to string: " + hairOil.toString());
    }
}

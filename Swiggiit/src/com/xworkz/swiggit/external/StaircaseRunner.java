package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Staircase;

public class StaircaseRunner {
    public static void main(String[] args) {
        Staircase staircase = new Staircase(15, true, "Spiral");

        System.out.println("Staircase to string: " + staircase.toString());
    }
}

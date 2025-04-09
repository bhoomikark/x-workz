package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Uber;

public class UberRunner {
    public static void main(String[] args) {
        Uber uber = new Uber(4, "Car", "KA01AB1234");
        System.out.println("Uber to string: " + uber.toString());
    }
}

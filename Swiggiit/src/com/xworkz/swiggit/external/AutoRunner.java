package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Auto;

public class AutoRunner {
    public static void main(String[] args) {
        Auto auto = new Auto("Mahindra", true, "Green");
        System.out.println("Auto to string: " + auto.toString());
    }
}

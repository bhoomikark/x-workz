package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.HandWash;

public class HandWashRunner {
    public static void main(String[] args) {
        HandWash handWash = new HandWash("Dettol", true, "Round");
        System.out.println("HandWash to string: " + handWash.toString());
    }
}

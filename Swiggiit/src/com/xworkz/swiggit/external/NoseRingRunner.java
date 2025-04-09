package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.NoseRing;

public class NoseRingRunner {
    public static void main(String[] args) {
        NoseRing noseRing = new NoseRing(true, "Floral", "Gold");
        System.out.println("NoseRing to string: " + noseRing.toString());
    }
}

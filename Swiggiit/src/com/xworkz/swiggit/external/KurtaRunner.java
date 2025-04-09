package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Kurta;

public class KurtaRunner {
    public static void main(String[] args) {
        Kurta kurta = new Kurta("Floral", "Straight Fit", "Peach");
        System.out.println("Kurta to string: " + kurta.toString());
    }
}

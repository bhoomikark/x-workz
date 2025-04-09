package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.RubberBand;

public class RubberBandRunner {
    public static void main(String[] args) {
        RubberBand rubberBand = new RubberBand("Pink", "Elastic", true);

        System.out.println("RubberBand to string: " + rubberBand.toString());
    }
}

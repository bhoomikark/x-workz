package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.RubberBand;

public class RubberBandRunner {
    public static void main(String[] args) {
        RubberBand rubberBand = new RubberBand("Pink", "Elastic", true);

        System.out.println("RubberBand to string: " + rubberBand.toString());
        System.out.println("Overridden HashCode: " + rubberBand.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(rubberBand));
        RubberBand rubberBand1 = new RubberBand("Pink", "Elastic", true);
        RubberBand rubberBand2 = new RubberBand("Blue", "Elastic", false);

        System.out.println("rubberBand.equals(rubberBand1)? " + rubberBand.equals(rubberBand1));
        System.out.println("rubberBand.equals(rubberBand2)? " + rubberBand.equals(rubberBand2));
    }
}

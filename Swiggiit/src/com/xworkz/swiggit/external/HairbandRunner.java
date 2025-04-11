package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Hairband;

public class HairbandRunner {
    public static void main(String[] args) {
        Hairband hairband = new Hairband("Clair", "Pink", "Elastic");
        System.out.println("Hairband to string: " + hairband.toString());
                System.out.println("Overridden HashCode: " + hairband.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(hairband));
    }
}

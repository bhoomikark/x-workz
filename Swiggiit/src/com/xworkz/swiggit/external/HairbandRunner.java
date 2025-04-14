package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Hairband;

public class HairbandRunner {
    public static void main(String[] args) {
        Hairband hairband = new Hairband("Clair", "Pink", "Elastic");
        System.out.println("Hairband to string: " + hairband.toString());
                System.out.println("Overridden HashCode: " + hairband.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(hairband));
        Hairband hairband1 = new Hairband("Clair", "Pink", "Elastic");
        Hairband hairband2 = new Hairband("Clair", "Pink", "Elastic");
        Hairband hairband3 = new Hairband("Nike", "Black", "Stretchable");
        System.out.println("Are Hairband1 and Hairband2 equal? " + hairband1.equals(hairband2));


        System.out.println("Are Hairband1 and Hairband3 equal? " + hairband1.equals(hairband3));
    }
}

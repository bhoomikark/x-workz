package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Sofa;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa = new Sofa((byte) 3, true, 72);
        System.out.println(sofa);
        System.out.println("Overridden HashCode: " + sofa.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(sofa));
        Sofa sofa1 = new Sofa((byte) 3, false, 72);
        Sofa sofa2 = new Sofa((byte) 3, true, 72);
        System.out.println("sofa.equals(sofa1)? " + sofa.equals(sofa1));
        System.out.println("sofa.equals(sofa2)? " + sofa.equals(sofa2));

    }
}

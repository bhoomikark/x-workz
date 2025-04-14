package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Intelj;

public class InteljRunner {
    public static void main(String[] args) {
        Intelj intelj = new Intelj("src, bin, .idea", 150, 5);
        System.out.println("Intelj to string: " + intelj.toString());
        System.out.println("Overridden HashCode: " + intelj.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(intelj));
        Intelj intelj1 = new Intelj("src, bin, .idea", 150, 5);
        Intelj intelj2 = new Intelj("src, bin, .idea", 150, 5);
        Intelj intelj3 = new Intelj("src, bin, .idea", 100, 3);
        System.out.println("Are Intelj1 and Intelj2 equal? " + intelj1.equals(intelj2));
        System.out.println("Are Intelj1 and Intelj3 equal? " + intelj1.equals(intelj3));
    }
}

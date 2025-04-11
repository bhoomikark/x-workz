package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Intelj;

public class InteljRunner {
    public static void main(String[] args) {
        Intelj intelj = new Intelj("src, bin, .idea", 150, 5);
        System.out.println("Intelj to string: " + intelj.toString());
        System.out.println("Overridden HashCode: " + intelj.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(intelj));
    }
}

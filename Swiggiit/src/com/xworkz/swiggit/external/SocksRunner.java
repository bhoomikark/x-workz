package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Socks;

public class SocksRunner {
    public static void main(String[] args) {
        Socks socks = new Socks("Black", 6, "Cotton");
        System.out.println(socks);
        System.out.println("Overridden HashCode: " + socks.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(socks));
        Socks socks1 = new Socks("Black", 4, "Cotton");
        Socks socks2 = new Socks("White", 6, "Wool");

        System.out.println("socks.equals(socks1)? " + socks.equals(socks1));
        System.out.println("socks.equals(socks2)? " + socks.equals(socks2));

    }
}

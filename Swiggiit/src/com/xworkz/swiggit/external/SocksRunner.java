package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Socks;

public class SocksRunner {
    public static void main(String[] args) {
        Socks socks = new Socks("Black", 6, "Cotton");
        System.out.println(socks);
        System.out.println("Overridden HashCode: " + socks.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(socks));
    }
}

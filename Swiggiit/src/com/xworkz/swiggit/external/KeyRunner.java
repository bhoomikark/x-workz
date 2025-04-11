package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Key;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key(1234567890123L, 7.5, false);
        System.out.println(key);
        System.out.println("Overridden HashCode: " + key.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(key));
    }
}

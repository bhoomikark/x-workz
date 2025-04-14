package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Key;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key(1234567890123L, 7.5, false);
        System.out.println(key);
        System.out.println("Overridden HashCode: " + key.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(key));
        Key key1 = new Key(9876543210123L, 8.2, true);
        Key key2 = new Key(1234567890123L, 7.5, false);
        System.out.println("Are at same location or not: " + (key1 == key2));
        boolean value = key2.equals(key);
        System.out.println(value);
    }
}

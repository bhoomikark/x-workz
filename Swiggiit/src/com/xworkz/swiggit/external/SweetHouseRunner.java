package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.SweetHouse;

public class SweetHouseRunner {
    public static void main(String[] args) {
        SweetHouse sweetHouse = new SweetHouse("Ladoo, Barfi, Jalebi", 15, "Mysore Pak");
        System.out.println(sweetHouse);
        System.out.println("Overridden HashCode: " + sweetHouse.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(sweetHouse));
    }
}

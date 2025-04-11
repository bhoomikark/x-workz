package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WoodenDoor;

public class WoodenDoorRunner {
    public static void main(String[] args) {
        WoodenDoor door = new WoodenDoor("Main Door", "Teak Wood", "Carved Floral");
        System.out.println("WoodenDoor to string: " + door.toString());
        System.out.println("Overridden HashCode: " + door.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(door));
    }
    }


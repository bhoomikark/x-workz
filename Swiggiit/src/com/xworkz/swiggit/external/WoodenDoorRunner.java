package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WoodenDoor;

public class WoodenDoorRunner {
    public static void main(String[] args) {
        WoodenDoor door = new WoodenDoor("Main Door", "Teak Wood", "Carved Floral");
        System.out.println("WoodenDoor to string: " + door.toString());
        System.out.println("Overridden HashCode: " + door.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(door));
        WoodenDoor door1 = new WoodenDoor("Main Door", "Teak Wood", "Carved Floral");
        WoodenDoor door2 = new WoodenDoor("Main Door", "Teak Wood", "Carved Floral");
        WoodenDoor door3 = new WoodenDoor("Back Door", "Pine Wood", "Simple");

        System.out.println("door1.equals(door2)? " + door1.equals(door2));
        System.out.println("door1.equals(door3)? " + door1.equals(door3));
    }
    }


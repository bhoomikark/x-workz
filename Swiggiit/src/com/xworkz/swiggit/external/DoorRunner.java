package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new Door("Sliding", "Wood", false);
        System.out.println(door);
        System.out.println("Door HashCode: " + door.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(door));
        Door door1 = new Door("Sliding", "Aluminum", true);
        Door door2 = new Door("Hinged", "Wood", false);

        System.out.println("Are door1 and door2 same instance? " + (door1 == door2));
        boolean value = door1.equals(door);
        System.out.println("Is door1 equal to door? " + value);
    }
}

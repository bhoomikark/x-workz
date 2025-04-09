package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new Door("Sliding", "Wood", false);
        System.out.println(door);
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.DreamHouse;

public class DreamHouseRunner {
    public static void main(String[] args) {
        DreamHouse dreamHouse = new DreamHouse("Center", "Modular", 4);
        System.out.println("DreamHouse to string: " + dreamHouse.toString());
        System.out.println("DreamHouse HashCode: " + dreamHouse.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(dreamHouse));
        DreamHouse dreamHouse1 = new DreamHouse("Center", "Modular", 4);
        DreamHouse dreamHouse2 = new DreamHouse("Corner", "Modular", 3);
        boolean isEqual = dreamHouse1.equals(dreamHouse2);
        System.out.println("Are both DreamHouses equal? " + isEqual);
    }
}

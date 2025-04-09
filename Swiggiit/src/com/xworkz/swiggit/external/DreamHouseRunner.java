package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.DreamHouse;

public class DreamHouseRunner {
    public static void main(String[] args) {
        DreamHouse dreamHouse = new DreamHouse("Center", "Modular", 4);
        System.out.println("DreamHouse to string: " + dreamHouse.toString());
    }
}

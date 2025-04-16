package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.iron.Door;
import com.xworkz.hierarchical.internal.iron.Rack;

public class IronRunner {
    public static void main(String[] args) {
        Rack rack = new Rack();
        rack.info();
        rack.display();

        Door door = new Door();
        door.info();
        door.paint();
    }
}

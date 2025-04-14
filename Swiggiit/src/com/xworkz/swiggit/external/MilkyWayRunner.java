package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.MilkyWay;

public class MilkyWayRunner {
    public static void main(String[] args) {
        MilkyWay milkyWay = new MilkyWay(1000000000, 8, true);
        System.out.println("MilkyWay to string: " + milkyWay.toString());
        System.out.println("Overridden HashCode: " + milkyWay.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(milkyWay));
        MilkyWay milkyWay1 = new MilkyWay(1000000000, 8, true);
        MilkyWay milkyWay2 = new MilkyWay(500000000, 5, false);

        System.out.println("milkyWay.equals(milkyWay1)? " + milkyWay.equals(milkyWay1));
        System.out.println("milkyWay.equals(milkyWay2)? " + milkyWay.equals(milkyWay2));
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.MilkyWay;

public class MilkyWayRunner {
    public static void main(String[] args) {
        MilkyWay milkyWay = new MilkyWay(1000000000, 8, true);
        System.out.println("MilkyWay to string: " + milkyWay.toString());
    }
}

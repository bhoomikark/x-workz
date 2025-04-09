package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.WaterBottle;

public class WaterBottleRunner {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle("Transparent Blue", "Milton", "Insulated");
        System.out.println(bottle);
    }
}

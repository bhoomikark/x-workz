package com.xworkz.rkbuilding.appliance.external;

import com.xworkz.rkbuilding.appliance.internal.Heater;

public class ApplianceRunner {
    public static void main(String[] args) {
        System.out.println("Running Main");
        System.out.println("================");
        Heater heater=new Heater();
        heater.performFunction();
        heater.plugIn();
        System.out.println("=================");


    }
}

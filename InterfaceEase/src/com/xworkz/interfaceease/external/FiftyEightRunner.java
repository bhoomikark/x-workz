package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftyeight.*;

public class FiftyEightRunner {
    public static void main(String[] args) {
        Thermostat t = new NestThermostat();
        t.increaseTemperature();
        t.decreaseTemperature();
        t.displayTemperature();
    }
}

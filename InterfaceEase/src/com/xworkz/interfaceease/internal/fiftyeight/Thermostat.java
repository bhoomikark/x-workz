package com.xworkz.interfaceease.internal.fiftyeight;

public interface Thermostat {
    void increaseTemperature();
    void decreaseTemperature();
    void displayTemperature();
    default void controlTemperature()
    {
        System.out.println("Running Temp");
    }
}

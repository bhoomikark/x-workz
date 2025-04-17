package com.xworkz.interfaceease.internal.fiftyeight;

public class NestThermostat implements Thermostat {
    @Override
    public void increaseTemperature() {
        System.out.println("Temperature increased.");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Temperature decreased.");
    }

    @Override
    public void displayTemperature() {
        System.out.println("Current temperature: 22°C");
    }
    @Override
    public  void controlTemperature()
    {
        System.out.println("Running Temp");
    }
}


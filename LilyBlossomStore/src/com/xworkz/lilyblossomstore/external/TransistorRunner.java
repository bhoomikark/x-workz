package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.transistor.Transistor;
import com.xworkz.lilyblossomstore.internal.transistor.Radio;

public class TransistorRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Transistor transistor = new Radio();
        transistor.powerOn();
        transistor.powerOff();
        transistor.tuneFrequency();
        transistor.increaseVolume();
        transistor.decreaseVolume();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        Radio radio = new Radio();
        radio.powerOn();
        radio.powerOff();
        radio.tuneFrequency();
        radio.increaseVolume();
        radio.decreaseVolume();
    }
}

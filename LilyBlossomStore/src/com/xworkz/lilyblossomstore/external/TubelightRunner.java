package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.tubelight.Tubelight;
import com.xworkz.lilyblossomstore.internal.tubelight.LEDTubelight;

public class TubelightRunner {
    public static void main(String[] args) {
        Tubelight tubelight = new LEDTubelight();
        tubelight.turnOn();
        tubelight.turnOff();
        tubelight.flicker();
        tubelight.repair();
        tubelight.replace();

        System.out.println("-----------");

        LEDTubelight ledTubelight = new LEDTubelight();
        ledTubelight.turnOn();
        ledTubelight.turnOff();
        ledTubelight.flicker();
        ledTubelight.repair();
        ledTubelight.replace();
    }
}

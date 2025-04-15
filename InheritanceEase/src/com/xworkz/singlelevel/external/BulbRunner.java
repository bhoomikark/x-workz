package com.xworkz.singlelevel.external;

import com.xworkz.singlelevel.internal.bulb.Tubelight;

public class BulbRunner {
    public static void main(String[] args) {
        Tubelight tubelight=new Tubelight();
        tubelight.performingFunction();
        tubelight.On();
    }
}

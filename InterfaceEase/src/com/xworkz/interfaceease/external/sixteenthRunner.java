package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.sixteenth.*;

public class sixteenthRunner {
    public static void main(String[] args) {
        Robot robo = new CleaningRobot();
        robo.start();
        robo.performTask();
        robo.shutdown();
    }
}

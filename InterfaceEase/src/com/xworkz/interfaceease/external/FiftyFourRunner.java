package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftyfour.*;

public class FiftyFourRunner {
    public static void main(String[] args) {
        FitnessTracker tracker = new Fitbit();
        tracker.startTracking();
        tracker.monitorSteps();
        tracker.endTracking();
    }
}

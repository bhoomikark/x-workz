package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtynine.*;

public class ThirtyNininthRunner {
    public static void main(String[] args) {
        FitnessTracker tracker = new SmartWatch();
        tracker.startWorkout();
        tracker.logCalories();
        tracker.endWorkout();
        tracker.trachHeartRate();
    }
}


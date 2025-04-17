package com.xworkz.interfaceease.internal.thirtynine;

public interface FitnessTracker {
    void startWorkout();
    void logCalories();
    void endWorkout();
    default void trachHeartRate()
    {
        System.out.println("Track heart rate -- default");
    }
}

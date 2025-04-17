package com.xworkz.interfaceease.internal.fiftyfour;

public interface FitnessTracker {
    void startTracking();
    void monitorSteps();
    void endTracking();
    default void seetotalsteps()
    {
        System.out.println("Viewing total steps");
    }
}

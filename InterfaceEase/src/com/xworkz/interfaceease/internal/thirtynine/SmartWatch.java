package com.xworkz.interfaceease.internal.thirtynine;

public class SmartWatch implements FitnessTracker {
    @Override
    public void startWorkout() {
        System.out.println("Workout started using SmartWatch.");
    }

    @Override
    public void logCalories() {
        System.out.println("Calories logged.");
    }

    @Override
    public void endWorkout() {
        System.out.println("Workout session ended.");
    }
}

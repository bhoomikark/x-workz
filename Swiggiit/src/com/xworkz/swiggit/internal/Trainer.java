package com.xworkz.example.internal;

public class Trainer {
    private String trainerName;
    private String trainerDomain;
    private boolean isTrainerPresentOrNot;

    public Trainer(String trainerName, String trainerDomain, boolean isTrainerPresentOrNot) {
        this.trainerName = trainerName;
        this.trainerDomain = trainerDomain;
        this.isTrainerPresentOrNot = isTrainerPresentOrNot;
        System.out.println("56. Running Trainer Constructor");
    }

    @Override
    public String toString() {
        return "Trainer Name: " + trainerName + ", Domain: " + trainerDomain + ", Present: " + isTrainerPresentOrNot;
    }
}

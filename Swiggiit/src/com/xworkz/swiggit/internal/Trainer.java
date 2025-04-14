package com.xworkz.swiggit.internal;

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
    @Override
    public int hashCode() {
        return 117;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Trainer) {
            Trainer trainer1 = this;
            Trainer trainer2 = (Trainer) obj;


            if (trainer1.trainerName.equals(trainer2.trainerName) &&
                    trainer1.trainerDomain.equals(trainer2.trainerDomain) &&
                    trainer1.isTrainerPresentOrNot == trainer2.isTrainerPresentOrNot) {
                return true;
            }
        }
        return false;
    }
}

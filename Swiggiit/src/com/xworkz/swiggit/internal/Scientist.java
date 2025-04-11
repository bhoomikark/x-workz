package com.xworkz.swiggit.internal;

public class Scientist {
    private String scientistName;
    private String honorsFrom;
    private String scientistAchievement;

    public Scientist(String scientistName, String honorsFrom, String scientistAchievement) {
        this.scientistName = scientistName;
        this.honorsFrom = honorsFrom;
        this.scientistAchievement = scientistAchievement;
        System.out.println("58. Running Scientist Constructor");
    }

    @Override
    public String toString() {
        return "Scientist Name: " + scientistName + ", Honors From: " + honorsFrom + ", Achievement: " + scientistAchievement;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 888;
    }
}

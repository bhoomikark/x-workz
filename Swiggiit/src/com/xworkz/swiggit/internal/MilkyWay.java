package com.xworkz.swiggit.internal;

public class MilkyWay {
    private int noOfStars;
    private int noOfPlanets;
    private boolean isSatelliteThereOrNot;

    public MilkyWay(int noOfStars, int noOfPlanets, boolean isSatelliteThereOrNot) {
        this.noOfStars = noOfStars;
        this.noOfPlanets = noOfPlanets;
        this.isSatelliteThereOrNot = isSatelliteThereOrNot;
        System.out.println("54. Running MilkyWay Constructor");
    }

    @Override
    public String toString() {
        return "No. of Stars: " + noOfStars + ", No. of Planets: " + noOfPlanets +
                ", Is Satellite Present: " + isSatelliteThereOrNot;
    }
}

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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 987;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof MilkyWay) {
                System.out.println("MilkyWay is reference of Object");
                MilkyWay m1 = this;
                MilkyWay m2 = (MilkyWay) obj;
                if (m1.noOfStars == m2.noOfStars && m1.noOfPlanets == m2.noOfPlanets &&
                        m1.isSatelliteThereOrNot == m2.isSatelliteThereOrNot) {
                    System.out.println("Both MilkyWay objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

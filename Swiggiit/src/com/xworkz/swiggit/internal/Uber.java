package com.xworkz.swiggit.internal;

public class Uber {
    private int noOfPassengers;
    private String autoOrCarAvailable;
    private String uberCarNo;

    public Uber(int noOfPassengers, String autoOrCarAvailable, String uberCarNo) {
        this.noOfPassengers = noOfPassengers;
        this.autoOrCarAvailable = autoOrCarAvailable;
        this.uberCarNo = uberCarNo;
        System.out.println("49. Running Uber Constructor");
    }

    @Override
    public String toString() {
        return "No. of Passengers: " + noOfPassengers + ", Auto/Car Available: " + autoOrCarAvailable +
                ", Uber Car No: " + uberCarNo;
    }
    @Override
    public int hashCode() {
        return 121;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Uber) {
            Uber uber1 = this;
            Uber uber2 = (Uber) obj;


            if (uber1.noOfPassengers == uber2.noOfPassengers &&
                    uber1.autoOrCarAvailable.equals(uber2.autoOrCarAvailable) &&
                    uber1.uberCarNo.equals(uber2.uberCarNo)) {
                return true;
            }
        }
        return false;
    }
}

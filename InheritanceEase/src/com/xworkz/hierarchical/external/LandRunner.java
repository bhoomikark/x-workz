package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.land.Bike;
import com.xworkz.hierarchical.internal.land.Car;

public class LandRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.surfaceType();
        car.drive();

        Bike bike = new Bike();
        bike.surfaceType();
        bike.ride();
    }
}
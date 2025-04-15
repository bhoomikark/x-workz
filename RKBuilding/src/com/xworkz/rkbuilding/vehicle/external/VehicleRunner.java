package com.xworkz.rkbuilding.vehicle.external;

import com.xworkz.rkbuilding.vehicle.internal.Car;

public class VehicleRunner {
    public static void main(String[] args) {
        System.out.println("Running main");
        System.out.println("=============");
        Car car=new Car();
        car.startEngine();
        System.out.println("=============");

    }
}

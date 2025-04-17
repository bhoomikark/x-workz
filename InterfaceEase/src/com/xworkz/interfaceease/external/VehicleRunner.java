package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.sixth.*;

public class VehicleRunner {
    public static void main(String[] args) {
        System.out.println("6.Running interface Vehicle reference from Car class");
        Vehicle car = new Car();
        car.start();
        car.stop();
        car.honk();
        car.applyBrake();
        ElectricVehicle electricCar = (ElectricVehicle) car;
        electricCar.charge();
        electricCar.batteryStatus();
        electricCar.checkmilage();
        electricCar.batteryOn();
        System.out.println("=================================");

        System.out.println(" Running interface Vehicle reference from Bike class");
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
        bike.honk();
        ElectricVehicle electricBike = (ElectricVehicle) bike;
        electricBike.charge();
        electricBike.batteryStatus();
        System.out.println("=================================");

        System.out.println("Running interface Vehicle reference from Bicycle class");
        Vehicle bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();
        bicycle.honk();
        ElectricVehicle electricCar2 = new ElectricScooter();
        electricCar2.charge();
        electricCar2.batteryStatus();
        electricCar2.batteryOn();
    }
}
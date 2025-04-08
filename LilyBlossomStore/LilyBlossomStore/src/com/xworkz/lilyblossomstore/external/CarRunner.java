package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.car.Car;
import com.xworkz.lilyblossomstore.internal.car.ElectricCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
        car.fuelUp();
        car.turnOff();

        System.out.println("-----------");

        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.fuelUp();
        electricCar.turnOff();
    }
}

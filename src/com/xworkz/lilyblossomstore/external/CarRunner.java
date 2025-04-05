package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.car.Car;
import com.xworkz.lilyblossomstore.internal.car.ElectricCar;

public class CarRunner {
    public static void main(String[] args) {

        System.out.println("Parent reference - Parent object");
        Car car1 = new Car();
        car1.start();
        car1.accelerate();
        car1.brake();
        car1.fuelUp();
        car1.turnOff();

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

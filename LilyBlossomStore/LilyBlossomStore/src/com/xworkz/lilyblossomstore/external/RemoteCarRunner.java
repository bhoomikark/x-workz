package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.remotecar.RemoteCar;
import com.xworkz.lilyblossomstore.internal.remotecar.ElectricCar;

public class RemoteCarRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        RemoteCar car = new ElectricCar();
        car.start();
        car.stop();
        car.accelerate();
        car.turnLeft();
        car.turnRight();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.stop();
        electricCar.accelerate();
        electricCar.turnLeft();
        electricCar.turnRight();
    }
}

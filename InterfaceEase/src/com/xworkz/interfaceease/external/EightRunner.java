package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.eight.*;

public class EightRunner {
    public static void main(String[] args) {
        System.out.println("Running interface Drivable from Car");
        Drivable drivable=new Car();
        drivable.accelerate();
        drivable.brake();
        drivable.startEngine();
        Flyable flyable2=new Airplane();
        flyable2.fly();
        flyable2.land();
        flyable2.takeOff();
        System.out.println("====================================");
        System.out.println("2 copies from 2 subclasses");
        Drivable drivable1=new FlyingCar();
        drivable1.startEngine();
        drivable1.brake();
        drivable1.accelerate();
        Flyable flyable=new FlyingCar();
        flyable.fly();
        flyable.land();
        flyable.takeOff();
        Drivable drivable2=new Helicopter();
        drivable2.startEngine();
        drivable2.brake();
        drivable2.accelerate();
        Flyable flyable1=new Helicopter();
        flyable1.fly();
        flyable1.land();
        flyable1.takeOff();

    }
}

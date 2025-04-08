package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.wheeler.*;
import com.xworkz.lilyblossomstore.internal.craft.*;
import com.xworkz.lilyblossomstore.internal.railway.*;
import com.xworkz.lilyblossomstore.internal.modeoftransport.*;
import com.xworkz.lilyblossomstore.internal.aerialvehicle.*;
import com.xworkz.lilyblossomstore.internal.pollutionlessvehicle.*;
import com.xworkz.lilyblossomstore.internal.speedrail.*;
import com.xworkz.lilyblossomstore.internal.tansport1.*;
import com.xworkz.lilyblossomstore.internal.forest.*;
import com.xworkz.lilyblossomstore.internal.facewash.*;


public class FirstTenRunner {
    public static void main(String[] args) {

        System.out.println("\n--- 1. TwoWheeler Example ---");
        TwoWheeler bike = new TwoWheeler();
        bike.startEngine();
        bike.accelerate();
        bike.applyBrakes();
        bike.honk();
        bike.stopEngine();

        TwoWheeler bike1 = new Motorcycle();
        bike1.startEngine();
        bike1.accelerate();
        bike1.applyBrakes();
        bike1.honk();
        bike1.stopEngine();

        Motorcycle sportsBike = new Motorcycle();
        sportsBike.startEngine();
        sportsBike.accelerate();
        sportsBike.applyBrakes();
        sportsBike.honk();
        sportsBike.stopEngine();
        System.out.println("\n--- 2. Aircraft Example ---");
        Aircraft plane = new Aircraft();
        plane.takeOff();
        plane.cruise();
        plane.adjustFlaps();
        plane.deployLandingGear();
        plane.land();

        Aircraft heli1 = new Helicopter();
        heli1.takeOff();
        heli1.cruise();
        heli1.adjustFlaps();
        heli1.deployLandingGear();
        heli1.land();

        Helicopter heli = new Helicopter();
        heli.takeOff();
        heli.cruise();
        heli.adjustFlaps();
        heli.deployLandingGear();
        heli.land();

        System.out.println("\n--- 3. RailwayVehicle Example ---");
        RailwayVehicle rv = new RailwayVehicle();
        rv.startJourney();
        rv.increaseSpeed();
        rv.decreaseSpeed();
        rv.soundHorn();
        rv.stopJourney();

        RailwayVehicle train1 = new Train();
        train1.startJourney();
        train1.increaseSpeed();
        train1.decreaseSpeed();
        train1.soundHorn();
        train1.stopJourney();

        Train express = new Train();
        express.startJourney();
        express.increaseSpeed();
        express.decreaseSpeed();
        express.soundHorn();
        express.stopJourney();

        System.out.println("\n--- 4. Watercraft Example ---");
        Watercraft boat = new Watercraft();
        boat.startEngine();
        boat.sail();
        boat.anchor();
        boat.blowHorn();
        boat.stopEngine();

        Watercraft sub1 = new Submarine();
        sub1.startEngine();
        sub1.sail();
        sub1.anchor();
        sub1.blowHorn();
        sub1.stopEngine();

        Submarine deepSea = new Submarine();
        deepSea.startEngine();
        deepSea.sail();
        deepSea.anchor();
        deepSea.blowHorn();
        deepSea.stopEngine();

        System.out.println("\n--- 5. UnmannedAerialVehicle Example ---");
        UnmannedAerialVehicle uav = new UnmannedAerialVehicle();
        uav.powerOn();
        uav.takeOff();
        uav.fly();
        uav.capturePhoto();
        uav.land();

        UnmannedAerialVehicle drone1 = new Drone();
        drone1.powerOn();
        drone1.takeOff();
        drone1.fly();
        drone1.capturePhoto();
        drone1.land();

        Drone dji = new Drone();
        dji.powerOn();
        dji.takeOff();
        dji.fly();
        dji.capturePhoto();
        dji.land();

        Aeroplane aeroplane=new Aeroplane();
        aeroplane.departure(drone1);


        System.out.println("\n--- 6. EcoFriendlyVehicle Example ---");
        EcoFriendlyVehicle ev = new EcoFriendlyVehicle();
        ev.chargeBattery();
        ev.start();
        ev.ecoMode();
        ev.checkEmission();
        ev.stop();

        EcoFriendlyVehicle scooter1 = new ElectricScooter();
        scooter1.chargeBattery();
        scooter1.start();
        scooter1.ecoMode();
        scooter1.checkEmission();
        scooter1.stop();

        ElectricScooter eScooter = new ElectricScooter();
        eScooter.chargeBattery();
        eScooter.start();
        eScooter.ecoMode();
        eScooter.checkEmission();
        eScooter.stop();

        System.out.println("\n--- 7. HighSpeedRail Example ---");
        HighSpeedRail hsRail = new HighSpeedRail();
        hsRail.startJourney();
        hsRail.activateMagLev();
        hsRail.reachMaxSpeed();
        hsRail.soundHorn();
        hsRail.stopJourney();

        HighSpeedRail bt1 = new BulletTrain();
        bt1.startJourney();
        bt1.activateMagLev();
        bt1.reachMaxSpeed();
        bt1.soundHorn();
        bt1.stopJourney();

        BulletTrain shinkansen = new BulletTrain();
        shinkansen.startJourney();
        shinkansen.activateMagLev();
        shinkansen.reachMaxSpeed();
        shinkansen.soundHorn();
        shinkansen.stopJourney();


        System.out.println("\n--- 8. AirTransport Example ---");
        AirTransport airVehicle = new AirTransport();
        airVehicle.takeOff();
        airVehicle.navigate();
        airVehicle.checkFuelLevel();
        airVehicle.deployParachute();
        airVehicle.land();

        AirTransport balloon1 = new HotAirBalloon();
        balloon1.takeOff();
        balloon1.navigate();
        balloon1.checkFuelLevel();
        balloon1.deployParachute();
        balloon1.land();

        HotAirBalloon balloon = new HotAirBalloon();
        balloon.takeOff();
        balloon.navigate();
        balloon.checkFuelLevel();
        balloon.deployParachute();
        balloon.land();

        System.out.println("\n--- 9. FaceWash Example ---");
        FaceWash faceWash = new HerbalFaceWash();
        faceWash.cleanse();
        faceWash.moisturize();
        faceWash.removeOil();
        faceWash.refreshSkin();
        faceWash.exfoliate();

        System.out.println("-----------");


        HerbalFaceWash herbalFaceWash = new HerbalFaceWash();
        herbalFaceWash.cleanse();
        herbalFaceWash.moisturize();
        herbalFaceWash.removeOil();
        herbalFaceWash.refreshSkin();
        herbalFaceWash.exfoliate();

        System.out.println("\n--- 10. Bird Example ---");
        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.buildNest();
        bird.migrate();
        bird.eat();

        Bird parrot = new Parrot();
        parrot.fly();
        parrot.sing();
        parrot.buildNest();
        parrot.migrate();
        parrot.eat();
        Parrot parrot1 = new Parrot();
        parrot1.fly();
        parrot1.sing();
        parrot1.buildNest();
        parrot1.migrate();
        parrot1.eat();


    }
}

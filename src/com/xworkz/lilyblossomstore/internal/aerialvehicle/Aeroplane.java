package com.xworkz.lilyblossomstore.internal.aerialvehicle;

public class Aeroplane {
    public void departure(UnmannedAerialVehicle drone1)
    {
        System.out.println("Aeroplane will departure in few minutes");
        System.out.println("=============================");
        drone1.powerOn();
        drone1.fly();
        drone1.takeOff();
        drone1.land();
        drone1.capturePhoto();
        if(drone1 instanceof Drone)
        {
            System.out.println("unmanned aerial vehicle is drone");
            Drone drone=(Drone)drone1;
            drone.powerOff();

        }
    }
}

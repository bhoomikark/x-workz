package com.xworkz.lilyblossomstore.internal.railway;

public class RailwayVehicle
    {
        public RailwayVehicle()
        {
            System.out.println("Running constructor");
        }
        public void startJourney() { System.out.println("RailwayVehicle journey started."); }
        public void stopJourney() { System.out.println("RailwayVehicle journey stopped."); }
        public void increaseSpeed() { System.out.println("RailwayVehicle speed increased."); }
       public void decreaseSpeed() { System.out.println("RailwayVehicle speed decreased."); }
       public  void soundHorn() { System.out.println("RailwayVehicle horn sounded."); }
    }


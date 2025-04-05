package com.xworkz.lilyblossomstore.internal.tansport1;

public class AirTransport {
    public AirTransport()
    {
        System.out.println("Running Air transport Constructor");
    }
    public void takeOff() { System.out.println("AirTransport is taking off."); }
   public void land() { System.out.println("AirTransport is landing."); }
    public void navigate() { System.out.println("AirTransport is navigating through airways."); }
   public void checkFuelLevel() { System.out.println("AirTransport fuel level checked."); }
   public void deployParachute() { System.out.println("AirTransport deployed emergency parachute."); }
}

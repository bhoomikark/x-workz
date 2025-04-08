package com.xworkz.lilyblossomstore.internal.wheeler;
public class TwoWheeler {
    public TwoWheeler(){
        System.out.println("Running twoWheeler Constructor");
    }
    public void startEngine() { System.out.println("TwoWheeler engine started."); }
    public void stopEngine() { System.out.println("TwoWheeler engine stopped."); }
    public void accelerate() { System.out.println("TwoWheeler is accelerating."); }
    public void applyBrakes() { System.out.println("Brakes applied on TwoWheeler."); }
    public void honk() { System.out.println("TwoWheeler horn honked."); }
}

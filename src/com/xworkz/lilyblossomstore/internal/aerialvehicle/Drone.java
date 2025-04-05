package com.xworkz.lilyblossomstore.internal.aerialvehicle;

public class Drone extends UnmannedAerialVehicle {
    public Drone() { super();

        System.out.println("Drone is in autopilot mode."); }
    @Override
    public void powerOn() {
        System.out.println("Child Class");
        System.out.println("Drone powered on."); }
    @Override
    public void takeOff() {
        System.out.println("Child Class");
        System.out.println("Drone is taking off."); }
    @Override
    public void fly() {
        System.out.println("Child Class");
        System.out.println("Drone is flying."); }
    @Override
    public void land() {
        System.out.println("Child Class");
        System.out.println("Drone is landing.");
    }
    @Override
    public void capturePhoto() {
        System.out.println("Child Class");
        System.out.println("Drone captured a photo."); }
}
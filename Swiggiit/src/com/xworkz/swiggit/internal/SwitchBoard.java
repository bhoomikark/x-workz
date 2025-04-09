package com.xworkz.swiggit.internal;

public class SwitchBoard {
    private int noOfSwitches;
    private String switchBrand;
    private int noOfSockets;

    public SwitchBoard(int noOfSwitches, String switchBrand, int noOfSockets) {
        this.noOfSwitches = noOfSwitches;
        this.switchBrand = switchBrand;
        this.noOfSockets = noOfSockets;
        System.out.println("6. Running SwitchBoard Constructor");
    }

    @Override
    public String toString() {
        return "No of Switches: " + noOfSwitches + ", Switch Brand: " + switchBrand +
                ", No of Sockets: " + noOfSockets;
    }
}

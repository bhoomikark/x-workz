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

    @Override
    public int hashCode() {
        return 110;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof SwitchBoard) {
                System.out.println("SwitchBoard is reference of object");
                SwitchBoard switchBoard1 = this;
                SwitchBoard switchBoard2 = (SwitchBoard) obj;


                if (switchBoard1.noOfSwitches == switchBoard2.noOfSwitches &&
                        switchBoard1.switchBrand.equals(switchBoard2.switchBrand)) {
                    System.out.println("Both SwitchBoard objects are the same (based on Number of Switches and Switch Brand)");
                    return true;
                }
            }
        }
        return false;
    }
}

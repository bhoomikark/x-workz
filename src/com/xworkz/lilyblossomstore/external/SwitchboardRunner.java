package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.switchboard.Switchboard;
import com.xworkz.lilyblossomstore.internal.switchboard.SmartSwitchboard;

public class SwitchboardRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Switchboard switchboard1 = new Switchboard();
        switchboard1.turnOn();
        switchboard1.turnOff();
        switchboard1.supplyPower();
        switchboard1.repair();
        switchboard1.replaceFuse();

        Switchboard switchboard = new SmartSwitchboard();
        switchboard.turnOn();
        switchboard.turnOff();
        switchboard.supplyPower();
        switchboard.repair();
        switchboard.replaceFuse();
        System.out.println("-----------");

        SmartSwitchboard smartSwitchboard = new SmartSwitchboard();
        smartSwitchboard.turnOn();
        smartSwitchboard.turnOff();
        smartSwitchboard.supplyPower();
        smartSwitchboard.repair();
        smartSwitchboard.replaceFuse();

    }
}

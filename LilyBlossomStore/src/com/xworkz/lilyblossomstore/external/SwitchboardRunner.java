package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.switchboard.Switchboard;
import com.xworkz.lilyblossomstore.internal.switchboard.SmartSwitchboard;

public class SwitchboardRunner {
    public static void main(String[] args) {
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

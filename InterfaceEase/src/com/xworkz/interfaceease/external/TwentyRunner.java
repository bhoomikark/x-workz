package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twenty.*;

public class TwentyRunner {
    public static void main(String[] args) {
        Device d = new WashingMachine();
        d.powerOn();
        d.performFunction();
        d.powerOff();
        d.reboot();
    }
}

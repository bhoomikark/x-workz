package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtyfour.*;

public class FourtyFourRunner {
    public static void main(String[] args) {
        Alarm a = new DigitalClock();
        a.setAlarm();
        a.ring();
        a.stopAlarm();
    }
}

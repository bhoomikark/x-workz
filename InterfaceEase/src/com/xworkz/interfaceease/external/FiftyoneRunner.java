package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftyone.*;

public class FiftyoneRunner {
    public static void main(String[] args) {
        SmartLight light = new PhilipsHue();
        light.connect();
        light.turnOnLight();
        light.turnOffLight();
        light.automatic();
    }
}

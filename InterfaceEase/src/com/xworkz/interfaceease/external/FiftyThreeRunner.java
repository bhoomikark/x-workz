package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftythree.*;

public class FiftyThreeRunner {
    public static void main(String[] args) {
        Drone d = new CameraDrone();
        d.launch();
        d.captureImage();
        d.land();
    }
}

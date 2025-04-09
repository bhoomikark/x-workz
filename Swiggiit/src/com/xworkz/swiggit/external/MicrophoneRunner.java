package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Microphone;

public class MicrophoneRunner {
    public static void main(String[] args) {
        Microphone microphone = new Microphone("Sony", 50.0, "Black");

        System.out.println("Microphone to string: " + microphone.toString());
    }
}

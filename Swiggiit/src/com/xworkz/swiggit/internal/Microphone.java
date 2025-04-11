package com.xworkz.swiggit.internal;

public class Microphone {
    private String microphoneBrand;
    private double microphoneFrequency;
    private String colorOfMicrophone;

    public Microphone(String microphoneBrand, double microphoneFrequency, String colorOfMicrophone) {
        this.microphoneBrand = microphoneBrand;
        this.microphoneFrequency = microphoneFrequency;
        this.colorOfMicrophone = colorOfMicrophone;
        System.out.println("5. Running Microphone Constructor");
    }

    @Override
    public String toString() {
        return "Microphone Brand: " + microphoneBrand + ", Microphone Frequency: " + microphoneFrequency +
                " Hz, Color of Microphone: " + colorOfMicrophone;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 888;
    }
}

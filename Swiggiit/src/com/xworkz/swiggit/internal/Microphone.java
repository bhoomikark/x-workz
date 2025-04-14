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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Microphone) {
                System.out.println("Microphone is reference of Object");
                Microphone mic1 = this;
                Microphone mic2 = (Microphone) obj;
                if (mic1.microphoneBrand.equals(mic2.microphoneBrand) &&
                        mic1.microphoneFrequency == mic2.microphoneFrequency &&
                        mic1.colorOfMicrophone.equals(mic2.colorOfMicrophone)) {
                    System.out.println("Both Microphones are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

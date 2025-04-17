package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtyeight.*;

public class FourtyEightRunner {
    public static void main(String[] args) {
        Developer d = new SoftwareEngineer();
        d.code();
        d.test();
        d.deploy();
    }
}

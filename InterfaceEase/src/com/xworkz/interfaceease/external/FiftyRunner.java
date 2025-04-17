package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourteen.*;

public class FiftyRunner {
    public static void main(String[] args) {
        RemoteControl remote = new TVRemote();
        remote.turnOn();
        remote.changeChannel();
        remote.turnOff();
    }
}

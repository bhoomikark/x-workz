package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourteen.*;

public class FourteenRunner {
    public static void main(String[] args) {
        RemoteControl remote = new TVRemote();
        remote.changeChannel();
        remote.turnOff();
    }
}

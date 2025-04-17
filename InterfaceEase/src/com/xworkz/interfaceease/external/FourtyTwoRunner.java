package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtytwo.*;

public class FourtyTwoRunner {
    public static void main(String[] args) {
        System.out.println("2 copies of class");
        Speaker speaker = new SmartSpeaker();
        speaker.playMusic();
        speaker.increaseVolume();
        speaker.decreaseVolume();

        System.out.println("------------------");

        Bluetooth bt = new SmartSpeaker();
        bt.connect();
        bt.transferData();
        bt.disconnect();
    }
}

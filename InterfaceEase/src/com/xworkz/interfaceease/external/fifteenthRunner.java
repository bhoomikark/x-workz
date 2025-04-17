package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fifteen.*;

public class fifteenthRunner {
    public static void main(String[] args) {
        MusicPlayer player = new Spotify();
        player.pause();
        player.stop();
        player.goToSettings();
    }
}

package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtysix.*;

public class ThirtysixthRuuner {
    public static void main(String[] args) {
        MusicPlayer player = new SpotifyPlayer();
        player.play();
        player.pause();
        player.stop();
        player.playQueue();
    }
}

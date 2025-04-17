package com.xworkz.interfaceease.internal.thirtysix;

public class SpotifyPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music on Spotify...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused on Spotify.");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped on Spotify.");
    }
}
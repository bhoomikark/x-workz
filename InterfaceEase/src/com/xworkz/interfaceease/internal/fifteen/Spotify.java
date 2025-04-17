package com.xworkz.interfaceease.internal.fifteen;

public class Spotify implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music on Spotify.");
    }
    @Override
    public void pause() {
        System.out.println("Music paused.");
    }
    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }
    @Override
    public  void goToSettings()
    {
        System.out.println("running go to -- spotify");
    }
}

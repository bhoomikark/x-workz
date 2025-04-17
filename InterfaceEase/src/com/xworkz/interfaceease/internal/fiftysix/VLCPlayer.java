package com.xworkz.interfaceease.internal.fiftysix;

public class VLCPlayer implements VideoPlayer {
    @Override
    public void loadVideo() {
        System.out.println("Loading video...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video.");
    }

    @Override
    public void stopVideo() {
        System.out.println("Video stopped.");
    }
@Override
    public void openSettings()
    {
        System.out.println("open settings -- vlcplayer");
    }
}

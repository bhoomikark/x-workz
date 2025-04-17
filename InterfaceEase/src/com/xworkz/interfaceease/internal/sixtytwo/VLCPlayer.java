package com.xworkz.interfaceease.internal.sixtytwo;

public class VLCPlayer implements MediaPlayer {
    @Override
    public void loadMedia() {
        System.out.println("Media loaded in VLC Player.");
    }

    @Override
    public void playMedia() {
        System.out.println("Playing media in VLC Player.");
    }

    @Override
    public void stopMedia() {
        System.out.println("Stopping media in VLC Player.");
    }
@Override
    public void pauseMediaplay()
    {
        System.out.println("pause media -- VLCP player");
    }
}

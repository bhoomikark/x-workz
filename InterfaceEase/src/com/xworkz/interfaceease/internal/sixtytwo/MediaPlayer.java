package com.xworkz.interfaceease.internal.sixtytwo;

public interface MediaPlayer {
    void loadMedia();
    void playMedia();
    void stopMedia();
    default void pauseMediaplay()
    {
        System.out.println("pause media -- default");
    }
}

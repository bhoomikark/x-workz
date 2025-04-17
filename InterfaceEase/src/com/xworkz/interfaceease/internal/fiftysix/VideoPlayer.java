package com.xworkz.interfaceease.internal.fiftysix;

public interface VideoPlayer {
    void loadVideo();
    void playVideo();
    void stopVideo();
    default void openSettings()
    {
        System.out.println("open settings");
    }
}

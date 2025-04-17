package com.xworkz.interfaceease.internal.fifteen;

public interface MusicPlayer {
    void play();
    void pause();
    void stop();
    default void goToSettings()
    {
        System.out.println("running go to");
    }
}

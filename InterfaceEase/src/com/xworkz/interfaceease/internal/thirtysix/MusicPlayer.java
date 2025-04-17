package com.xworkz.interfaceease.internal.thirtysix;

public interface MusicPlayer {
    void play();
    void pause();
    void stop();
    default void playQueue()
    {
        System.out.println("play queue -- default");
    }
}

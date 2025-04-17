package com.xworkz.interfaceease.internal.twelve;

public interface Downloadable  {
    void startDownload();
    void pauseDownload();
    void completeDownload();
    default void clickDownload()
    {
        System.out.println("click download -- default");
    }
}

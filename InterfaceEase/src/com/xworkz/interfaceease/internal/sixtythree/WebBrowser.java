package com.xworkz.interfaceease.internal.sixtythree;

public interface WebBrowser {
    void openTab();
    void browseWebsite();
    void closeTab();
    default void browseYouTube()
    {
        System.out.println("browse you tube -- default");
    }
}

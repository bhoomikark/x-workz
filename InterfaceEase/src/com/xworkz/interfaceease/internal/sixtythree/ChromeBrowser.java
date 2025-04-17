package com.xworkz.interfaceease.internal.sixtythree;

public class ChromeBrowser implements WebBrowser {
    @Override
    public void openTab() {
        System.out.println("New tab opened in Chrome.");
    }

    @Override
    public void browseWebsite() {
        System.out.println("Browsing website on Chrome.");
    }

    @Override
    public void closeTab() {
        System.out.println("Tab closed in Chrome.");
    }
}

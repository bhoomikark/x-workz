package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.sixtythree.*;

public class SixtyThreeRunner {
    public static void main(String[] args) {
        WebBrowser browser = new ChromeBrowser();
        browser.openTab();
        browser.browseWebsite();
        browser.closeTab();
        browser.browseYouTube();
    }
}

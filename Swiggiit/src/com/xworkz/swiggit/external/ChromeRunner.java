package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Chrome;

public class ChromeRunner {
    public static void main(String[] args) {
        Chrome chrome = new Chrome("Google, Outlook", "rk.personal@gmail.com", 2);
        System.out.println("Chrome to string: " + chrome.toString());
    }
}

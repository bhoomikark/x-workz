package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Chrome;

public class ChromeRunner {
    public static void main(String[] args) {
        Chrome chrome = new Chrome("Google, Outlook", "rk.personal@gmail.com", 2);
        System.out.println("Chrome to string: " + chrome.toString());
        System.out.println("Chrome HashCode: " + chrome.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(chrome));

    }
}

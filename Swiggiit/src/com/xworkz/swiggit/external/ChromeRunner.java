package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Chrome;

public class ChromeRunner {
    public static void main(String[] args) {
        Chrome chrome = new Chrome("Google, Outlook", "rk.personal@gmail.com", 2);
        System.out.println("Chrome to string: " + chrome.toString());
        System.out.println("Chrome HashCode: " + chrome.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(chrome));
        Chrome chrome1 = new Chrome("Google", "rk.personal@gmail.com", 1);
        Chrome chrome2 = new Chrome("Outlook", "rk.office@gmail.com", 1);

        System.out.println("Are at same location or not: " + (chrome1 == chrome2));
        boolean value = chrome2.equals(chrome);
        System.out.println("Are both Chrome accounts the same? " + value);
    }
}

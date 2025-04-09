package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Gmail;

public class GmailRunner {
    public static void main(String[] args) {
        Gmail gmail = new Gmail("rkofficial@gmail.com", "RK", true);
        System.out.println("Gmail to string: " + gmail.toString());
    }
}

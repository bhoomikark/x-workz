package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.seventeenth.*;

public class SeventeenthRunner {
    public static void main(String[] args) {
        LoginSystem system = new UserLogin();
        system.login();
        system.validate();
        system.logout();
        system.enterDetails();
    }
}

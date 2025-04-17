package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirty.*;

public class ThirtyRunner {
    public static void main(String[] args) {
        Authentication auth = new UserAuthentication();
        auth.login();
        auth.logout();
        auth.resetPassword();
    }
}

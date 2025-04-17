package com.xworkz.interfaceease.internal.thirty;

public interface Authentication {
    void login();
    void logout();
    void resetPassword();
    default void writeEmail()
    {
        System.out.println("Write email -- default");
    }
}

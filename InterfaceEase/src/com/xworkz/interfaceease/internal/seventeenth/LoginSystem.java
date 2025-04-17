package com.xworkz.interfaceease.internal.seventeenth;

public interface LoginSystem {
    void login();

    void validate();

    void logout();

    default void enterDetails() {
        System.out.println("Enter details -- default");
    }
}




































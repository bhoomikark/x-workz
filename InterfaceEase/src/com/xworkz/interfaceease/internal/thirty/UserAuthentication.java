package com.xworkz.interfaceease.internal.thirty;

public class UserAuthentication implements Authentication {
    @Override
    public void login() {
        System.out.println("User logged in successfully.");
    }

    @Override
    public void logout() {
        System.out.println("User logged out successfully.");
    }

    @Override
    public void resetPassword() {
        System.out.println("User's password reset successfully.");
    }
}

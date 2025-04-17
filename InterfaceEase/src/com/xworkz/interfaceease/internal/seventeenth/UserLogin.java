package com.xworkz.interfaceease.internal.seventeenth;

public class UserLogin implements LoginSystem {
    @Override
    public void login() {
        System.out.println("User logged in.");
    }
    @Override
    public void validate() {
        System.out.println("User credentials validated.");
    }
    @Override
    public void logout() {
        System.out.println("User logged out.");
    }
    @Override
    public void enterDetails() {
        System.out.println("Enter details -- UserLogin");
    }
}

package com.xworkz.late.internal.uupackage;

public class SessionImpl implements Session {
    public SessionImpl() {
        super();
        System.out.println("No-arg constructor of SessionImpl");
    }

    @Override
    public void startSession() {
        System.out.println("Overriding Session - Starting session");
    }
}

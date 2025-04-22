package com.xworkz.late.external.uupackage;

import com.xworkz.late.internal.uupackage.Session;

public class UserSession {
    Session session;

    public UserSession(Session session) {
        System.out.println("Parameterized constructor of UserSession");
        this.session = session;
    }

    public void launch() {
        if (session != null) {
            session.startSession();
        } else {
            System.out.println("Session is null");
        }
    }
}

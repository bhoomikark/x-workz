package com.xworkz.late.runner;

import com.xworkz.late.internal.uupackage.*;
import com.xworkz.late.external.uupackage.*;

public class UserSessionRunner {
    public static void main(String[] args) {
        Session session = new SessionImpl();
        UserSession userSession = new UserSession(session);
        userSession.launch();
    }
}

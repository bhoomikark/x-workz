
package com.xworkz.late.internal.jjpackage;

public class UserImpl implements User {
    public UserImpl() {
        super();
        System.out.println("No-arg constructor of UserImpl");
    }

    @Override
    public void login() {
        System.out.println("Overriding User - User logged in");
    }
}


package com.xworkz.late.runner;

import com.xworkz.late.internal.jjpackage.*;
import com.xworkz.late.external.jjpackage.*;

public class ProfileRunner {
    public static void main(String[] args) {
        User user = new UserImpl();
        Profile profile = new Profile(user);
        profile.display();
    }
}

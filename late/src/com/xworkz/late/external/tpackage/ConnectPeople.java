// tpackage external
package com.xworkz.late.external.tpackage;

import com.xworkz.late.internal.tpackage.Bridge;

public class ConnectPeople {
    Bridge bridge;

    public ConnectPeople(Bridge bridge) {
        System.out.println("Running parameterized constructor of ConnectPeople");
        this.bridge = bridge;
    }

    public void useBridge() {
        if (this.bridge != null) {
            this.bridge.connect();
        } else {
            System.out.println("No bridge available to connect people");
        }
    }
}

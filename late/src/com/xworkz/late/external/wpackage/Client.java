
package com.xworkz.late.external.wpackage;

import com.xworkz.late.internal.wpackage.Gmail;

public class Client {
    Gmail gmail;

    public Client(Gmail gmail) {
        System.out.println("Running parameterized constructor of Client");
        this.gmail = gmail;
    }

    public void receive() {
        if (gmail != null) {
            gmail.send();
        } else {
            System.out.println("Gmail not available for communication");
        }
    }
}

// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.wpackage.*;
import com.xworkz.late.external.wpackage.*;

public class ClientRunner {
    public static void main(String[] args) {
        Gmail gmail = new Company();
        Client client = new Client(gmail);
        client.receive();
    }
}

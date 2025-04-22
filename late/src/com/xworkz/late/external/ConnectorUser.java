package com.xworkz.late.external;

import com.xworkz.late.internal.Connector;

public class ConnectorUser {
    Connector connector;

    public ConnectorUser(Connector connector) {
        this.connector = connector;
        System.out.println("Running Parameterized constructor");
    }

    public void execute() {
        if (connector != null) {
            this.connector.run();
            System.out.println("Running method run in ConnectorUser");
        } else {
            System.out.println("is null");
        }
    }
}

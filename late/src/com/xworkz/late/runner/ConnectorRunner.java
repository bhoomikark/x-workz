package com.xworkz.late.runner;

import com.xworkz.late.external.ConnectorUser;
import com.xworkz.late.internal.Connector;
import com.xworkz.late.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        //class
        Connector connector=new ConnectorImpl();
        //class: knowledge about impl class
        ConnectorUser connectorUser=new ConnectorUser(connector);//abstraction
        connectorUser.execute();
    }
}

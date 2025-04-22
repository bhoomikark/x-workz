package com.xworkz.late.internal;

public class ConnectorImpl implements Connector{
    public ConnectorImpl()
    {
        super();
        System.out.println("no arg constructor of ConnectorImpl");
    }

    @Override
    public void run() {
        System.out.println("overriding connector method in connectorimpl");
    }
}

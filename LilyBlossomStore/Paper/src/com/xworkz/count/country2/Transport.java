package com.xworkz.count.country2;

public class Transport {
    String type;
    int capacity;
    String route;
    boolean operational;

    public Transport(String type, int capacity, String route, boolean operational) {
        this.type = type;
        this.capacity = capacity;
        this.route = route;
        this.operational = operational;
    }

    void display() {
        System.out.println("Transport: Type=" + type + ", Capacity=" + capacity + ", Route=" + route + ", Operational=" + operational);
    }
}

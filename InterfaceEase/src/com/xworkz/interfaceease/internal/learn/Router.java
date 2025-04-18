package com.xworkz.interfaceease.internal.learn;

public class Router{
    public void work()
    {
        System.out.println("work method inside router");
    }
    public void work(int costOfRouter)
    {
        System.out.println("cost is: "+costOfRouter);
    }
    public void work(int cost,String brand)
    {
        System.out.println(cost+" "+brand);
    }
    public void work(String brand,int cost)
    {
        System.out.println("brand and cost is: "+cost +brand);
    }
}

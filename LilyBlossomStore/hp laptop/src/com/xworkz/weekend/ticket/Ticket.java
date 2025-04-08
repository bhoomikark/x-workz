package com.xworkz.weekend.ticket;

public class Ticket {
    enum TicketType{Regular, Premium,VIP}
    TicketType getType()
    {
        return TicketType.Regular;

    }
    public void cost()
    {
        System.out.println("================================");
        System.out.println("Running cost in Ticket");
        System.out.println("================================");

        System.out.println("Enter cost of tickets");
        System.out.println("1. Regular -- 1000");
        System.out.println("2. Premium -- 2000");
        System.out.println("3.VIP -- 3000");

    }
   public void buy()
    {
        System.out.println("================================");
        System.out.println("Running buy in Ticket");
        System.out.println("================================");
System.out.println("Buy the ticket which costs 1000 rupees");
    }
   public void sell()
    {
        System.out.println("================================");
        System.out.println("Running sell in Ticket");
        System.out.println("================================");
        System.out.println("The authority is selling 1000 rupee ticket for 500");
    }
    }


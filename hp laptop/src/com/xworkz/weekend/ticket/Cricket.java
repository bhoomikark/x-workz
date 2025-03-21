package com.xworkz.weekend.ticket;

public class Cricket {
    Ticket ticket;
    public Cricket(Ticket ticket)
    {
        System.out.println("Running Ticket class in Cricket");
        this.ticket=ticket;
    }
    public void watch()
    {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Running watch in Cricket");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("there are 1.5 million PEOPLE watching cricket");
        System.out.println("Using buy method from ticket");
        if(this.ticket!=null)
        {
            this.ticket.buy();
        }
        else
        {
            System.out.println("No tickets to buy");
        }
    }
   public void profit()
    {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Running Profit in cricket");
        System.out.println("using sell method from ticket");
        System.out.println("+++++++++++++++++++++++++++++++");
        if(this.ticket!=null)
        {
            this.ticket.sell();
        }
        else {
            System.out.println("There is no tickets to sell");
        }



    }
}

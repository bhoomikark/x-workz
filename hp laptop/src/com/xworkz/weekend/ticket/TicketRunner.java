package com.xworkz.weekend.ticket;

public class TicketRunner {
    public static void main(String[] args)
    {
        Ticket ticket=new Ticket();
        Cricket cricket=new Cricket(ticket);
        cricket.watch();
        cricket.profit();

    }
}

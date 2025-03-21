package com.xworkz.weekend.brush;

import com.xworkz.weekend.clip.Clip;
import com.xworkz.weekend.ticket.Cricket;
import com.xworkz.weekend.ticket.Ticket;

public class Virat {
    Brush brush;
    Clip clip;
    Ticket ticket;
    Cricket cricket;

    public Virat(Brush brush, Clip clip, Ticket ticket, Cricket cricket) {
        this.brush = brush;
        this.clip = clip;
        this.ticket = ticket;
        this.cricket = cricket;
    }



    void UseBrush()
    {
        if(brush!=null)
        {
            System.out.println("There are brushes");
            this.brush.getColor();
        }
        else {
            System.out.println("Error");
        }

    }

    Virat(Clip clip, Ticket ticket, Cricket cricket)
    {
        this.clip=clip;
        this.ticket=ticket;
        this.cricket=cricket;
    }
    void play()
    {
        if(cricket!=null)
        {
            this.cricket.watch();
            this.cricket.profit();

        }
        else {
            System.out.println("Error");
        }
    }
    void clean()
    {
        if(brush!=null)
        {
            this.brush.getColor();
            this.brush.clean();
            this.brush.scrub();
        }
        else {
            System.out.println("Error");
        }
    }
    void relax()
    {
        if(ticket!=null)
        {
            this.ticket.cost();
            this.ticket.buy();
            this.ticket.sell();
        }
        else {
            System.out.println("Error");
        }
    }
}

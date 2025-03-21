package com.xworkz.weekend.brush;

import com.xworkz.weekend.clip.Clip;
import com.xworkz.weekend.ticket.Cricket;
import com.xworkz.weekend.ticket.Ticket;

public class BrushRunner {
    public static void main(String[] args)
    {
        Brush brush=new Brush();
        Clip clip=new Clip();
        Ticket ticket=new Ticket();
        Cricket cricket=new Cricket(ticket);
        Virat virat=new Virat(brush,clip,ticket,cricket);
        virat.UseBrush();
        virat.play();
        virat.clean();
        virat.relax();

    }
}

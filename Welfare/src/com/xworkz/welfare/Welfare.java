package com.xworkz.welfare;


import javax.sound.sampled.LineUnavailableException;
import java.security.acl.LastOwnerException;

public class Welfare {
    public void checkedEvent() throws LastOwnerException, LineUnavailableException
    {
        if(true)
        {
            System.out.println("Run Error");
            throw new LastOwnerException();

        }
        else throw new LineUnavailableException();
    }


}

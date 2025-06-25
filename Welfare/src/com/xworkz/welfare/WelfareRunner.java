package com.xworkz.welfare;

import javax.sound.sampled.LineUnavailableException;
import java.security.acl.LastOwnerException;

public class WelfareRunner {
    public static void main(String[] args) throws LineUnavailableException, LastOwnerException {
        Welfare welfare=new Welfare();
        welfare.checkedEvent();
    }
}

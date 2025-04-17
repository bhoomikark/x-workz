package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.sixtytwo.*;

public class SixtyTwoRunner {
    public static void main(String[] args) {
        MediaPlayer mp = new VLCPlayer();
        mp.loadMedia();
        mp.playMedia();
        mp.stopMedia();
        mp.pauseMediaplay();
    }
}

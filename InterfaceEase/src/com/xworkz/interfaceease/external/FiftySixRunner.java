package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftysix.*;

public class FiftySixRunner {
    public static void main(String[] args) {
        VideoPlayer player = new VLCPlayer();
        player.loadVideo();
        player.playVideo();
        player.stopVideo();
    }
}

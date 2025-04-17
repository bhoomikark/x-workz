package com.xworkz.interfaceease.internal.twelve;

public class PDFDownload implements Downloadable{
    @Override
    public void startDownload() {
        System.out.println("start Download -- downloadable -- File Manager");
    }

    @Override
    public void pauseDownload() {
        System.out.println("pause Download -- downloadable -- File Manager");
    }

    @Override
    public void completeDownload() {
        System.out.println("complete Download -- downloadable -- File Manager");
    }
}

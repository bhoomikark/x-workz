package com.xworkz.interfaceease.internal.twelve;

public class Downloader implements Downloadable,Uploadable{
    @Override
    public void startDownload() {
        System.out.println("start Download -- downloadable -- Downloader");
    }

    @Override
    public void pauseDownload() {
        System.out.println("pause Download -- downloadable -- Downloader");
    }

    @Override
    public void completeDownload() {
        System.out.println("complete Download -- downloadable -- Downloader");
    }

    @Override
    public void startUpload() {
        System.out.println("start upload -- uploadable -- Downloader");
    }

    @Override
    public void pauseUpload() {
        System.out.println("pause upload -- uploadable -- Downloader");
    }

    @Override
    public void completeUpload() {
        System.out.println("complete upload -- uploadable -- Downloader");
    }
}

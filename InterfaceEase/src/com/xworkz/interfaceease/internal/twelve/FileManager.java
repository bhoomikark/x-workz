package com.xworkz.interfaceease.internal.twelve;

public class FileManager implements Downloadable,Uploadable{
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

    @Override
    public void startUpload() {
        System.out.println("start upload -- uploadable -- File Manager");
    }

    @Override
    public void pauseUpload() {
        System.out.println("pause upload -- uploadable -- File Manager");
    }

    @Override
    public void completeUpload() {
        System.out.println("complete upload -- uploadable -- File Manager");
    }
}

package com.xworkz.interfaceease.internal.twelve;

public class Uploader implements Uploadable{
    @Override
    public void startUpload() {
        System.out.println("start upload -- uploadable -- uploader");
    }

    @Override
    public void pauseUpload() {
        System.out.println("pause upload -- uploadable -- Uploader");
    }

    @Override
    public void completeUpload() {
        System.out.println("complete upload -- uploadable -- Uploader");
    }
@Override
    public void upload()
    {
        System.out.println("upload -- Uploader");
    }
}

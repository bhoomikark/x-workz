package com.xworkz.interfaceease.internal.twelve;

public interface Uploadable {
    void startUpload();
    void pauseUpload();
    void completeUpload();
    default void upload()
    {
        System.out.println("upload -- default");
    }
}

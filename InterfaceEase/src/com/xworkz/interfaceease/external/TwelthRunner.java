package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twelve.*;

public class TwelthRunner {
    public static void main(String[] args) {
        System.out.println("Running Uploadable from Uploader class");
        Uploadable uploadable=new Uploader();
        uploadable.startUpload();
        uploadable.pauseUpload();
        uploadable.completeUpload();
        uploadable.upload();
        Downloadable downloadable2=new PDFDownload();
        downloadable2.startDownload();
        downloadable2.pauseDownload();
        downloadable2.completeDownload();
        downloadable2.clickDownload();
        System.out.println("========================================");
        System.out.println("2 copies from 2 subclasses");
        Uploadable uploadable1=new Downloader();
        uploadable1.startUpload();
        uploadable1.pauseUpload();
        uploadable1.completeUpload();
        Downloadable downloadable=new Downloader();
        downloadable.startDownload();
        downloadable.pauseDownload();
        downloadable.completeDownload();
        Uploadable uploadable2=new FileManager();
        uploadable2.startUpload();
        uploadable2.pauseUpload();
        uploadable2.completeUpload();
        Downloadable downloadable1=new FileManager();
        downloadable1.startDownload();
        downloadable1.pauseDownload();
        downloadable1.completeDownload();


    }
}

package com.xworkz.swiggit.internal;

public class ITWorker {
    private String itWorkerName;
    private String itWorkerJob;
    private String itWorkerDomain;

    public ITWorker(String itWorkerName, String itWorkerJob, String itWorkerDomain) {
        this.itWorkerName = itWorkerName;
        this.itWorkerJob = itWorkerJob;
        this.itWorkerDomain = itWorkerDomain;
        System.out.println("68. Running ITWorker Constructor");
    }

    @Override
    public String toString() {
        return "IT Worker Name: " + itWorkerName +
                ", Job: " + itWorkerJob +
                ", Domain: " + itWorkerDomain;
    }
}

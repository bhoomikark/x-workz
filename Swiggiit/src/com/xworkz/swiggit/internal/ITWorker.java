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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 303;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof ITWorker) {
                ITWorker otherWorker = (ITWorker) obj;
                if (this.itWorkerName.equals(otherWorker.itWorkerName) &&
                        this.itWorkerJob.equals(otherWorker.itWorkerJob) &&
                        this.itWorkerDomain.equals(otherWorker.itWorkerDomain)) {
                    System.out.println("Both IT Workers are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

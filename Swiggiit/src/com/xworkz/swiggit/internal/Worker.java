package com.xworkz.swiggit.internal;

public class Worker {
    private String workerName;
    private String workerDomain;
    private int noOfWorkers;

    public Worker(String workerName, String workerDomain, int noOfWorkers) {
        this.workerName = workerName;
        this.workerDomain = workerDomain;
        this.noOfWorkers = noOfWorkers;
        System.out.println("67. Running Worker Constructor");
    }

    @Override
    public String toString() {
        return "Worker Name: " + workerName +
                ", Domain: " + workerDomain +
                ", Number of Workers: " + noOfWorkers;
    }
    @Override
    public int hashCode() {
        return 12;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Worker) {
            Worker other = (Worker) obj;
            return this.workerName.equals(other.workerName) && this.workerDomain.equals(other.workerDomain);
        }
        return false;
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.ITWorker;

public class ITWorkerRunner {
    public static void main(String[] args) {
        ITWorker worker = new ITWorker("Sneha", "Backend Developer", "Healthcare");
        System.out.println(worker);
    }
}

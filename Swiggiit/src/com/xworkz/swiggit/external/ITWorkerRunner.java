package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.ITWorker;

public class ITWorkerRunner {
    public static void main(String[] args) {
        ITWorker worker = new ITWorker("Sneha", "Backend Developer", "Healthcare");
        System.out.println(worker);
        System.out.println("Overridden HashCode: " + worker.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(worker));
        ITWorker worker1 = new ITWorker("Sneha", "Backend Developer", "Healthcare");
        ITWorker worker2 = new ITWorker("Sneha", "Backend Developer", "Healthcare");
        ITWorker worker3 = new ITWorker("Raj", "Frontend Developer", "Finance");
        System.out.println("Are Worker1 and Worker2 equal? " + worker1.equals(worker2));
        System.out.println("Are Worker1 and Worker3 equal? " + worker1.equals(worker3));
    }
}

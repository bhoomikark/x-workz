package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Worker;

public class WorkerRunner {
    public static void main(String[] args) {
        Worker worker = new Worker("Ramesh", "Construction", 15);
        System.out.println(worker);
        System.out.println("Overridden HashCode: " + worker.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(worker));
        Worker worker1 = new Worker("Ramesh", "Construction", 15);
        Worker worker2 = new Worker("Ramesh", "Construction", 20);
        Worker worker3 = new Worker("Suresh", "Engineering", 30);

        System.out.println("worker1.equals(worker2)? " + worker1.equals(worker2));
        System.out.println("worker1.equals(worker3)? " + worker1.equals(worker3));
    }
}

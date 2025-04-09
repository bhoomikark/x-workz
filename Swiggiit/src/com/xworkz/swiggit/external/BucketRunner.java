package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket("Blue", "Cello", "Round");
        System.out.println("Bucket to string: " + bucket.toString());
    }
}

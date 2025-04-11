package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket("Blue", "Cello", "Round");
        System.out.println("Bucket to string: " + bucket.toString());
        System.out.println("Bucket HashCode: " + bucket.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(bucket));
    }
}

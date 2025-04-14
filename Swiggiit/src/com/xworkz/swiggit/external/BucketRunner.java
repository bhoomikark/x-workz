package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket("Blue", "Cello", "Round");
        System.out.println("Bucket to string: " + bucket.toString());
        System.out.println("Bucket HashCode: " + bucket.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(bucket));
        Bucket bucket1 = new Bucket("Red", "Plastic", "Square");
        Bucket bucket2 = new Bucket("Blue", "Cello", "Round");

        System.out.println("Are at same location or not: " + (bucket1 == bucket2));
        boolean value = bucket2.equals(bucket);
        System.out.println("Are both buckets same? " + value);
    }
}

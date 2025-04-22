package com.xworkz.late.external.ttpackage;

import com.xworkz.late.internal.ttpackage.Review;

public class Feedback {
    Review review;

    public Feedback(Review review) {
        System.out.println("Parameterized constructor of Feedback");
        this.review = review;
    }

    public void showFeedback() {
        if (review != null) {
            review.writeReview();
        } else {
            System.out.println("No review available");
        }
    }
}

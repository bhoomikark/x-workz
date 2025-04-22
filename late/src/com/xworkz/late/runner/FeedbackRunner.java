package com.xworkz.late.runner;

import com.xworkz.late.internal.ttpackage.*;
import com.xworkz.late.external.ttpackage.*;

public class FeedbackRunner {
    public static void main(String[] args) {
        Review review = new ReviewImpl();
        Feedback feedback = new Feedback(review);
        feedback.showFeedback();
    }
}

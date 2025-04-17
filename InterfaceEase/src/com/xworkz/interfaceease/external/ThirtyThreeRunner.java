package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtythree.*;

public class ThirtyThreeRunner {
    public static void main(String[] args) {
        CustomerSupport support = new TechSupport();
        support.resolveIssue();
        support.provideFeedback();
        support.escalateIssue();
        support.callCustomerCare();
    }
}

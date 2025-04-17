package com.xworkz.interfaceease.internal.thirtythree;

public interface CustomerSupport {
    void resolveIssue();
    void provideFeedback();
    void escalateIssue();
    default void callCustomerCare()
    {
        System.out.println("call customer care");
    }
}

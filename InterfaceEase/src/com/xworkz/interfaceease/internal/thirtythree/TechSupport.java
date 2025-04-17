package com.xworkz.interfaceease.internal.thirtythree;

public class TechSupport implements CustomerSupport {
    @Override
    public void resolveIssue() {
        System.out.println("Resolving customer's technical issue.");
    }

    @Override
    public void provideFeedback() {
        System.out.println("Providing feedback on the issue resolution.");
    }

    @Override
    public void escalateIssue() {
        System.out.println("Escalating the issue to a higher support tier.");
    }
@Override
    public void callCustomerCare()
    {
        System.out.println("call customer care -- tech support");
    }
}


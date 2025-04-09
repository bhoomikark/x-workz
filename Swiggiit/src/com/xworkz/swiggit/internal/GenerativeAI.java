package com.xworkz.swiggit.internal;

public class GenerativeAI {
    private String namesOfGenAI;
    private String taskOfAI;
    private String modelType;

    public GenerativeAI(String namesOfGenAI, String taskOfAI, String modelType) {
        this.namesOfGenAI = namesOfGenAI;
        this.taskOfAI = taskOfAI;
        this.modelType = modelType;
        System.out.println("27. Running GenerativeAI Constructor");
    }

    @Override
    public String toString() {
        return "Names of Generative AI: " + namesOfGenAI + ", Task of AI: " + taskOfAI +
                ", Model Type: " + modelType;
    }
}

package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.GenerativeAI;

public class GenerativeAIRunner {
    public static void main(String[] args) {
        GenerativeAI ai = new GenerativeAI("ChatGPT, DALL·E, Bard", "Text & Image Generation", "Transformer-based");
        System.out.println("Generative AI to string: " + ai.toString());

    GenerativeAI ai1 = new GenerativeAI("ChatGPT, DALL·E, Bard", "Text & Image Generation", "Transformer-based");
    GenerativeAI ai2 = new GenerativeAI("ChatGPT, DALL·E, Bard", "Text & Image Generation", "Transformer-based");
    boolean areSame = ai1.equals(ai2);
        System.out.println("Are both Generative AI objects equal? " + areSame);
}

}
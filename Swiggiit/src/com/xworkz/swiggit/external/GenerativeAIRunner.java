package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.GenerativeAI;

public class GenerativeAIRunner {
    public static void main(String[] args) {
        GenerativeAI ai = new GenerativeAI("ChatGPT, DALL·E, Bard", "Text & Image Generation", "Transformer-based");
        System.out.println("Generative AI to string: " + ai.toString());}
        @Override
        public int hashCode() {
            System.out.println("Default HashCode: " + super.hashCode());
            return 444;
    }
}

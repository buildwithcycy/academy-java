package com.bptn.course._10_wordFrequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";
        
        // Split the sentence into words using split() method
        String[] words = sentence.split(" ");
        

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}

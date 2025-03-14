/*
========================================
Subject: Nauka Java --- zadanie z rekrutacji
Description: Program to calculate the frequency of each character in a given string.
    - "0000Abcdee" -> {"0": 0.4, "A": 0.1, "b": 0.1, "c": 0.1, "d": 0.1, "e": 0.2, }
Date: 07/09/2023
========================================
*/


import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main { // class name must be the same as the file name
    public static void main(String[] args) { // main method
        String input = "0000Abcdee"; // example input

        HashMap<Character, Integer> counts = new HashMap<>(); // create a hashmap to store the counts of each character

        for (int i = 0; i <input.length(); i++) { // loop through the input string
            char c = input.charAt(i); // get the character at the current index
            counts.put(c, counts.getOrDefault(c, 0) + 1); // increment the count of the character in the hashmap
        }

        int total = input.length(); // get the total number of characters in the input string
        LinkedHashMap<Character, Double> frequency = new LinkedHashMap<>(); // create a linked hash map to store the frequency of each character

        for (int i = 0; i < input.length(); i++) { // loop through the input string
            char c = input.charAt(i); // get the character at the current index
            if (!frequency.containsKey(c)) { // if the character is not in the frequency map
                double freq = counts.get(c) / (double) total; // calculate the frequency of the character
                frequency.put(c, freq); // add the character and its frequency to the frequency map
            }
        }
    System.out.println(frequency); // print the frequency map
    }
}

// To add inputing form the user, we can System.in.readLine("Podaj ciąg znaków") to read a string from the user.
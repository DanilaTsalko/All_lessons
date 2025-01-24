package lesson_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Orange", "Apple",
                "Blueberry", "Banana", "Soup", "Chicken",
                "Jelly", "Cake", "Banana", "Pork"};

        Set<String> UniqueWords = new HashSet<>();
        for(String word : words){
            UniqueWords.add(word);
        }
        System.out.println("Unique word: " + UniqueWords);


        Map<String, Integer> howManyTimes = new HashMap<>();
        for(String word : words) {
            howManyTimes.put(word, howManyTimes.getOrDefault(word, 0)+1);
        }
        System.out.println("How many times: " + howManyTimes);
    }
}
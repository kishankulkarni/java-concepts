package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedWordInString {

    public static void main(String[] args) {
        String word = "How do you do";
        String[] splitWord = word.split(" ");
        Optional<String> firstNonRepWord = Arrays.stream(splitWord)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();
        if (firstNonRepWord.isPresent()) {
            System.out.println(firstNonRepWord.get());
        } else {
            System.out.println("No unique word found!!");
        }
    }
}

package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLeastRepeatedWordInString {

    public static void main(String[] args) {
        String word = "gali gali sim sim";
        String[] splitWord = word.split(" ");
        Map<String, Long> leastRepWord = Arrays.stream(splitWord)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                //The part oldValue, newValue) -> newValue is because of mergeFunction when find duplicate keys, it returns value of second key which found
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue(), (oldValue, newValue) -> newValue, LinkedHashMap::new));

        Long leastCount = leastRepWord.values().iterator().next();
        leastRepWord.forEach((k, v) -> {
            if (v == leastCount) {
                System.out.println(k+" count is:"+v);
            }
        });
    }
}
